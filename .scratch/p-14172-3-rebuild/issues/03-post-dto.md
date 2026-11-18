# 03: PostDto 도입

**What to build:** 글 조회 응답이 엔티티가 아닌 PostDto(record)로 나가 API 계약이 엔티티와 분리된다.

**강의 범위:** 7~9강 (강사 리포 jhs512/p-14172-2 해당 태그 참고)

**Blocked by:** 02번 티켓

**Status:** ready-for-agent

- [x] PostDto record 도입, 글 조회 API가 PostDto 반환
- [x] 필드 이름은 id, createDate, modifyDate, title, content (엔티티 이름 변경 없음)
- [x] 변환은 메서드 참조(PostDto::new) 형태
- [x] 서버를 띄우고 curl로 관련 엔드포인트를 호출해 응답을 사용자에게 보여줌
- [x] 진행상황과 변경사항을 사용자에게 보고하고, "커밋해"라는 말을 들은 뒤에만 커밋
- [x] 커밋 제목 `003. PostDto 도입` 형식(번호·점·공백·내용, 강의범위 없음) + 한국어 상세 bullet 본문
- [x] 태그 `003`을 달고 커밋과 태그를 즉시 push

## Comments

- 2026-11-18: 완료. 태그 003
