--0730
/*1. 주문번호가 20005, 20007인 주문된 제품중에 총 주문수량이 100개가 넘은 제품의 제품이름*/
SELECT oi.order_num, quantity ,prod_name
FROM orderitems oi, products p
WHERE order_num IN (20005,20007)
AND oi.prod_id = p.prod_id
AND quantity >=100;

/*2. DDL01이나  BRS01 제조업체에서 만든 제품 중 가격이 10불이상 인 제품의 총 판매수량
   결과: 제품명, 총판매수량*/
SELECT TRIM(p.prod_name), prod_id, v.vend_id
FROM products p, vendors v
WHERE v.vend_id IN( 'BRS01','DLL01')
AND 


SELECT item_price, quantity
FROM orderitems oi
WHERE oi.item_price >=10;

/*3. 다음의 조건에 따라 고객의 고객번호, 고객이름, 고객주소를 추출하시오
    조건: 주문한 총 상품의 개수가 2개이상인 고객*/
SELECT cust_id, cust_name, cust_address, order_num
FROM customers c, orders o
WHERE c.cust_id = o.cust_id;



SELECT sum(order_num), cust_id, 
/*4. 현재 주문된 상품을 공급한 공급업체의 국가별 공급업체수
    결과: 국가,총공급업체수, 주문된 상품을 공급한 공급업체 수*/
    
--p.44
/*4. 다음의 조건에 따라 제품의 제품번호, 제품이름, 제품가격수준, 제품설명을 추출하시오
제품가격수준: 제품가격이 3$대이면 ‘적당’ 11%대이면 ‘비쌈’ 나머지는 ‘보통’
조건: 공급업체의 우편번호 앞의 2자리가 ‘44’, ‘45’, ’99’ 인 공급업체에서 만들거나
주문된 날자가 5월이 아닌 제품*/
SELECT p.prod_id, TRIM(p.prod_name), p.prod_desc, DECODE(TRUNC(prod_price),3,'적당',11,'비쌈','보통') prod_price
FROM products p
WHERE EXISTS(
SELECT *
FROM vendors v, orders o
WHERE (SUBSTR(v.vend_zip,1,2) IN('44','45','99'))
AND TO_CHAR(order_date, 'mm') <> '05'
)
--where절에 <>조건은 퍼포먼스가 떨어점 =이 좋음 // sql은 정렬을 가급적 안하는 것이 좋음

-- vendors //공급업체의 우편번호 앞의 2자리가 ‘44’, ‘45’, ’99’ 인 공급업체에서 만들거나
SELECT v. vend_zip
FROM vendors v
WHERE (SUBSTR(v.vend_zip,1,2) IN('44','45','99'))
--주문된 날자가 5월이 아닌 제품
SELECT order_date
FROM orders
WHERE TO_CHAR(order_date, 'mm') <> '05'

--? 조건절 사용 // 우편번호로 지역 Type을 구분 
--CASE WHEN은 SELECT절에만 삽입가능 -> 자바의 if절과 비슷
SELECT vend_id,
    CASE WHEN SUBSTR(vend_zip,1,2) ='44' THEN 'A'
        WHEN SUBSTR(vend_zip,1,2) ='99' THEN 'B'
        ELSE 'C'
        END AS resion_type
        FROM vendors

--공급업체의 주별 수를 컬럼으로 분리하여 추출
SELECT SUM(CASE WHEN  vend_state ='MI' THEN 1 END) MI_CNT,
        SUM(CASE WHEN  vend_state ='OH' THEN 1 END) OH_CNT,
        SUM(CASE WHEN  vend_state ='CA' THEN 1 END) CA_CNT,
        SUM(CASE WHEN  vend_state ='NY' THEN 1 END) NY_CNT
FROM vendors


/*1. 주문의 주문번호, 고객번호, 주문시기를 추출하시오
주문시기: 일이 1~15일 사이면 ‘상일’, 16~31일 사이면 ‘하일’*/
SELECT order_num, cust_id,
        CASE WHEN TO_CHAR(order_date,'dd') <16  THEN '상일'
        ELSE '하일' 
        END AS order_period
FROM orders 

SELECT
/*2. 주문에서 주문번호와 주문가능날자를 추출하시오
주문가능날자: 주문날자가 1~15일이면 현재날자, 16~31일이면 다음달 1일*/
SELECT order_num, cust_id,
        CASE WHEN TO_CHAR(order_date,'dd') <16  THEN TO_CHAR(SYSDATE,'yyyymmdd')
        ELSE ADD_MONTH(LAST_DAY(order_date)+1,-1),'yyyymmdd') 
        END AS order_period
FROM orders

/*3. 주문에서 주문번호와 주문가능날자(YYYY-MM-DD)를 추출하시오
- 주문가능날자: 일자의 10자리가 0이면 1일, 1이면 10일, 20이면 20일, 30이면 30일*/
SELECT order_num, cust_id,
        CASE WHEN TO_CHAR(order_date,'dd') <16  THEN '상일'
        ELSE '하일' THEN
        END AS order_period
