--0730
/*1. �ֹ���ȣ�� 20005, 20007�� �ֹ��� ��ǰ�߿� �� �ֹ������� 100���� ���� ��ǰ�� ��ǰ�̸�*/
SELECT oi.order_num, quantity ,prod_name
FROM orderitems oi, products p
WHERE order_num IN (20005,20007)
AND oi.prod_id = p.prod_id
AND quantity >=100;

/*2. DDL01�̳�  BRS01 ������ü���� ���� ��ǰ �� ������ 10���̻� �� ��ǰ�� �� �Ǹż���
   ���: ��ǰ��, ���Ǹż���*/
SELECT TRIM(p.prod_name), prod_id, v.vend_id
FROM products p, vendors v
WHERE v.vend_id IN( 'BRS01','DLL01')
AND 


SELECT item_price, quantity
FROM orderitems oi
WHERE oi.item_price >=10;

/*3. ������ ���ǿ� ���� ���� ����ȣ, ���̸�, ���ּҸ� �����Ͻÿ�
    ����: �ֹ��� �� ��ǰ�� ������ 2���̻��� ��*/
SELECT cust_id, cust_name, cust_address, order_num
FROM customers c, orders o
WHERE c.cust_id = o.cust_id;



SELECT sum(order_num), cust_id, 
/*4. ���� �ֹ��� ��ǰ�� ������ ���޾�ü�� ������ ���޾�ü��
    ���: ����,�Ѱ��޾�ü��, �ֹ��� ��ǰ�� ������ ���޾�ü ��*/
    
--p.44
/*4. ������ ���ǿ� ���� ��ǰ�� ��ǰ��ȣ, ��ǰ�̸�, ��ǰ���ݼ���, ��ǰ������ �����Ͻÿ�
��ǰ���ݼ���: ��ǰ������ 3$���̸� �����硯 11%���̸� ����ӡ� �������� �����롯
����: ���޾�ü�� �����ȣ ���� 2�ڸ��� ��44��, ��45��, ��99�� �� ���޾�ü���� ����ų�
�ֹ��� ���ڰ� 5���� �ƴ� ��ǰ*/
SELECT p.prod_id, TRIM(p.prod_name), p.prod_desc, DECODE(TRUNC(prod_price),3,'����',11,'���','����') prod_price
FROM products p
WHERE EXISTS(
SELECT *
FROM vendors v, orders o
WHERE (SUBSTR(v.vend_zip,1,2) IN('44','45','99'))
AND TO_CHAR(order_date, 'mm') <> '05'
)
--where���� <>������ �����ս��� ������ =�� ���� // sql�� ������ ������ ���ϴ� ���� ����

-- vendors //���޾�ü�� �����ȣ ���� 2�ڸ��� ��44��, ��45��, ��99�� �� ���޾�ü���� ����ų�
SELECT v. vend_zip
FROM vendors v
WHERE (SUBSTR(v.vend_zip,1,2) IN('44','45','99'))
--�ֹ��� ���ڰ� 5���� �ƴ� ��ǰ
SELECT order_date
FROM orders
WHERE TO_CHAR(order_date, 'mm') <> '05'

--? ������ ��� // �����ȣ�� ���� Type�� ���� 
--CASE WHEN�� SELECT������ ���԰��� -> �ڹ��� if���� ���
SELECT vend_id,
    CASE WHEN SUBSTR(vend_zip,1,2) ='44' THEN 'A'
        WHEN SUBSTR(vend_zip,1,2) ='99' THEN 'B'
        ELSE 'C'
        END AS resion_type
        FROM vendors

--���޾�ü�� �ֺ� ���� �÷����� �и��Ͽ� ����
SELECT SUM(CASE WHEN  vend_state ='MI' THEN 1 END) MI_CNT,
        SUM(CASE WHEN  vend_state ='OH' THEN 1 END) OH_CNT,
        SUM(CASE WHEN  vend_state ='CA' THEN 1 END) CA_CNT,
        SUM(CASE WHEN  vend_state ='NY' THEN 1 END) NY_CNT
FROM vendors


/*1. �ֹ��� �ֹ���ȣ, ����ȣ, �ֹ��ñ⸦ �����Ͻÿ�
�ֹ��ñ�: ���� 1~15�� ���̸� �����ϡ�, 16~31�� ���̸� �����ϡ�*/
SELECT order_num, cust_id,
        CASE WHEN TO_CHAR(order_date,'dd') <16  THEN '����'
        ELSE '����' 
        END AS order_period
FROM orders 

SELECT
/*2. �ֹ����� �ֹ���ȣ�� �ֹ����ɳ��ڸ� �����Ͻÿ�
�ֹ����ɳ���: �ֹ����ڰ� 1~15���̸� ���糯��, 16~31���̸� ������ 1��*/
SELECT order_num, cust_id,
        CASE WHEN TO_CHAR(order_date,'dd') <16  THEN TO_CHAR(SYSDATE,'yyyymmdd')
        ELSE ADD_MONTH(LAST_DAY(order_date)+1,-1),'yyyymmdd') 
        END AS order_period
FROM orders

