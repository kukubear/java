/*1.고객에서 고객번호, 고객이름, 고객주소, 주문한 총 금액,  주문한 제품 중에 가장 최근에 주문한 상품명을 추출하시오
    - 주문한 총 금액: 해당고객이 주문상품에서 주문한 상품의 항목가격의 SUM
    - 주문한 제품 중에 가장 최근에 주문한 상품명 :주문상품에서 해당고객이 주문한 상품중 가장 최근에 주문한 상품의 상품명
    상품이 여러 개일때 가나다라 순서대로 출력*/
    
SELECT c.cust_id, TRIM(c.cust_name) cust_name, TRIM(c.cust_address) cust_address, (SELECT SUM(oi.item_price)
                                                    FROM orderitems oi, orders o
                                                    WHERE oi.order_num=o.order_num
                                                    AND c.cust_id = o.cust_id) total_price, --주문한 총 금액
                                                    
                                                    (SELECT TRIM(MAX(p.prod_name))
                                                    FROM products p, orderitems oi, orders o
                                                    WHERE p.prod_id =oi.prod_id
                                                    AND oi.order_num =o.order_num
                                                    AND c.cust_id = o.cust_id
                                                   ) recent_prod                                                   
FROM customers c





SELECT SUM(item_price)
FROM orderitems oi
WHERE order_num IN(SELECT order_num
                    FROM orders o
                    WHERE c.cust_id = o.cust_id)

/*2. 상품을주문한 고객 중에 고객국가,고객담당자 별 주문수를 추출하시오
   - 결과: 고객국가,고객담당자, 주문수
   - 조건: 주문수가 2건이상인 경우만 조회*/
SELECT TRIM(cust_contact), TRIM(cust_country), (SELECT count(o.order_num) cnt_or
                                    FROM orders o
                                    WHERE o.cust_id = c.cust_id
                                    group by o.cust_id) cnt
FROM customers c
WHERE (SELECT count(o.order_num) cnt_or
                                    FROM orders o
                                    WHERE o.cust_id = c.cust_id
                                    group by o.cust_id) >=2
order by cust_contact

/*3. 다음의 조건에 따라 제품의 제품번호, 제품이름, 제품가격수준, 제품설명을 추출하시오
   - 제품가격수준: 제품가격이 3$대이면 ‘적당’ 11$대이면 ‘비쌈’나머지는 ‘보통’
   - 조건: 공급업체의 우편번호 앞의 2자리가 ‘44’,‘45’, ’99’ 인공급업체에서 만들거나
              주문된 날자가 5월이 아닌 제품*/
SELECT prod_id, TRIM(prod_name), prod_desc, DECODE(SUBSTR(prod_price,1,2), 3,'적당', 11,'비쌈','보통') price
FROM products p, (SELECT MAX(order_date)
                    FROM orders
                    WHERE TO_NUMBER(TO_CHAR(order_date, 'MM')) != '05'
                    )
WHERE vend_id IN(SELECT vend_id
                    FROM vendors
                    WHERE SUBSTR(vend_zip,1,2) IN('44','45','99')) 

                    
/*4. 주문상품중에 제품의 제품가격보다 주문상품의 항목가격이 비싼 항목가격을 
제품의 제품가격으로 변경하시오*/
UPDATE orderitems oi
SET item_price = (SELECT prod_price
                    FROM products 
                    WHERE prod_id =oi.prod_id)
WHERE prod_id IN(SELECT p.prod_id 
                    FROM products p
                    WHERE p.prod_price < oi.item_price)