FROM orders

--데이터 입력 
INSERT INTO customers 
VALUES ('1000000016','TOY Land', '123 Any Street','New York','NY','11111','USA',NULL,NULL);

INSERT INTO customers(cust_id, cust_name, cust_address, cust_city, cust_state,cust_zip, cust_country,cust_contact)
VALUES ('1000000017','TOY Land', '123 Any Street','New York','NY','11111','USA',NULL)

CREATE TABLE custnew AS
SELECT *
FROM customers;

DELETE FROM custnew;

/*? SELECT 쿼리의 결과로 데이터 입력
// 각 컬럼 간 데이터 타입이 일치해야 한다*/
INSERT INTO custnew(cust_id, cust_name, cust_address, cust_city, cust_state, cust_zip, cust_country)
SELECT cust_id, cust_name, cust_address, cust_city, cust_state, cust_zip, cust_country
FROM customers;

INSERT INTO customers
VALUES('1000000006','홍길동','서울시 서초구 강남대로 459', 'Seoul', NULL, '51243', 'KOR','Park','aaa@naver.com');

INSERT INTO customers
VALUES('1000000008','qkr길동','서울시 서초구 강남대로 459', 'Seoul', NULL, '51742', 'KOR','Kim','bbb@daum.net');

INSERT INTO customers
VALUES('1000000009','신주연','서울시 서초구 강남대로 459', 'Seoul', NULL, '53782', 'KOR','Kim','ccc@google.co.kr');

--2번 제품테이블에 정보 추가하기
INSERT INTO products
VALUES('KR01','BRS01','뽀로로인형', '10', 'TV프르그램으로 유명한 뽀로로를 인형으로 만듬');

INSERT INTO products
VALUES('KR02','BRS01','곰인형', '15', '요즘 유행하는 곰모양의 인형');

INSERT INTO products
VALUES('KR03','DLL01','태권V로보트', '100', ' 향수를 자극하는 어른을 위한 태권V로보트');

--3번 주문 테이블에 다음의 정보를 추가하기
INSERT INTO orders
VALUES('20010',TO_DATE('2019-02-01'),'1000000008');

INSERT INTO orders
VALUES('20011',TO_DATE('2019-05-04'),'1000000007');

--4번 주문 상품 테이블에 다음의 정보를 추가하기
INSERT INTO orderitems
VALUES ('20010','1','KR01','2','9');

INSERT INTO orderitems
VALUES ('20011','1','KR02','2','16');

INSERT INTO orderitems
VALUES ('20011','2','KR03','3','95');

--update 컬럼 값에 하위쿼리 사용 가능
UPDATE customers
SET cust_email = 'kim@naver.com',
    cust_contact ='Sam Roberts'
WHERE cust_id = '1000000005';

--데이터 업데이트 1번 
/*1. 고객테이블에서 고객번호가 ‘1000000006’인 고객의 담당자를 ‘Jin’으로 변경하시오*/
UPDATE customers
SET cust_contact ='Jin'
WHERE cust_id = '1000000006';

/*2. 주문테이블에서 고객국가가 ‘KOR’인 고객이 주문한 항목수량에 +1씩을 더하시오*/
UPDATE orderitems
SET quantity = quantity+1
WHERE order_num IN(
SELECT o.order_num
FROM orders o,customers c
WHERE o.cust_id = c.cust_id
AND c.cust_country = 'KOR') ;


SELECT *
FROM customers
WHERE cust_country = 'KOR'

/*3. 주문날자가 2019년도에 발생한 주문 중에 주문상품의 항목가격이 90$를 넘는 항목가격에 대해 10%씩을 DC하여 변경하시오*/
UPDATE orderitems
SET item_price = (item_price - (item_price*0.1))
WHERE order_num IN (
SELECT order_num
FROM orders
WHERE TO_CHAR(order_date,'yyyy') = '2019')
AND item_price >90;

SELECT item_price
FROM orderitems
WHERE item_price>90

/*4. 주문상품중에 제품의 제품가격보다 주문상품의 항목가격이 비싼 항목가격을 제품의 제품가격으로 변경하시오*/
--오류 수정필요
UPDATE orderitems
SET item_price = (SELECT prod_price
                    FROM products
                    WHERE item_price>prod_price)
;

SELECT ;
/*1. 제품번호가 KR03인 제품을 제품테이블에서 삭제하고 주문상품테이블에서도 삭제하시오*/
DELETE FROM orderitems
WHERE prod_id ='KR03';

/*2. 공급업체가 ‘BRE02’인 공급업체가 생산한 제품중 ‘곰인형’ 제품을 주문한 주문정보를 삭제하시오*/
DELETE FROM orderitems
WHERE prod_id = (
    SELECT prod_id 
    FROM products
    WHERE vend_id = 'BRE02'
    AND prod_desc LIKE '%곰인형%'
)

DELETE FROM orders a
WHERE 