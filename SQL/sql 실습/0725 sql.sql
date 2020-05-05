--0725 sql 진도 
--COALESE와 NULLIF는 알아두면 유용함
--디코드 유용 ->자바의 case같은 역할

--공급업체이름의 길이 ->트림주는 이유는 아니면 50이 나옴
SELECT vend_id, LENGTH(TRIM(vend_name))
FROM vendors;

--공급업체 주소를 소문자 or 대문자로
SELECT vend_id, LOWER(vend_address), UPPER(vend_address)
FROM vendors;

--문자자르기
SELECT vend_id, SUBSTR(vend_address,1,3), UPPER(vend_address)
FROM vendors;

--문자 대체하기
SELECT vend_id, REPLACE(vend_address,'Street','Road')
FROM vendors;

--NULL이 아닌 첫번째 값
SELECT vend_id, vend_state, vend_city, COALESCE(vend_state, vend_city)
FROM vendors
WHERE vend_id = 'FNG01';

--공급업체주가 CA이면 1, NY이면 2 모두 아니면 3
SELECT vend_id,vend_state, DECODE(TRIM(vend_state),'CA',1,'NY',2,3)
FROM vendors;

--NULL이면 다른 값으로
SELECT NVL(cust_email,'test@naver.com')
FROM customers;

/*1. 고객의 주소 중에 소문자로 ‘south’가 들어간 고객정보를 다음의 Format으로 추출하시오(공백제거)
- Format: 고객이름’/’고객주소, 소문자로*/
SELECT TRIM(LOWER(cust_name)) ||'/'|| TRIM(LOWER(cust_address))
FROM customers
WHERE cust_address Like '%south%';

/*2. 주문상품의 주문번호가 ‘20005’, ‘20007’가 아닌 제품유형코드를 추출하시오
- 제품유형코드: 제품번호의 앞의 2자리*/
SELECT order_num, SUBSTR(prod_id,1,2)
FROM orderItems 
WHERE prod_id NOT IN('20005','20007');

/*3. 고객의 고객이름과 고객주소정보를 추출하시오
- 고객주소정보: 고객주소중에 Drive는 Car로 변경*/
SELECT cust_name, REPLACE(cust_address,'Drive','Car')
FROM customers; 

/*4. 공급업체의 공급업체번호가 ‘br’로 시작되는 공급업체이름과 공급업체지역번호를 공급업체이름을 내림차순으로 추출한다
- 공급업체지역번호: 우편번호의 앞에 2자리*/
SELECT vend_name, SUBSTR(vend_zip, 1,2)
FROM vendors
WHERE vend_id Like 'BR%'
ORDER BY vend_name DESC;

/*5. 공급업체의 공급업체번호가 ‘BRE02’이 아닌 공급업체이름과 공급업체사업구역번호를 추출한다
- 공급업체사업구역번호: 공급업체지역번호가 44이면 A, 99이면 B, 11이면 C 나머지는 D*/
SELECT vend_name, DECODE(SUBSTR(vend_zip, 1,2), 44 , 'A', 99, 'B', 11 , 'C', 'D')
FROM vendors
WHERE vend_id <>'BRE02';

/*6. 고객의 고객명과 고객주소정보를 추출한다
- 고객주소정보: 고객메일주소 or 고객주소, 고객메일주소가 있으면 고객메일주소가 우선*/
SELECT cust_name, COALESCE(cust_email,cust_address)
FROM customers;

/*7. 제품의 제품명에 ‘bear’이 들어있는 모든 제품에 대해 제품이름을 추출하는데 bear를 toy로 변경하여 추출한다*/
SELECT REPLACE(prod_name, 'bear','toy')
FROM products
WHERE prod_name Like '%bear%' ;

--올림, 내림
SELECT prod_id, prod_price,CEIL(prod_price), FLOOR (prod_price)
FROM products;

--반올림, 버림
SELECT prod_id, prod_price,ROUND(prod_price,1), TRUNC(prod_price, 1)
FROM products;

-- 제곱, 제곱근
SELECT prod_id, prod_price , POWER(prod_price,2) SQRT(prod_price)
FROM products;

-- 나머지 
SELECT prod_id, prod_price, MOD(prod_price, 2)
FROM products;

/*1. 제품의 제품번호가 ‘br’로 시작되는 상품의 가격을 소수점 첫째자리에서 반올림 하여 제품이름과 함께 추출하시오
ROUND 소숫점 첫번쨰자리 --> 0은 생략 가능 */
SELECT prod_id, ROUND(prod_price, 0)

FROM products 
WHERE LOWER(prod_id) like 'br%';

/*2. 주문상품중에 가격이 10%이상인 주문번호와 상품번호, 항목가격을 추출하시오
- 항목가격: 항목가격은 소수점 버림으로 처리하여 추출*/
SELECT order_num, prod_id, TRUNC(item_price,0)
FROM orderitems
WHERE item_price >=10;

--현재 날짜와 주문날짜간의 월차이
SELECT order_num, TO_CHAR (order_date,'yyyy-mm-dd'), MONTHS_BETWEEN(sysdate, order_date)
FROM orders;

--주문날짜에서 10개월을 추가 
SELECT order_num, TO_CHAR(order_date,'YYYY-mm-dd'), (ADD_MONTHS(order_Date, 10),'YYYY-MM-DD')
FROM orders;

--주문한 달의 마지막 날짜
SELECT order_num, TO_CHAR(order_date, 'yyyy-mm-dd'), TO_CHAR(LAST_DAY(order_date),'yyyy-mm-dd')
FROM orders;

--특정날짜와 주무날짜간의 차이
SELECT order_num, TO_CHAR(order_Date,'yyyy-mm-dd'), MONTH_BETWEEN(TO_DATE('2018-12-05','yyyy-mm-dd'),order_date)
FROM orders;

-- 숫자를 문자로
SELECT order_num, quantity, 'A'||TO_CHAR(quantity)
FROM orderitems;

-- 날짜를 문자로
SELECT order_num, TO_CHAR(order_date, 'yyyy-mm-dd'), TO_CHAR(sysdate,'yyyy/mm/dd HH24:MI:ss')
FROM orders;

-- 2004년에 주문된 항목의 주문번호
SELECT order_num
FROM orders
Where TO_NUMBER(TO_CHAR(order_date, 'yyyy'))=2004;

-- BETWEEN형식으로 구현
SELECT order_num
FROM orders
where order_date Between TO_DATE('20040101') AND TO_DATE('20041231');

/*1. 고객주문에서 주문월일 2월인 모든 주문번호를 주문번호를 내림차순으로 하여 추출한다*/
SELECT order_num
FROM orders
WHERE TO_NUMBER(TO_CHAR(order_date, 'mm'))=02
order by order_num DESC;

/*2. 고객주문에서 주문일에 +1일을 한 날자가 해당 주문월의 마지막 날자와 같은 주문번호를 오름차순으로 추출한다*/
SELECT order_num, order_date 
FROM orders
WHERE order_date +1 = LAST_DAY(order_date)
order by order_num DESC;

/*3. 고객주문에서 현재일과 주문일간의 차이가 185개월을 넘는 주문번호를 추출한다*/
SELECT order_num
FROM orders 
Where MONTH_BETWEEN(SYSDATE, order_date)>185;

/*4. 고객 주문에서 고객번호가 1로 끝나는 주문의 주문날짜의 월일을 추출하시오*/
SELECT order_date
FROM orders
WHERE SUBSTR(cust_id, LENGTH(cust_id),1)=1;





