package com.back.domain.post.postComment.controller;

import com.back.domain.post.post.entity.Post;
import com.back.domain.post.post.service.PostService;
import com.back.domain.post.postComment.entity.PostComment;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ActiveProfiles("test")
@SpringBootTest
@AutoConfigureMockMvc
@Transactional
public class ApiV1PostCommentControllerTest {
    @Autowired
    private MockMvc mvc;
    @Autowired
    private PostService postService;

    @Test
    @DisplayName("댓글 작성")
    void t1() throws Exception {
        int postId = 1;

        ResultActions resultActions = mvc
                .perform(
                        post("/api/v1/posts/%d/comments".formatted(postId))
                                .contentType(MediaType.APPLICATION_JSON)
                                .content("""
                                        {
                                            "content": "댓글 new"
                                        }
                                        """)
                )
                .andDo(print());

        Post post = postService.findById(postId).get();
        PostComment postComment = post.getComments().getLast();

        resultActions
                .andExpect(handler().handlerType(ApiV1PostCommentController.class))
                .andExpect(handler().methodName("write"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.resultCode").value("201-1"))
                .andExpect(jsonPath("$.msg").value("%d번 댓글이 작성되었습니다.".formatted(postComment.getId())))
                .andExpect(jsonPath("$.data.id").value(postComment.getId()))
                .andExpect(jsonPath("$.data.content").value("댓글 new"));

        // 샘플 데이터에서 1번 글의 댓글은 3건이었다.
        assertThat(post.getComments()).hasSize(4);
        assertThat(postComment.getContent()).isEqualTo("댓글 new");
    }

    @Test
    @DisplayName("댓글 다건 조회")
    void t2() throws Exception {
        int postId = 1;

        ResultActions resultActions = mvc
                .perform(
                        get("/api/v1/posts/%d/comments".formatted(postId))
                )
                .andDo(print());

        List<PostComment> comments = postService.findById(postId).get().getComments();

        resultActions
                .andExpect(handler().handlerType(ApiV1PostCommentController.class))
                .andExpect(handler().methodName("getItems"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(comments.size()))
                .andExpect(jsonPath("$[0].id").value(comments.getFirst().getId()))
                .andExpect(jsonPath("$[0].content").value(comments.getFirst().getContent()));
    }

    @Test
    @DisplayName("댓글 단건 조회")
    void t3() throws Exception {
        int postId = 1;
        int id = 1;

        ResultActions resultActions = mvc
                .perform(
                        get("/api/v1/posts/%d/comments/%d".formatted(postId, id))
                )
                .andDo(print());

        PostComment postComment = postService.findById(postId).get().findCommentById(id).get();

        resultActions
                .andExpect(handler().handlerType(ApiV1PostCommentController.class))
                .andExpect(handler().methodName("getItem"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(postComment.getId()))
                .andExpect(jsonPath("$.content").value(postComment.getContent()));
    }
}
