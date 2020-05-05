--0725 sql ���� 
--COALESE�� NULLIF�� �˾Ƶθ� ������
--���ڵ� ���� ->�ڹ��� case���� ����

--���޾�ü�̸��� ���� ->Ʈ���ִ� ������ �ƴϸ� 50�� ����
SELECT vend_id, LENGTH(TRIM(vend_name))
FROM vendors;

--���޾�ü �ּҸ� �ҹ��� or �빮�ڷ�
SELECT vend_id, LOWER(vend_address), UPPER(vend_address)
FROM vendors;

--�����ڸ���
SELECT vend_id, SUBSTR(vend_address,1,3), UPPER(vend_address)
FROM vendors;

--���� ��ü�ϱ�
SELECT vend_id, REPLACE(vend_address,'Street','Road')
FROM vendors;

--NULL�� �ƴ� ù��° ��
SELECT vend_id, vend_state, vend_city, COALESCE(vend_state, vend_city)
FROM vendors
WHERE vend_id = 'FNG01';

--���޾�ü�ְ� CA�̸� 1, NY�̸� 2 ��� �ƴϸ� 3
SELECT vend_id,vend_state, DECODE(TRIM(vend_state),'CA',1,'NY',2,3)
FROM vendors;

--NULL�̸� �ٸ� ������
SELECT NVL(cust_email,'test@naver.com')
FROM customers;

/*1. ���� �ּ� �߿� �ҹ��ڷ� ��south���� �� �������� ������ Format���� �����Ͻÿ�(��������)
- Format: ���̸���/�����ּ�, �ҹ��ڷ�*/
SELECT TRIM(LOWER(cust_name)) ||'/'|| TRIM(LOWER(cust_address))
FROM customers
WHERE cust_address Like '%south%';

/*2. �ֹ���ǰ�� �ֹ���ȣ�� ��20005��, ��20007���� �ƴ� ��ǰ�����ڵ带 �����Ͻÿ�
- ��ǰ�����ڵ�: ��ǰ��ȣ�� ���� 2�ڸ�*/
SELECT order_num, SUBSTR(prod_id,1,2)
FROM orderItems 
WHERE prod_id NOT IN('20005','20007');

/*3. ���� ���̸��� ���ּ������� �����Ͻÿ�
- ���ּ�����: ���ּ��߿� Drive�� Car�� ����*/
SELECT cust_name, REPLACE(cust_address,'Drive','Car')
FROM customers; 

/*4. ���޾�ü�� ���޾�ü��ȣ�� ��br���� ���۵Ǵ� ���޾�ü�̸��� ���޾�ü������ȣ�� ���޾�ü�̸��� ������������ �����Ѵ�
- ���޾�ü������ȣ: �����ȣ�� �տ� 2�ڸ�*/
SELECT vend_name, SUBSTR(vend_zip, 1,2)
FROM vendors
WHERE vend_id Like 'BR%'
ORDER BY vend_name DESC;

/*5. ���޾�ü�� ���޾�ü��ȣ�� ��BRE02���� �ƴ� ���޾�ü�̸��� ���޾�ü���������ȣ�� �����Ѵ�
- ���޾�ü���������ȣ: ���޾�ü������ȣ�� 44�̸� A, 99�̸� B, 11�̸� C �������� D*/
SELECT vend_name, DECODE(SUBSTR(vend_zip, 1,2), 44 , 'A', 99, 'B', 11 , 'C', 'D')
FROM vendors
WHERE vend_id <>'BRE02';

/*6. ���� ����� ���ּ������� �����Ѵ�
- ���ּ�����: �������ּ� or ���ּ�, �������ּҰ� ������ �������ּҰ� �켱*/
SELECT cust_name, COALESCE(cust_email,cust_address)
FROM customers;

/*7. ��ǰ�� ��ǰ�� ��bear���� ����ִ� ��� ��ǰ�� ���� ��ǰ�̸��� �����ϴµ� bear�� toy�� �����Ͽ� �����Ѵ�*/
SELECT REPLACE(prod_name, 'bear','toy')
FROM products
WHERE prod_name Like '%bear%' ;

--�ø�, ����
SELECT prod_id, prod_price,CEIL(prod_price), FLOOR (prod_price)
FROM products;