/*3. �ֹ����� �ֹ���ȣ�� �ֹ����ɳ���(YYYY-MM-DD)�� �����Ͻÿ�
- �ֹ����ɳ���: ������ 10�ڸ��� 0�̸� 1��, 1�̸� 10��, 20�̸� 20��, 30�̸� 30��*/
SELECT order_num, cust_id,
        CASE WHEN TO_CHAR(order_date,'dd') <16  THEN '����'
        ELSE '����' THEN
        END AS order_period
FROM orders

--������ �Է� 
INSERT INTO customers 
VALUES ('1000000016','TOY Land', '123 Any Street','New York','NY','11111','USA',NULL,NULL);

INSERT INTO customers(cust_id, cust_name, cust_address, cust_city, cust_state,cust_zip, cust_country,cust_contact)
VALUES ('1000000017','TOY Land', '123 Any Street','New York','NY','11111','USA',NULL)

CREATE TABLE custnew AS
SELECT *
FROM customers;

DELETE FROM custnew;

/*? SELECT ������ ����� ������ �Է�
// �� �÷� �� ������ Ÿ���� ��ġ�ؾ� �Ѵ�*/
INSERT INTO custnew(cust_id, cust_name, cust_address, cust_city, cust_state, cust_zip, cust_country)
SELECT cust_id, cust_name, cust_address, cust_city, cust_state, cust_zip, cust_country
FROM customers;

INSERT INTO customers
VALUES('1000000006','ȫ�浿','����� ���ʱ� ������� 459', 'Seoul', NULL, '51243', 'KOR','Park','aaa@naver.com');

INSERT INTO customers
VALUES('1000000008','qkr�浿','����� ���ʱ� ������� 459', 'Seoul', NULL, '51742', 'KOR','Kim','bbb@daum.net');

INSERT INTO customers
VALUES('1000000009','���ֿ�','����� ���ʱ� ������� 459', 'Seoul', NULL, '53782', 'KOR','Kim','ccc@google.co.kr');

--2�� ��ǰ���̺� ���� �߰��ϱ�
INSERT INTO products
VALUES('KR01','BRS01','�Ƿη�����', '10', 'TV�����׷����� ������ �Ƿηθ� �������� ����');

INSERT INTO products
VALUES('KR02','BRS01','������', '15', '���� �����ϴ� ������� ����');

INSERT INTO products
VALUES('KR03','DLL01','�±�V�κ�Ʈ', '100', ' ����� �ڱ��ϴ� ��� ���� �±�V�κ�Ʈ');

--3�� �ֹ� ���̺� ������ ������ �߰��ϱ�
INSERT INTO orders
VALUES('20010',TO_DATE('2019-02-01'),'1000000008');

INSERT INTO orders
VALUES('20011',TO_DATE('2019-05-04'),'1000000007');

--4�� �ֹ� ��ǰ ���̺� ������ ������ �߰��ϱ�
INSERT INTO orderitems
VALUES ('20010','1','KR01','2','9');

INSERT INTO orderitems
VALUES ('20011','1','KR02','2','16');

INSERT INTO orderitems
VALUES ('20011','2','KR03','3','95');

--update �÷� ���� �������� ��� ����
UPDATE customers
SET cust_email = 'kim@naver.com',
    cust_contact ='Sam Roberts'
WHERE cust_id = '1000000005';

--������ ������Ʈ 1�� 
/*1. �����̺��� ����ȣ�� ��1000000006���� ���� ����ڸ� ��Jin������ �����Ͻÿ�*/
UPDATE customers
SET cust_contact ='Jin'
WHERE cust_id = '1000000006';

/*2. �ֹ����̺��� �������� ��KOR���� ���� �ֹ��� �׸������ +1���� ���Ͻÿ�*/
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

/*3. �ֹ����ڰ� 2019�⵵�� �߻��� �ֹ� �߿� �ֹ���ǰ�� �׸񰡰��� 90$�� �Ѵ� �׸񰡰ݿ� ���� 10%���� DC�Ͽ� �����Ͻÿ�*/
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

/*4. �ֹ���ǰ�߿� ��ǰ�� ��ǰ���ݺ��� �ֹ���ǰ�� �׸񰡰��� ��� �׸񰡰��� ��ǰ�� ��ǰ�������� �����Ͻÿ�*/
--���� �����ʿ�
UPDATE orderitems
SET item_price = (SELECT prod_price
                    FROM products
                    WHERE item_price>prod_price)
;

SELECT ;
/*1. ��ǰ��ȣ�� KR03�� ��ǰ�� ��ǰ���̺��� �����ϰ� �ֹ���ǰ���̺����� �����Ͻÿ�*/
DELETE FROM orderitems
WHERE prod_id ='KR03';

/*2. ���޾�ü�� ��BRE02���� ���޾�ü�� ������ ��ǰ�� ���������� ��ǰ�� �ֹ��� �ֹ������� �����Ͻÿ�*/
DELETE FROM orderitems
WHERE prod_id = (
    SELECT prod_id 
    FROM products
    WHERE vend_id = 'BRE02'
    AND prod_desc LIKE '%������%'
)

DELETE FROM orders a
WHERE 