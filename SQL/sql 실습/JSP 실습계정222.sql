SELECT o.cust_id, TRIM(c.cust_name), oi.order_num, oi.prod_id, TRIM(p.prod_name)
FROM CUSTOMERS c, orderitems oi, products p, orders o 
WHERE c.cust_id = o.cust_id
AND oi.order_num = o.order_num
AND oi.prod_id = p.prod_id
order by cust_id

SELECT vend_name, prod_name, prod_price
FROM Vendors, Products
WHERE Vendors.vend_id = Products.vend_id;



SELECT vend_name, prod_name, prod_price
FROM Vendors INNER JOIN Products
ON Vendors.vend_id = Products.vend_id;

--(+)연산자는 조인시킬 값이 없는 조인측에 (+)를 위치시킨다

SELECT C.cust_id, O.order_num
FROM Customers C, Orders O
WHERE C.cust_id = O.cust_id(+); 

SELECT c.cust_id, o.order_num
FROM Customers c 
LEFT OUTER JOIN Orders o
ON c.cust_id = o.cust_id;


