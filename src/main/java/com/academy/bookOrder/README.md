# BookOrder (교재 주문) 패키지

교재 주문 관리를 위한 API를 제공합니다.

## 패키지 구조

```
bookOrder/
├── BookOrderController.java        # 교재 주문 컨트롤러
└── service/
    ├── BookOrderService.java       # 교재 주문 서비스 인터페이스
    └── impl/
        ├── BookOrderDAO.java       # 교재 주문 DAO
        └── BookOrderServiceImpl.java # 교재 주문 서비스 구현체
```

## 주요 기능

### BookOrderController
- **GET** `/bookOrder/list` - 교재 주문 목록 조회
- **GET** `/bookOrder/view` - 교재 주문 상세 조회
- **POST** `/bookOrder/save` - 교재 주문 등록
- **PUT** `/bookOrder/update` - 교재 주문 수정
- **DELETE** `/bookOrder/delete` - 교재 주문 삭제

### BookOrderService
- 교재 주문 CRUD 작업 처리
- 주문 상태 관리
- DAO를 통한 데이터베이스 연동

## 아키텍처

```
[Client]
   ↓
[BookOrderController] - Controller Layer
   ↓
[BookOrderServiceImpl] - Service Layer
   ↓
[BookOrderDAO] - DAO Layer
   ↓
[Database]
```

## 참고사항

- Legacy 아키텍처 패턴을 사용합니다 (향후 Modern 패턴으로 마이그레이션 예정)
- 모든 API는 세션 인증이 필요합니다
- 파일 다운로드 기능을 지원합니다
- 트랜잭션 관리가 필요한 작업에 적용됩니다
