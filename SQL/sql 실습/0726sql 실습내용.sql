/*1. 상품주문에서 주문번호, 제품번호, 제품제조국가위치를 추출하시오
    - 제품제조국가위치: 제품번호의 마지막 2번째 1자리의 값이 0이면 ‘국내’,0이아니면 ‘해외’
   -총가격(항목수량*항목가격)이 500$이상인 주문*/
SELECT order_num, prod_id, DECODE(SUBSTR(prod_id, -2), '0%','국내','해외')
From orderitems
Where (quantity*item_price)>500;
   
/*2. 주문에서 주문번호와 주문가능날자(YYYY-MM-DD)를 추출하시오
    - 주문가능날자: 일자의 10자리가 0이면 1일,1이면 10일, 20이면 20일,30이면 30일*/
SELECT order_num, DECODE(SUBSTR(order_date,-2,1),'0','1일','1','10일','2','20일','3','30일')
From orders;


/*3. 제품이름과 제품설명에 ‘king’이라는 단어가 들어가고 제품가격의 소수점 1자리가 9가 아닌 제품번호를 추출하시오
*/   
SELECT prod_id
FROM products
WHERE TRUNC(prod_price,0) <> 9
AND prod_name  = '%king%'
AND prod_desc = '%king%';


--0726 수업내용 
--? AVG(): NULL 값이 있는 경우 계산에서 제외된다 
--// Products 테이블에 있는 모든제품의 가격평균
SELECT AVG(prod_price)
FROM products;

--// DLL01의 공급업체에 대한 제품 평균
SELECT AVG(prod_price) 
FROM products
WHERE vend_id = 'DLL01';

/*? COUNT()
- COUNT(*): 테이블의 모든 행의 개수, NULL값 포함
- COUNT(컬럼): 컬럼의 NULL값을 제외한 행의 개수*/
SELECT count(*) AS num_cust
FROM customers;

--// cust_email 열에 값이 있는 고객의 수만 계산
SELECT count(cust_email) AS num_cust
FROM customers;

/*? MAX(): 지정한 열에서 가장 큰 값을 반환
- TEXT도 사용가능, NULL값은 무시된다
// Products 테이블에서 가격이 가장 비싼 제품의 가격*/
SELECT MAX(prod_price) AS max_price
FROM products;

/*? MIN(): 지정한 열에서 가장 낮은 값을 반환
- TEXT도 사용가능, NULL값은 무시된다
// Products 테이블에서 가격이 가장 저렴한 제품의 가격*/
SELECT MIN(prod_price) AS min_price
FROM products;

/*? SUM(): 지정한 열에서 모든 값을 더한 합계
- NULL값은 무시된다
// 모든 주문한 물품의 수량의 합계*/
SELECT SUM(quantity) AS items_ordered
FROM Orderitems;

--// 각 주문에 대한 총 금액을 반환
SELECT SUM(item_price*quantity) AS total_price
FROM orderitems
WHere order_num = 2005;

/*1. 고객주문에서 주문날자가 가장 최근인 날자와 가장 최초인 날자를 추출하시오*/
SELECT MAX(order_date) AS max_date, MIN(order_date) AS min_date
FROM orders;

/*2. 주문상품에서 제품번호가 BN으로 시작하는 각 주문의 총금액(항목수량*항목가격)이 가장 큰 금액을 추출하시오*/
SELECT MAX(item_price*quantity) AS total_price
FROM orderitems
WHERE prod_id LIKE 'BN%' 

/*3. 주문상품에서 제품번호가 BR01와 BR03인 제품의 주문된 항목수량의 평균을 추출하시오*/
SELECT AVG(quantity) 


/*? 그룹만들기
- 중첩된 그룹이 있을 경우 데이터는 마지막 지정된 그룹을 기준으로 요약된다
- GROUP BY로 그룹화 되면 해당 컬럼은 SELECT절에 나타나야 한다
- NULL값도 그룹으로 분류된다*/
--// 공급업체별 상품 수
SELECT vend_id, COUNT(*) AS num_prods
FROM Products
GROUP BY vend_id;

/*? 필터링 그룹: 그룹을 만든다음 그 그룹결과에서 그룹함수를 통해 필터링을 수행
- WHERE: 그룹화 하기 전에 필터링 수행
- HAVING: 그룹화 한 후에 필터링 수행*/
SELECT cust_id, COUNT(*) AS orders
FROM orders
GROUP BY cust_id
HAVING COUNT(*) >=2;

--// 가격이 4이상인 제품을 두 개 이상 가진 공급업체를 추출
SELECT vend_id, COUNT(*) AS num_prods
FROM products
WHERE prod_price >=4
GROUP BY vend_id
HAVING COUNT(*)>=2;

