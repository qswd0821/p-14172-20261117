# 01: 프로젝트 초기 세팅

**What to build:** 빈 Spring Boot 프로젝트가 git 리포로 관리되고 GitHub(qswd0821/p-14172-3, public)에 올라간다. JPA·validation·H2가 추가되고 글/댓글 엔티티와 샘플 데이터(글 3개와 댓글들)가 앱 시작 시 생성되어 H2 콘솔에서 확인된다.

**강의 범위:** 1~3강 (강사 리포 jhs512/p-14172-2 해당 태그 참고)

**Blocked by:** None (can start immediately)

**Status:** ready-for-agent

- [x] git init, .gitignore에 H2 파일(db_dev.*) 추가
- [x] GitHub 리포 qswd0821/p-14172-3(public) 생성 및 origin 연결
- [x] JPA·validation·H2 의존성, 개발용 H2 파일 DB(MODE=MySQL)와 H2 콘솔 설정
- [x] 글(Post)·댓글(PostComment) 엔티티(id, 생성일, 수정일 공통) 및 양방향 관계
- [x] 앱 시작 시 샘플 데이터 생성
- [x] 앱이 Java 25로 정상 기동
- [x] 서버를 띄우고 curl로 관련 엔드포인트를 호출해 응답을 사용자에게 보여줌
- [x] 진행상황과 변경사항을 사용자에게 보고하고, "커밋해"라는 말을 들은 뒤에만 커밋
- [x] 커밋 제목 `001. 프로젝트 초기 세팅` 형식(번호·점·공백·내용, 강의범위 없음) + 한국어 상세 bullet 본문
- [x] 태그 `001`을 달고 커밋과 태그를 즉시 push

## Comments

- 2026-11-18: 완료. 커밋 0c74329, 태그 001, https://github.com/qswd0821/p-14172-3
