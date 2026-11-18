# 14: 테스트 환경과 글 작성 테스트

**What to build:** 글 작성 API가 HTTP 요청 단위 통합 테스트로 검증된다.

**강의 범위:** 33강 (강사 리포 jhs512/p-14172-2 해당 태그 참고)

**Blocked by:** 13번 티켓

**Status:** ready-for-agent

- [x] 테스트 프로필(메모리 DB) 설정
- [x] ApiV1PostControllerTest, ApiV1PostCommentControllerTest 생성(@SpringBootTest, @ActiveProfiles("test"), @AutoConfigureMockMvc, @Transactional)
- [x] 글 작성 테스트: 요청 → 검증 2단계 구조, print()로 요청/응답 출력, 201 검증
- [x] 모킹 없음
- [x] Gradle 전체 테스트가 통과하는 것을 사용자에게 보여줌
- [x] 진행상황과 변경사항을 사용자에게 보고하고, "커밋해"라는 말을 들은 뒤에만 커밋
- [x] 커밋 제목 `014. 테스트 환경과 글 작성 테스트` 형식(번호·점·공백·내용, 강의범위 없음) + 한국어 상세 bullet 본문
- [x] 태그 `014`을 달고 커밋과 태그를 즉시 push

## Comments

- 2026-11-18: 완료. 태그 014