--// ORDER BY와 함께 사용
SELECT order_num, COUNT(*) AS items
FROM Orderitems
GROUP by order_num
HAVING COUNT(*)>=3
ORDER BY items, order_num;

-- 주문된 제품의 종류수
SELECT COUNT (DISTINCT prod_id)
FROM orderitems;

-- 주문된 제품별 총 주문수량
SELECT prod_id, SUM(quantity)
FROM orderitems
GROUP BY prod_id;

-- 주문된 제품의 총 주문수량이 100개나 넘은 제품의 제품번호
SELECT prod_id, SUM(quantity)
FROM orderitems
GROUP BY prod_id
HAVING SUM(quantity)>100;

-- 주문번호가 20005, 20007인 주문된 제품중에 총 주문수량이 100개가 넘은 제품의 제품번호
SELECT prod_id, SUM(quantity)
FROM orderitems
WHERE order_num IN(20005, 20007)
GROUP BY prod_id
HAVING SUM(quantity) >100;

/*1. 주문제품의 주문번호와 주문번호별 주문제품의 수를 추출하시오
결과: 주문번호, 주문제품의수 */
SELECT order_num, COUNT(prod_id) --SUM(quantity)
FROM orderitems
GROUP BY order_num;

/*2. 주문에서 주문날자별 주문한 고객의 수를 추출하시오
결과: 주문날자(YYYY-MM-DD), 고객의 수*/
SELECT TO_CHAR(order_date,'yyyy-mm-dd'), COUNT(DISTINCT cust_id) --DISTINCT로 중복제거해야 정확한 데이터 추출
FROM orders
GROUP BY order_date;

/*3. 제품에서 공급업체번호별 제품의 수를 추출하시오
결과: 공급업체번호, 제품의수*/
SELECT vend_id, COUNT(prod_name)
FROM products
GROUP BY vend_id;

/*4. 고객 중에 우편번호가 4로 시작되는 고객의 수를 추출하시오
결과: 고객의 수*/
SELECT COUNT(cust_id)
FROM customers 
WHERE cust_zip LIKE '4%'
GROUP BY cust_zip;

/*5. 고객 중에 이메일 주소가 없는 고객의 수를 추출하시오
결과: 고객의 수*/
SELECT COUNT(cust_name)
FROM customers
WHERE cust_email is NULL
GROUP BY cust_email;

/*6. 제품중에 공급업체별 제품가격의 평균을 추출하시오
결과: 공급업체번호, 평균가격*/
SELECT vend_id, AVG(prod_price)
FROM products
GROUP BY vend_id;

/*7. 고객에서 주별 고객의 수를 추출하시오
결과: 고객주, 고객의수*/
SELECT cust_state, COUNT(cust_name)
FROM customers 
GROUP BY cust_state;

/*8. 제품에서 공급업체가 BRS01, DLL01인 제품중에 가장비싼 제품의 가격이 5$이상인 공급업체번호를 추출하시오
결과: 공급업체번호 */
SELECT vend_id
FROM products
WHERE vend_id IN('BRS01', 'DLL01') AND prod_price>5
GROUP BY vend_id;

/*9. 주문에서 1월중 주문한 주문중에 가장늦게 주문한 고객번호를 추출
결과: 고객번호주문일자(YYYY-MM-DD), 고객번호*/
SELECT MAX(TO_CHAR(order_date,'yyyy-mm-dd')), cust_id
FROM orders
WHERE TO_CHAR(order_date,'mm')='01'
GROUP BY cust_id;

/*? IN절안에 하위쿼리 사용하기
- 하위쿼리를 먼저 실행하여 결과를 추출하고 그 결과를 바탕으로 메인 쿼리를 실행한다
// 상품번호가 RGAN01인 상품을 주문한 고객ID추출*/
SELECT cust_id
FROM Orders
WHERE order_num IN(SELECT order_num
                    FROM  orderitems
                    WHERE prod_id = 'RGAN01'); -->동적인 IN의 사용 가능

/*// 하위쿼리 안에 하위쿼리 사용
// 상품번호가 RGAN01인 상품을 주문한 고객의 이름과 연락처 추출*/
SELECT cust_name, cust_contact
FROM Customers
WHERE cust_id IN(SELECT cust_id
                   FROM orders
                  WHERE order_num IN(SELECT order_num
                                    FROM orderitems
                                    WHERE prod_id = 'RGAN01'));

/*? 하위쿼리를 계산필드로 사용
- 중복된 컬럼명을 구분하기 위해 테이블명으로 구분*/
SELECT cust_name,cust_state,
        (SELECT COUNT(*)
         FROM  orders
         WHERE Orders.cust_id = Customers.cust_id) 
FROM customers
order by cust_name;

