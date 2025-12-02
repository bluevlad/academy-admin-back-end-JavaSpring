# ProductOrder (상품 주문) 패키지

상품 주문 관리를 위한 API를 제공합니다.

## 패키지 구조

```
productorder/
├── ProductOrderController.java        # 상품 주문 컨트롤러
└── service/
    ├── ProductOrderService.java       # 상품 주문 서비스 인터페이스
    └── impl/
        ├── ProductOrderDAO.java       # 상품 주문 DAO
        └── ProductOrderServiceImpl.java # 상품 주문 서비스 구현체
```

## 주요 기능

### ProductOrderController
- **GET** `/productOrder/list` - 상품 주문 목록 조회
- **GET** `/productOrder/view` - 상품 주문 상세 조회
- **POST** `/productOrder/save` - 상품 주문 등록
- **PUT** `/productOrder/update` - 상품 주문 수정
- **DELETE** `/productOrder/delete` - 상품 주문 삭제

### ProductOrderService
- 상품 주문 CRUD 작업 처리
- 주문 상태 관리
- 결제 정보 처리
- DAO를 통한 데이터베이스 연동

## 아키텍처

```
[Client]
   ↓
[ProductOrderController] - Controller Layer
   ↓
[ProductOrderServiceImpl] - Service Layer
   ↓
[ProductOrderDAO] - DAO Layer
   ↓
[Database]
```

## 사용 예시

```java
// 상품 주문 목록 조회
GET /productOrder/list?currentPage=1&pageRow=10&SEARCHTYPE=ORDER_STATUS&SEARCHTEXT=완료

// 상품 주문 등록
POST /productOrder/save
{
  "productId": "PROD001",
  "memberId": "USER001",
  "quantity": 2,
  "totalPrice": "50000",
  "orderStatus": "대기"
}
```

## 참고사항

- Legacy 아키텍처 패턴을 사용합니다 (향후 Modern 패턴으로 마이그레이션 예정)
- 모든 API는 세션 인증이 필요합니다
- 주문 상태는 단계별로 관리됩니다
- 트랜잭션 관리가 필요한 작업에 적용됩니다
- 결제 정보는 암호화되어 저장됩니다
