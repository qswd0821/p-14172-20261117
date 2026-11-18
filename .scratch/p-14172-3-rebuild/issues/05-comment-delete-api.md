# 05: 댓글 삭제 API

**What to build:** 개발 편의상 GET 경로로 호출해 특정 글의 댓글을 실제로 삭제할 수 있다.

**강의 범위:** 11~12강 (강사 리포 jhs512/p-14172-2 해당 태그 참고)

**Blocked by:** 04번 티켓

**Status:** ready-for-agent

- [x] GET /api/v1/posts/{postId}/comments/{id}/delete 로 댓글 삭제
- [x] @Transactional + orphanRemoval로 DB에서 실제 삭제됨
- [x] 서버를 띄우고 curl로 관련 엔드포인트를 호출해 응답을 사용자에게 보여줌
- [x] 진행상황과 변경사항을 사용자에게 보고하고, "커밋해"라는 말을 들은 뒤에만 커밋
- [x] 커밋 제목 `005. 댓글 삭제 API` 형식(번호·점·공백·내용, 강의범위 없음) + 한국어 상세 bullet 본문
- [x] 태그 `005`을 달고 커밋과 태그를 즉시 push

## Comments

- 2026-11-18: 완료. 태그 005
