# 06: RsData 도입

**What to build:** 댓글 삭제 응답이 resultCode·msg·data 공통 형식으로 온다.

**강의 범위:** 13~15강 (강사 리포 jhs512/p-14172-2 해당 태그 참고)

**Blocked by:** 05번 티켓

**Status:** ready-for-agent

- [x] RsData(resultCode, msg, data) 도입, resultCode는 "HTTP상태-세부코드" 형식
- [x] 댓글 삭제가 RsData 응답(data에 삭제된 댓글 정보)
- [x] 서버를 띄우고 curl로 관련 엔드포인트를 호출해 응답을 사용자에게 보여줌
- [x] 진행상황과 변경사항을 사용자에게 보고하고, "커밋해"라는 말을 들은 뒤에만 커밋
- [x] 커밋 제목 `006. RsData 도입` 형식(번호·점·공백·내용, 강의범위 없음) + 한국어 상세 bullet 본문
- [x] 태그 `006`을 달고 커밋과 태그를 즉시 push

## Comments

- 2026-11-18: 완료. 태그 006
