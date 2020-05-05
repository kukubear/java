/*1.������ ����ȣ, ���̸�, ���ּ�, �ֹ��� �� �ݾ�,  �ֹ��� ��ǰ �߿� ���� �ֱٿ� �ֹ��� ��ǰ���� �����Ͻÿ�
    - �ֹ��� �� �ݾ�: �ش���� �ֹ���ǰ���� �ֹ��� ��ǰ�� �׸񰡰��� SUM
    - �ֹ��� ��ǰ �߿� ���� �ֱٿ� �ֹ��� ��ǰ�� :�ֹ���ǰ���� �ش���� �ֹ��� ��ǰ�� ���� �ֱٿ� �ֹ��� ��ǰ�� ��ǰ��
    ��ǰ�� ���� ���϶� �����ٶ� ������� ���*/
    
SELECT c.cust_id, TRIM(c.cust_name) cust_name, TRIM(c.cust_address) cust_address, (SELECT SUM(oi.item_price)
                                                    FROM orderitems oi, orders o
                                                    WHERE oi.order_num=o.order_num
                                                    AND c.cust_id = o.cust_id) total_price, --�ֹ��� �� �ݾ�
                                                    
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

/*2. ��ǰ���ֹ��� �� �߿� ������,������� �� �ֹ����� �����Ͻÿ�
   - ���: ������,�������, �ֹ���
   - ����: �ֹ����� 2���̻��� ��츸 ��ȸ*/
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

/*3. ������ ���ǿ� ���� ��ǰ�� ��ǰ��ȣ, ��ǰ�̸�, ��ǰ���ݼ���, ��ǰ������ �����Ͻÿ�
   - ��ǰ���ݼ���: ��ǰ������ 3$���̸� �����硯 11$���̸� ����ӡ��������� �����롯
   - ����: ���޾�ü�� �����ȣ ���� 2�ڸ��� ��44��,��45��, ��99�� �ΰ��޾�ü���� ����ų�
              �ֹ��� ���ڰ� 5���� �ƴ� ��ǰ*/
SELECT prod_id, TRIM(prod_name), prod_desc, DECODE(SUBSTR(prod_price,1,2), 3,'����', 11,'���','����') price
FROM products p, (SELECT MAX(order_date)
                    FROM orders
                    WHERE TO_NUMBER(TO_CHAR(order_date, 'MM')) != '05'
                    )
WHERE vend_id IN(SELECT vend_id
                    FROM vendors
                    WHERE SUBSTR(vend_zip,1,2) IN('44','45','99')) 

                    
/*4. �ֹ���ǰ�߿� ��ǰ�� ��ǰ���ݺ��� �ֹ���ǰ�� �׸񰡰��� ��� �׸񰡰��� 
��ǰ�� ��ǰ�������� �����Ͻÿ�*/
UPDATE orderitems oi
SET item_price = (SELECT prod_price
                    FROM products 
                    WHERE prod_id =oi.prod_id)
WHERE prod_id IN(SELECT p.prod_id 
                    FROM products p
                    WHERE p.prod_price < oi.item_price)


