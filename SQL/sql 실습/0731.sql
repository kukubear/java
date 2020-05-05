--0731 실습
/*1.고객별로 주문한 제품의 수와 주문한 제품 중 최고항목가격(판매가격)을 추출하시오
결과: 고객번호, 고객이름, 주문제품 수, 주문제품 중 최고항목가격*/
SELECT cust_id, (SELECT MAX(sum_prod_price) max_price
                                FROM m)
FROM customers c, (SELECT o.cust_id, SUM(quantity) max 
                    FROM ORDERITEMS oi2
                    GROUP BY prod_id) m
WHERE o.cust_id = c.cust_id 
group by cust_id, c.cust_name;

SELECT m.cust_id, m.cust_name, n.quantity, n.max_price
FROM   customers m,
       (SELECT b.cust_id, SUM(a.quantity) quantity, MAX(a.item_price) max_price
        FROM   orderitems a, orders b
        WHERE  a.order_num = b.order_num
        GROUP BY b.cust_id
       ) n
WHERE  m.cust_id = n.cust_id    
;

FROM (SELECT SUM(quantity*item_price) sum_prod_price
FROM ORDERITEMS 
GROUP BY prod_id )m


SELECT MAX(sum_prod_price) max_price
FROM (SELECT  SUM(quantity*item_price) sum_prod_price
        FROM  ORDERITEMS 
    GROUP BY  prod_id) m




SELECT 
SUM(CASE WHEN prod_id = 'BNBG01' THEN (quantity*item_price) END) bnbg1_ttprice,
SUM(CASE WHEN prod_id = 'BNBG02' THEN (quantity*item_price) END) bnbg2_ttprice,
SUM(CASE WHEN prod_id = 'BNBG03' THEN (quantity*item_price) END) bnbg3_ttprice,
SUM(CASE WHEN prod_id = 'BR01' THEN (quantity*item_price) END) br01_ttprice,
SUM(CASE WHEN prod_id = 'BR02' THEN (quantity*item_price) END) br02_ttprice,
SUM(CASE WHEN prod_id = 'BR03' THEN (quantity*item_price) END) br03_ttprice,
SUM(CASE WHEN prod_id = 'KR01' THEN (quantity*item_price) END) kr01_ttprice,
SUM(CASE WHEN prod_id = 'KR02' THEN (quantity*item_price) END) kr02_ttprice,
SUM(CASE WHEN prod_id = 'RGAN01' THEN (quantity*item_price) END) rgan01_ttprice

FROM orderitems oi;

SELECT COUNT(order_num)
FROM orders
GROUP BY cust_id;

/*2.주문된 제품 중에 제품의 공급업체가 있는 도시가 ‘Dollsville’이고 주문된 총 제품의 수가 300을 넘는 제품명을 추출하시오*/
SELECT DISTINCT(TRIM(prod_name))
FROM products p
WHERE vend_id IN( SELECT vend_id 
                 FROM vendors v
                 WHERE vend_city = 'Dollsville'
                 AND EXISTS((SELECT SUM(quantity) 
                    FROM orderitems oi
                GROUP BY prod_id
                HAVING SUM(quantity) >300) ));

--------------------------------------------
SELECT SUM(quantity)
FROM orderitems oi
GROUP BY prod_id;

SELECT vend_city
FROM vendors
WHERE vend_city = 'Dollsville';
-------------------------------------------
/*3.고객별로 주문한 상품 중에 가장 비싼 제품명을 추출하시오
결과: 고객번호, 고객이름, 제품번호, 제품이름, 항목가격(판매가격)*/
SELECT m.cust_id, TRIM(m.cust_name), o.prod_id, TRIM(o.prod_name), l.item_price
FROM   customers m, orders n, orderitems l, products o,
       (SELECT b.cust_id, MAX(a.item_price) max_price
        FROM   orderitems a, orders b
        WHERE  a.order_num = b.order_num
        GROUP BY b.cust_id
       ) t
WHERE  m.cust_id = n.cust_id
AND    n.order_num = l.order_num
AND    l.prod_id = o.prod_id
AND    m.cust_id = t.cust_id
AND    l.item_price = t.max_price
;






SELECT cust_id, cust_name
FROM customers c
WHERE ;

SELECT p.prod_id, TRIM(p.prod_name), (SELECT MAX(oi.item_price)
                                        FROM orderitems oi
                        )
FROM products p 
WHERE p.prod_id =oi.prod_id