--? FROM절에 SQL 사용하기
SELECT order_num, order_item, type
FROM
(SELECT order_num, order_item, SUBSTR(prod_id,1,2) type
FROM orderitems
)A
WHERE type ='BR'

--? EXISTS, NOT EXISTS
SELECT cust_id, cust_name, cust_address
FROM customers a 
Where Exists (
    SELECT *
    FROM orders
    WHERE cust_id = a.cust_id
    );
    
/*1. 제품의 고유ID와 제품이름, 제품가격, 제품설명을 추출하시오
조건: 공급업체의 국가가 ‘USA’인 공급업체의 제품*/
SELECT prod_id, prod_name, prod_price, prod_desc
FROM products
WHERE vend_id IN (SELECT vend_id --vend_country(X)
             FROM  vendors
             WHERE vend_country ='USA');


/*2. 고객의 고객번호, 고객이름, 고객주소, 고객메일주소를 추출하시오
조건: 고객의 메일주소가 있고 주문을 한 건이라도 한 고객*/
SELECT cust_id, cust_name, cust_address, cust_email
FROM customers a
WHERE cust_email is not null 
AND EXISTs (SELECT order_num, cust_id
            FROM orders 
            WHERE cust_id = a.cust_id);


/*AND EXISTs (SELECT order_num, cust_id
            FROM orders 
            WHERE cust_id is not null);*/

/*3. 공급업체의 공급업체번호, 공급업체이름, 공급업체주소, 공급업체별 제품 수를 추출하시오
조건: 공급업체별 제품수가 1개 이상인 공급업체*/
SELECT vend_id, vend_name, vend_address,
        (SELECT *
        FROM products)
      
FROM vendors
WHERE  

/*4. 주문제품 중에 제품별로 항목가격이 가장 낮은 제품번호를 추출하시오
결과: 제품번호, 항목가격(제품별 가장 낮은 항목가격)*/
SELECT 
FROM
WHERE

/*? 조인: 테이블 간에 동일한 컬럼들을 연결시켜서 통합된 정보를 추출하는 방법
- 조인을 많이 할 수록 성능을 떨어진다
// 상품에 대한 공급업체 정보를 함께 추출 -> 밑에 ANSI SQL 내부조인 하는 것과 같은 결과*/
SELECT vend_name, prod_name
FROM VENDORS, Products
WHERE vendors.vend_id = Products.vend_id;

-- 조인 시에 조건절에서 테이블간의 관계를 설정하지 않으면 cartesian product
SELECT vend_name, prod_name
FROM vendors, Products;

--? ANSI SQL - 내부 조인
SELECT vend_name, prod_name, prod_price
FROM vendors INNER JOIN products
    ON vendors.vend_id = products.vend_id;
    
/*? 여러 테이블 조인
// 상품에 대한 공급업체 정보와 주문수량까지 추출*/
SELECT vend_name, prod_name, prod_price, quantity
FROM ORDERITEMS, vendors, products
WHERE PRODUCTs.vend_id = vendors.vend_id
AND Orderitems.prod_id = products.prod_id
AND order_num = 2007;

--상품번호가 RGAN01인 주문자이름과 연락처 추출
SELECT cust_name, cust_contact
FROM customers, orders, orderitems
WHERE customers.cust_id = orders.cust_id
AND orderitems.order_num = orders.order_num
AND prod_id = 'RGAN01';

/*? 테이블 별칭사용
// 상품번호가 RGAN01인 주문자이름과 연락처 추출*/
SELECT cust_name, cust_contact
FROM customer C, Orders O, Orderitems oi
WHERE c.cust_id = O.cust_id
AND oi.order_num = o.order_num
AND prod_id ='RGAN01';

/*? 동일 테이블 조인
// Jim Jones라는 사람이 일하는 회사의 모든 고객 담당자의 메일주소 추출*/
SELECT cust_id, cust_name, cust_contact
FROM customers
WHERE cust_name = (SELECT cust_name
                    FROM customers
                    WHERE cust_contact = 'Jim Jones');

/* 같은 쿼리를 조인으로 추출*/
SELECT c1.cust_id, c1.cust_name, c1.cust_contact
FROM customers c1, customers c2
WHERE c1.cust_name = c2.cust_name
AND c2.cust_contact = 'Jim Jones';

/*조인시 전체 컬럼 조회 처리*/
SELECT c.*, o.order_num, o.order_date, oi.prod_id
FROM customers c, orders O,orderitems oi
WHERE C.cust_id = o.cust_id
AND oi.order_num = o.order_num
AND prod_id = 'RGAN01';

/*1. 주문과 고객정보를 조인하여 다음의 결과를 추출하시오
결과: 주문번호, 주문날자, 고객번호, 고객이름, 고객주소, 고객시, 고객메일주소*/
SELECT a.order 

