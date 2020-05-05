/*1. 상품주문에서 주문번호, 제품번호, 제품제조국가위치를 추출하시오
   -제품제조국가위치: 제품번호의 마지막 2자리가 01이면 ‘국내’, 아니면 ‘해외’
   -조건: 총가격(항목수량*항목가격)이 500$이상인 주문*/
SELECT order_num, prod_id, DECODE(SUBSTR(TRIM(prod_id),-2),'01','국내','해외') country
FROM orderitems
WHERE (quantity*item_price) >=500;

/*2. 주문과 고객정보를 조인하여 다음의 결과를 추출하시오
   -결과: 주문번호, 주문날자, 제품번호, 고객번호, 고객이름, 고객주소, 고객시, 고객메일주소
   -조건: 전체주문에서 가장 많은 상품종류를 판매한 공급업체에서 만든 제품만조회*/
SELECT o.order_num, o.order_date, oi.prod_id, c.cust_id,TRIM(c.cust_name),
        TRIM(c.cust_address),TRIM(c.cust_city),TRIM(c.cust_email)
FROM orders o, orderitems oi, customers c
WHERE o.order_num = oi.order_num
AND o.cust_id = c.cust_id
AND oi.prod_id IN(SELECT MAX(COUNT(p.prod_id))
                    FROM products p, vendors v
                    WHERE v.vend_id = p.vend_id
                    GROUP BY v.vend_id)
                    
SELECT oi.prod_id, (SELECT COUNT(p.prod_id))
                  FROM products p
                  WHERE oi.prod_id = p.prod_id
                    GROUP BY p.vend_id) max_cnt
FROM orderitems oi 
GROUP by 

                   

SELECT vend_id, COUNT(prod_id)
FROM products 
group by vend_id
/*3. 주문 중에 고객이 사는 도시가 ‘Detroit’이고 주문한 총 제품의 수가 500을 넘는 고객을 추출하시오
   -결과: 고객번호, 고객이름, 고객도시*/
SELECT cust_id, TRIM(cust_name) cust_name, TRIM(cust_city) cust_city
FROM customers c 
WHERE cust_city = 'Detroit'
AND cust_id IN(SELECT o.cust_id
                FROM orders o, orderitems oi 
                WHERE o.cust_id = c.cust_id
                GROUP by o.cust_id
                AND order_num IN (SELECT order_num
                                    FROM orderitems oi
                                   --WHERE oi.order_num = o.order_num
                                   AND quantity IN (SELECT SUM(quantity)
                                                    FROM orderitems
                                                    GROUP by order_num
                                                    HAVING SUM(quantity)>500)))
--주문한 총 제품의 수가 500을 넘는 고객을 추출                                                
SELECT order_num, SUM(quantity)
FROM orderitems
GROUP by order_num
HAVING SUM(quantity)>500



/*4. 모든 주문에 대해 다음의 결과를 추출하시오
   -결과: 주문번호, 주문날자(YYYY-MM-DD), 고객번호, 고객이름, 
   주문제품번호, 주문제품이름, 공급업체번호, 공급업체명
   -조건: 3$대의 제품을 판매하는 공급업체의 모든 주문*/
SELECT o.order_num, TO_CHAR(o.order_date,'yyyy-mm-dd') order_date, 
        c.cust_id, TRIM(c.cust_name), oi.prod_id, TRIM(p.prod_name), v.vend_id, TRIM(v.vend_name)
FROM orders o, customers c, orderitems oi, products p, vendors v
WHERE o.order_num = oi.order_num
AND c.cust_id = o.cust_id
AND oi.prod_id = p.prod_id
AND v.vend_id = p.vend_id
AND oi.item_price LIKE '3%'
        
/*5. 주문날자가 2004년도에 발생한 주문 중에 주문상품의 
항목가격이 9$를 넘는 항목가격에 대해 10%씩을 DC하여 변경하시오*/
UPDATE orderitems 
SET item_price = item_price*0.9
WHERE order_num IN (SELECT oi.order_num
        FROM orderitems oi, orders o
        WHERE oi.order_num = o.order_num
        AND oi.item_price > =9
        AND TO_CHAR(o.order_date, 'yyyy') =2004)