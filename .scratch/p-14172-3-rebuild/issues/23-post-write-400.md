# 23: 잘못된 글 작성 400

**What to build:** 제목 누락·내용 누락·잘못된 JSON으로 글을 작성하면 RsData 형식의 400 응답이 온다.

**강의 범위:** 50~52강 (강사 리포 jhs512/p-14172-2 해당 태그 참고)

**Blocked by:** 22번 티켓

**Status:** ready-for-agent

- [x] MethodArgumentNotValidException → 400, msg는 "필드-코드-메시지" 정렬 목록
- [x] HttpMessageNotReadableException → 400
- [x] 세 케이스 테스트 통과
- [x] Gradle 전체 테스트가 통과하는 것을 사용자에게 보여줌
- [x] 진행상황과 변경사항을 사용자에게 보고하고, "커밋해"라는 말을 들은 뒤에만 커밋
- [x] 커밋 제목 `023. 잘못된 글 작성 400` 형식(번호·점·공백·내용, 강의범위 없음) + 한국어 상세 bullet 본문
- [x] 태그 `023`을 달고 커밋과 태그를 즉시 push

## Comments

- 2026-11-18: 완료. 태그 023
