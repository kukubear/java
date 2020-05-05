/*1. ��ǰ�ֹ����� �ֹ���ȣ, ��ǰ��ȣ, ��ǰ����������ġ�� �����Ͻÿ�
   -��ǰ����������ġ: ��ǰ��ȣ�� ������ 2�ڸ��� 01�̸� ��������, �ƴϸ� ���ؿܡ�
   -����: �Ѱ���(�׸����*�׸񰡰�)�� 500$�̻��� �ֹ�*/
SELECT order_num, prod_id, DECODE(SUBSTR(TRIM(prod_id),-2),'01','����','�ؿ�') country
FROM orderitems
WHERE (quantity*item_price) >=500;

/*2. �ֹ��� �������� �����Ͽ� ������ ����� �����Ͻÿ�
   -���: �ֹ���ȣ, �ֹ�����, ��ǰ��ȣ, ����ȣ, ���̸�, ���ּ�, ����, �������ּ�
   -����: ��ü�ֹ����� ���� ���� ��ǰ������ �Ǹ��� ���޾�ü���� ���� ��ǰ����ȸ*/
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
/*3. �ֹ� �߿� ���� ��� ���ð� ��Detroit���̰� �ֹ��� �� ��ǰ�� ���� 500�� �Ѵ� ���� �����Ͻÿ�
   -���: ����ȣ, ���̸�, ������*/
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
--�ֹ��� �� ��ǰ�� ���� 500�� �Ѵ� ���� ����                                                
SELECT order_num, SUM(quantity)
FROM orderitems
GROUP by order_num
HAVING SUM(quantity)>500



/*4. ��� �ֹ��� ���� ������ ����� �����Ͻÿ�
   -���: �ֹ���ȣ, �ֹ�����(YYYY-MM-DD), ����ȣ, ���̸�, 
   �ֹ���ǰ��ȣ, �ֹ���ǰ�̸�, ���޾�ü��ȣ, ���޾�ü��
   -����: 3$���� ��ǰ�� �Ǹ��ϴ� ���޾�ü�� ��� �ֹ�*/
SELECT o.order_num, TO_CHAR(o.order_date,'yyyy-mm-dd') order_date, 
        c.cust_id, TRIM(c.cust_name), oi.prod_id, TRIM(p.prod_name), v.vend_id, TRIM(v.vend_name)
FROM orders o, customers c, orderitems oi, products p, vendors v
WHERE o.order_num = oi.order_num
AND c.cust_id = o.cust_id
AND oi.prod_id = p.prod_id
AND v.vend_id = p.vend_id
AND oi.item_price LIKE '3%'
        
/*5. �ֹ����ڰ� 2004�⵵�� �߻��� �ֹ� �߿� �ֹ���ǰ�� 
�׸񰡰��� 9$�� �Ѵ� �׸񰡰ݿ� ���� 10%���� DC�Ͽ� �����Ͻÿ�*/
UPDATE orderitems 
SET item_price = item_price*0.9
WHERE order_num IN (SELECT oi.order_num
        FROM orderitems oi, orders o
        WHERE oi.order_num = o.order_num
        AND oi.item_price > =9
        AND TO_CHAR(o.order_date, 'yyyy') =2004)