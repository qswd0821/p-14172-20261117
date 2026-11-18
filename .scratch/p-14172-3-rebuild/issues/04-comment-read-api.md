# 04: 댓글 다건/단건 조회 API

**What to build:** 프론트가 특정 글의 댓글 목록과 특정 댓글을 JSON으로 받을 수 있다.

**강의 범위:** 10강 (강사 리포 jhs512/p-14172-2 해당 태그 참고)

**Blocked by:** 03번 티켓

**Status:** ready-for-agent

- [x] GET /api/v1/posts/{postId}/comments
- [x] GET /api/v1/posts/{postId}/comments/{id}
- [x] PostCommentDto로 응답
- [x] 서버를 띄우고 curl로 관련 엔드포인트를 호출해 응답을 사용자에게 보여줌
- [x] 진행상황과 변경사항을 사용자에게 보고하고, "커밋해"라는 말을 들은 뒤에만 커밋
- [x] 커밋 제목 `004. 댓글 다건/단건 조회 API` 형식(번호·점·공백·내용, 강의범위 없음) + 한국어 상세 bullet 본문
- [x] 태그 `004`을 달고 커밋과 태그를 즉시 push

## Comments

- 2026-11-18: 완료. 태그 004
