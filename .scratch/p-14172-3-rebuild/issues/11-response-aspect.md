# 11: ResponseAspect로 HTTP 상태코드 반영

**What to build:** RsData를 반환하는 API의 실제 HTTP 상태코드가 resultCode 앞자리를 따른다(글 작성 201).

**강의 범위:** 27~28강 (강사 리포 jhs512/p-14172-2 해당 태그 참고)

**Blocked by:** 10번 티켓

**Status:** ready-for-agent

- [x] 글 작성 resultCode 201-1
- [x] ResponseEntity 대신 AOP(ResponseAspect)로 상태코드 설정
- [x] curl -i 로 201 상태코드 확인
- [x] 서버를 띄우고 curl로 관련 엔드포인트를 호출해 응답을 사용자에게 보여줌
- [x] 진행상황과 변경사항을 사용자에게 보고하고, "커밋해"라는 말을 들은 뒤에만 커밋
- [x] 커밋 제목 `011. ResponseAspect로 HTTP 상태코드 반영` 형식(번호·점·공백·내용, 강의범위 없음) + 한국어 상세 bullet 본문
- [x] 태그 `011`을 달고 커밋과 태그를 즉시 push

## Comments

- 2026-11-18: 완료. 태그 011
