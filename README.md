# 키친포스

## 요구 사항

- 메뉴 그룹(항목)
  - [ ] 메뉴 그룹명이 있을 경우 메뉴 그룹을 생성할 수 있다.
  - [ ] 메뉴 그룹들을 모두 조회한다
- 메뉴
  - [ ] 전체 메뉴를 조회할 수 있다.
  - [ ] 메뉴 가격은 구성품들의 단품 가격 합보다 항상 저렴하다.
  - 메뉴 생성
    - [ ] 가격이 없거나, 음수일 경우 메뉴가 생성되지 않는다.
    - [ ] 메뉴항목(그룹)이 존재하지 않을 경우, 메뉴가 생성되지 않는다.
    - [ ] 메뉴 내 상품이 등록되어 있지 않다면 메뉴가 생성되지 않는다.
    - [ ] 메뉴 내에 구성 상품이 없다면 메뉴가 생성되지 않는다.
    - [ ] 상품 수량이 음수일 경우 메뉴가 생성되지 않는다.
    - [ ] 메뉴의 가격이 구성 상품의 가격보다 높을 경우 메뉴가 생성되지 않는다.
    - [ ] 메뉴명이 없을 경우 메뉴가 생성되지 않는다.
  - 메뉴 가격 변경
    - [ ] 가격이 없거나, 음수일 경우 가격 변경이 불가하다.
    - [ ] 메뉴 번호가 등록되어 있지 않으면 가격 변경이 불가하다.
    - [ ] 변경되는 가격이 메뉴의 구성 상품 가격의 합보다 높을 경우 가격 변경이 불가하다.
  - 메뉴 공개
    - [ ] 메뉴 번호가 존재하지 않을 경우 메뉴 공개 불가하다.
    - [ ] 메뉴 가격이 구성 상품의 단품 가격 합보다 높을 경우 메뉴 공개 불가하다.
  - 메뉴 비공개
    - [ ] 메뉴 번호가 존재한다면 메뉴를 비공개할 수 있다.
  
- 테이블
  - [ ] 가게에서 테이블을 등록할 수 있다.
  - [ ] 테이블의 이름이 없다면 등록이 블가하다.
  - [ ] 테이블이 존재한다면 테이블에 착석할 수 있고, 테이블 상태가 비어있지 않음으로 변경된다.
  - [ ] 존재하지 않는 테이블은 비울 수가 없다.
  - [ ] 주문이 완료되지 않은 테이블은 비울 수가 없다.
  - [ ] 손님의 숫자를 변경할 수 있다.
  - [ ] 손님의 수가 음수일 경우 변경 불가하다.
  - [ ] 요청한 테이블이 빈 테이블인 경우 변경이 불가하다.
  - [ ] 전체 테이블을 조회할 수 있다.
- 주문
  - [ ] 전체 주문을 조회할 수 있다.
  - [ ] 주문의 상태를 변경할 수 있다.
      (주문 수락, 서빙 완료, 배달 시장, 배달 종료, 주문 수행 완료)
  - 주문 접수
    - [ ] 여러가지 메뉴를 선택하여 주문을 접수할 수 있다.
    (주문 타입: 현장식사, 배달, 포장 중 선택 가능)
    - [ ] 주문 종류가 정해지지 않았다면 주문을 할 수 없다. 
    - [ ] 주문한 메뉴가 없다면 주문 할 수 없다. 
    - [ ] 주문 요청이 들어온 메뉴들 중 등록되어 있지 않은 메뉴가 있다면 주문을 할 수 없다. 
    - [ ] 현장식사가 아닐 경우 메뉴 주문 수량이 음수이면 주문을 할 수 없다. 
    - [ ] 주문 요청이 들어온 메뉴가 전시 되어 있지 않은 메뉴라면 주문을 할 수 없다. 
    - [ ] 주문 요청에 포함된 가격이 메뉴의 가격과 다르다면 주문을 할 수 없다.
    - [ ] 주문 접수가 되고 수락이 되기를 기다려야한다. 
    - [ ] 배달 주문일 경우 배달 주소가 없다면 주문 할 수 없다. 
    - [ ] 현장식사 일 경우 요청한 테이블 번호가 등록되어 있지 않다면 주문을 할 수 없다.
    - [ ] 주문한 테이블을 지정할 수 있다.
  - 주문 수락
    - [ ] 주문 번호가 없다면 주문을 수락할 수 없다.
    - [ ] 주문 상태가 수락 대기중이 아니라면 주문을 수락할 수 없다.
    - [ ] 배달 주문은 수락 시 주문 메뉴 가격을 합하여 주문번호, 배달 주소, 총 가격을 라이더에게 전달한다.
  - 서빙 완료
    - [ ] 주문 번호가 없다면 서빙할 수 없다.
    - [ ] 주문이 가게에 의해 수락되지 않았을 경우 서빙할 수 없다.
  - 배달 시작
    - [ ] 주문번호가 없다면 배달을 시작할 수 없다.
    - [ ] 배달 주문이 아니라면 배달을 시작할 수 없다.
    - [ ]서빙완료인 상태가 아니라면 배달을 시작할 수 없다.
  - 배달 종료
    - [ ] 주문번호가 없다면 배달을 종료할 수 없다.
    - [ ] 주문이 배달 중이 아니라면 배달을 종료할 수 없다.
  - 주문 수행 완료
    - [ ] 주문번호가 없다면 주문을 완료할 수 없다.
    - [ ] 배달 주문의 경우 배달 완료가 되었다면 주문을 완료한다.
    - [ ] 포장 주문이나 현장 주문의 경우 서빙이 완료되지 않았다면 주문을 완료할 수 없다.
    - [ ] 주문 완료가 된 테이블은 빈 테이블이 된다.
  
- 상품
  - [ ] 상품을 저장할 수 있다.
  - [ ] 가격이 입력되지 않은 상품은 저장되지 않는다.
  - [ ] 가격이 음수로 입력되었을 경우 상품이 저장되지 않는다.
  - [ ] 상품명이 입력되지 않은 상품은 저장되지 않는다.
  - [ ] 상품명에 욕설이 포함 될 경우 상품은 저장되지 않는다.
  - [ ] 상품 가격을 수정할 수 있다.
  - [ ] 상품 가격이 입력되지 않을 경우 가격 수정이 불가하다.
  - [ ] 음수가 입력되었을 경우 가격 수정이 불가하다.
  - [ ] 상품 가격이 변경됐을 때 해당 상품이 포함된 메뉴 중 하나라도 구성품 가격의 합이 메뉴의 가격보다 클 경우 해당 메뉴를 공개하지 않는다.
  - [ ] 전체 상품을 조회할 수 있다.

## 용어 사전

| 한글명 | 영문명 | 설명 |
| --- | --- | --- |
|  |  |  |

## 모델링
