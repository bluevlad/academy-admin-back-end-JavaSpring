Small Online Academy 백엔드 (Spring Boot)

프로젝트 소개
- 소규모 온라인 학원 시스템의 백엔드 서비스입니다.
- Spring Boot 3.x, MyBatis, MySQL을 사용하며, 게시판/회원/로그인/시험/사물함/대시보드 API를 제공합니다.

기술 스택
- Java 17, Spring Boot 3.2.0
- MyBatis 3.0.4, Spring JDBC
- MySQL Connector/J
- JJWT(io.jsonwebtoken) 기반 JWT 토큰 처리

프로젝트 구조(일부)
- src/main/java/com/academy
  - board, member, login, exam, locker, dashboard, menu, main 패키지의 API 및 서비스
  - common: CORSFilter, PaginationInfo, JwtUtil, DBUtil, Configurations 등 공통 유틸
- src/main/resources
  - mapper/*.xml: MyBatis 매퍼
  - application.properties: 애플리케이션 환경설정
- ddls/*.sql: 초기 스키마/데이터 스크립트

사전 준비물
- JDK 17 이상
- Maven 3.8+
- MySQL 8.x (로컬 127.0.0.1:3306, 스키마 acm_basic)

설정(application.properties)
- 기본 값은 로컬 개발 환경을 가정합니다.
- 주요 키
  - spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
  - spring.datasource.url=jdbc:mysql://127.0.0.1:3306/acm_basic
  - spring.datasource.username=root
  - spring.datasource.password=dnflskfk
  - mybatis.mapper-locations=classpath:/mapper/*.xml
  - pageUnit=10, pageSize=10
- 필요 시 데이터베이스 접속 정보를 환경에 맞게 수정하세요.

DB 초기화
1) MySQL에서 acm_basic 스키마를 생성합니다.
2) ddls/member.sql, ddls/board.sql 순으로 실행하여 테이블과 기본 데이터를 생성합니다.

빌드 및 실행
- 빌드: mvn clean package
- 실행: mvn spring-boot:run 또는 생성된 jar 실행
  - java -jar target/academy-0.0.1-SNAPSHOT.jar
 - 기본 포트: 8080

주요 API 엔드포인트(예시)
- 게시판(Board)
  - GET /api/board/getBoardList
  - GET /api/board/getBoardDetail
  - POST /api/board/insertBoard
  - POST /api/board/updateBoard
  - POST /api/board/deleteBoard
- 회원(Member)
  - GET /api/member/getMemberList
  - GET /api/member/getMemberDetail
  - GET /api/member/insertMember
  - GET /api/member/updateMember
  - GET /api/member/deleteMember
- 그 외 패키지: login, exam, locker, dashboard, menu 등 유사한 패턴으로 구성

연관 프론트엔드 참고 자료
- React Admin Template 참고: https://github.com/bluevlad/react/tree/main/datta-able-free-react-admin-template
- 관리자 화면(레거시 참조): https://github.com/bluevlad/Java/tree/master/Academy-egovframework

트러블슈팅
- 포트 충돌: 다른 프로세스가 8080 사용 시 server.port를 변경하거나 충돌 프로세스를 종료하세요.
- DB 연결 오류: application.properties의 URL/계정/비밀번호와 MySQL 서버 상태를 확인하세요.
- BOM 관련 컴파일 오류('\ufeff'): 소스 파일을 UTF-8 without BOM으로 저장하세요. (과거 Configurations.java, DBUtil.java에서 동일 이슈 해결)

참고 문서
- Maven: https://maven.apache.org/guides/index.html
- Spring Boot Maven Plugin: https://docs.spring.io/spring-boot/3.4.2/maven-plugin
- MyBatis: https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/
