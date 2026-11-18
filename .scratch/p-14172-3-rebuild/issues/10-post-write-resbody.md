# 10: PostWriteResBody 도입

**What to build:** 글 작성 응답에 작성된 글과 totalCount가 함께 온다.

**강의 범위:** 25강 (강사 리포 jhs512/p-14172-2 해당 태그 참고)

**Blocked by:** 09번 티켓

**Status:** ready-for-agent

- [x] 전용 응답본문 PostWriteResBody(post, totalCount)를 RsData data에 담음
- [x] 서버를 띄우고 curl로 관련 엔드포인트를 호출해 응답을 사용자에게 보여줌
- [x] 진행상황과 변경사항을 사용자에게 보고하고, "커밋해"라는 말을 들은 뒤에만 커밋
- [x] 커밋 제목 `010. PostWriteResBody 도입` 형식(번호·점·공백·내용, 강의범위 없음) + 한국어 상세 bullet 본문
- [x] 태그 `010`을 달고 커밋과 태그를 즉시 push

## Comments

- 2026-11-18: 완료. 태그 010
