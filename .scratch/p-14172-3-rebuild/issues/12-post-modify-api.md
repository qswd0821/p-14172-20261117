# 12: 글 수정 API

**What to build:** 프론트가 JSON 본문으로 글을 수정할 수 있다.

**강의 범위:** 31강 (강사 리포 jhs512/p-14172-2 해당 태그 참고)

**Blocked by:** 11번 티켓

**Status:** ready-for-agent

- [x] PUT /api/v1/posts/{id}, PostModifyReqBody
- [x] RsData의 statusCode는 @JsonIgnore로 JSON에서 숨김
- [x] 서버를 띄우고 curl로 관련 엔드포인트를 호출해 응답을 사용자에게 보여줌
- [x] 진행상황과 변경사항을 사용자에게 보고하고, "커밋해"라는 말을 들은 뒤에만 커밋
- [x] 커밋 제목 `012. 글 수정 API` 형식(번호·점·공백·내용, 강의범위 없음) + 한국어 상세 bullet 본문
- [x] 태그 `012`을 달고 커밋과 태그를 즉시 push

## Comments

- 2026-11-18: 완료. 태그 012