--�ݿø�, ����
SELECT prod_id, prod_price,ROUND(prod_price,1), TRUNC(prod_price, 1)
FROM products;

-- ����, ������
SELECT prod_id, prod_price , POWER(prod_price,2) SQRT(prod_price)
FROM products;

-- ������ 
SELECT prod_id, prod_price, MOD(prod_price, 2)
FROM products;

/*1. ��ǰ�� ��ǰ��ȣ�� ��br���� ���۵Ǵ� ��ǰ�� ������ �Ҽ��� ù°�ڸ����� �ݿø� �Ͽ� ��ǰ�̸��� �Բ� �����Ͻÿ�
ROUND �Ҽ��� ù�����ڸ� --> 0�� ���� ���� */
SELECT prod_id, ROUND(prod_price, 0)

FROM products 
WHERE LOWER(prod_id) like 'br%';

/*2. �ֹ���ǰ�߿� ������ 10%�̻��� �ֹ���ȣ�� ��ǰ��ȣ, �׸񰡰��� �����Ͻÿ�
- �׸񰡰�: �׸񰡰��� �Ҽ��� �������� ó���Ͽ� ����*/
SELECT order_num, prod_id, TRUNC(item_price,0)
FROM orderitems
WHERE item_price >=10;

--���� ��¥�� �ֹ���¥���� ������
SELECT order_num, TO_CHAR (order_date,'yyyy-mm-dd'), MONTHS_BETWEEN(sysdate, order_date)
FROM orders;

--�ֹ���¥���� 10������ �߰� 
SELECT order_num, TO_CHAR(order_date,'YYYY-mm-dd'), (ADD_MONTHS(order_Date, 10),'YYYY-MM-DD')
FROM orders;

--�ֹ��� ���� ������ ��¥
SELECT order_num, TO_CHAR(order_date, 'yyyy-mm-dd'), TO_CHAR(LAST_DAY(order_date),'yyyy-mm-dd')
FROM orders;

--Ư����¥�� �ֹ���¥���� ����
SELECT order_num, TO_CHAR(order_Date,'yyyy-mm-dd'), MONTH_BETWEEN(TO_DATE('2018-12-05','yyyy-mm-dd'),order_date)
FROM orders;

-- ���ڸ� ���ڷ�
SELECT order_num, quantity, 'A'||TO_CHAR(quantity)
FROM orderitems;

-- ��¥�� ���ڷ�
SELECT order_num, TO_CHAR(order_date, 'yyyy-mm-dd'), TO_CHAR(sysdate,'yyyy/mm/dd HH24:MI:ss')
FROM orders;

-- 2004�⿡ �ֹ��� �׸��� �ֹ���ȣ
SELECT order_num
FROM orders
Where TO_NUMBER(TO_CHAR(order_date, 'yyyy'))=2004;

-- BETWEEN�������� ����
SELECT order_num
FROM orders
where order_date Between TO_DATE('20040101') AND TO_DATE('20041231');

/*1. ���ֹ����� �ֹ����� 2���� ��� �ֹ���ȣ�� �ֹ���ȣ�� ������������ �Ͽ� �����Ѵ�*/
SELECT order_num
FROM orders
WHERE TO_NUMBER(TO_CHAR(order_date, 'mm'))=02
order by order_num DESC;

/*2. ���ֹ����� �ֹ��Ͽ� +1���� �� ���ڰ� �ش� �ֹ����� ������ ���ڿ� ���� �ֹ���ȣ�� ������������ �����Ѵ�*/
SELECT order_num, order_date 
FROM orders
WHERE order_date +1 = LAST_DAY(order_date)
order by order_num DESC;

/*3. ���ֹ����� �����ϰ� �ֹ��ϰ��� ���̰� 185������ �Ѵ� �ֹ���ȣ�� �����Ѵ�*/
SELECT order_num
FROM orders 
Where MONTH_BETWEEN(SYSDATE, order_date)>185;

/*4. �� �ֹ����� ����ȣ�� 1�� ������ �ֹ��� �ֹ���¥�� ������ �����Ͻÿ�*/
SELECT order_date
FROM orders
WHERE SUBSTR(cust_id, LENGTH(cust_id),1)=1;





