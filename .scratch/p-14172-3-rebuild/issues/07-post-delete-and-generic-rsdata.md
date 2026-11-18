# 07: 글 삭제 API와 RsData 범용화

**What to build:** 글을 삭제하면 그 글의 댓글도 함께 지워지고, RsData가 제네릭이 되어 글/댓글 어떤 응답에도 쓰인다.

**강의 범위:** 16~19강 (강사 리포 jhs512/p-14172-2 해당 태그 참고)

**Blocked by:** 06번 티켓

**Status:** ready-for-agent

- [x] GET /api/v1/posts/{id}/delete 로 글 삭제, cascade로 댓글 선삭제
- [x] RsData에 제네릭 적용(중간 단계 ForPostRsData/Object는 최종 코드에 남기지 않음)
- [x] data가 없는 응답은 RsData<Void>
- [x] 서버를 띄우고 curl로 관련 엔드포인트를 호출해 응답을 사용자에게 보여줌
- [x] 진행상황과 변경사항을 사용자에게 보고하고, "커밋해"라는 말을 들은 뒤에만 커밋
- [x] 커밋 제목 `007. 글 삭제 API와 RsData 범용화` 형식(번호·점·공백·내용, 강의범위 없음) + 한국어 상세 bullet 본문
- [x] 태그 `007`을 달고 커밋과 태그를 즉시 push

## Comments

- 2026-11-18: 완료. 태그 007
