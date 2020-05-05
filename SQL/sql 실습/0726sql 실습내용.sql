/*1. ��ǰ�ֹ����� �ֹ���ȣ, ��ǰ��ȣ, ��ǰ����������ġ�� �����Ͻÿ�
    - ��ǰ����������ġ: ��ǰ��ȣ�� ������ 2��° 1�ڸ��� ���� 0�̸� ��������,0�̾ƴϸ� ���ؿܡ�
   -�Ѱ���(�׸����*�׸񰡰�)�� 500$�̻��� �ֹ�*/
SELECT order_num, prod_id, DECODE(SUBSTR(prod_id, -2), '0%','����','�ؿ�')
From orderitems
Where (quantity*item_price)>500;
   
/*2. �ֹ����� �ֹ���ȣ�� �ֹ����ɳ���(YYYY-MM-DD)�� �����Ͻÿ�
    - �ֹ����ɳ���: ������ 10�ڸ��� 0�̸� 1��,1�̸� 10��, 20�̸� 20��,30�̸� 30��*/
SELECT order_num, DECODE(SUBSTR(order_date,-2,1),'0','1��','1','10��','2','20��','3','30��')
From orders;


/*3. ��ǰ�̸��� ��ǰ���� ��king���̶�� �ܾ ���� ��ǰ������ �Ҽ��� 1�ڸ��� 9�� �ƴ� ��ǰ��ȣ�� �����Ͻÿ�
*/   
SELECT prod_id
FROM products
WHERE TRUNC(prod_price,0) <> 9
AND prod_name  = '%king%'
AND prod_desc = '%king%';


--0726 �������� 
--? AVG(): NULL ���� �ִ� ��� ��꿡�� ���ܵȴ� 
--// Products ���̺� �ִ� �����ǰ�� �������
SELECT AVG(prod_price)
FROM products;

--// DLL01�� ���޾�ü�� ���� ��ǰ ���
SELECT AVG(prod_price) 
FROM products
WHERE vend_id = 'DLL01';

/*? COUNT()
- COUNT(*): ���̺��� ��� ���� ����, NULL�� ����
- COUNT(�÷�): �÷��� NULL���� ������ ���� ����*/
SELECT count(*) AS num_cust
FROM customers;

--// cust_email ���� ���� �ִ� ���� ���� ���
SELECT count(cust_email) AS num_cust
FROM customers;

/*? MAX(): ������ ������ ���� ū ���� ��ȯ
- TEXT�� ��밡��, NULL���� ���õȴ�
// Products ���̺��� ������ ���� ��� ��ǰ�� ����*/
SELECT MAX(prod_price) AS max_price
FROM products;

/*? MIN(): ������ ������ ���� ���� ���� ��ȯ
- TEXT�� ��밡��, NULL���� ���õȴ�
// Products ���̺��� ������ ���� ������ ��ǰ�� ����*/
SELECT MIN(prod_price) AS min_price
FROM products;

/*? SUM(): ������ ������ ��� ���� ���� �հ�
- NULL���� ���õȴ�
// ��� �ֹ��� ��ǰ�� ������ �հ�*/
SELECT SUM(quantity) AS items_ordered
FROM Orderitems;

--// �� �ֹ��� ���� �� �ݾ��� ��ȯ
SELECT SUM(item_price*quantity) AS total_price
FROM orderitems
WHere order_num = 2005;

/*1. ���ֹ����� �ֹ����ڰ� ���� �ֱ��� ���ڿ� ���� ������ ���ڸ� �����Ͻÿ�*/
SELECT MAX(order_date) AS max_date, MIN(order_date) AS min_date
FROM orders;

/*2. �ֹ���ǰ���� ��ǰ��ȣ�� BN���� �����ϴ� �� �ֹ��� �ѱݾ�(�׸����*�׸񰡰�)�� ���� ū �ݾ��� �����Ͻÿ�*/
SELECT MAX(item_price*quantity) AS total_price
FROM orderitems
WHERE prod_id LIKE 'BN%' 

/*3. �ֹ���ǰ���� ��ǰ��ȣ�� BR01�� BR03�� ��ǰ�� �ֹ��� �׸������ ����� �����Ͻÿ�*/
SELECT AVG(quantity) 


/*? �׷츸���
- ��ø�� �׷��� ���� ��� �����ʹ� ������ ������ �׷��� �������� ���ȴ�
- GROUP BY�� �׷�ȭ �Ǹ� �ش� �÷��� SELECT���� ��Ÿ���� �Ѵ�
- NULL���� �׷����� �з��ȴ�*/
--// ���޾�ü�� ��ǰ ��
SELECT vend_id, COUNT(*) AS num_prods
FROM Products
GROUP BY vend_id;

/*? ���͸� �׷�: �׷��� ������� �� �׷������� �׷��Լ��� ���� ���͸��� ����
- WHERE: �׷�ȭ �ϱ� ���� ���͸� ����
- HAVING: �׷�ȭ �� �Ŀ� ���͸� ����*/
SELECT cust_id, COUNT(*) AS orders
FROM orders
GROUP BY cust_id
HAVING COUNT(*) >=2;

--// ������ 4�̻��� ��ǰ�� �� �� �̻� ���� ���޾�ü�� ����
SELECT vend_id, COUNT(*) AS num_prods
FROM products
WHERE prod_price >=4
GROUP BY vend_id
HAVING COUNT(*)>=2;

--// ORDER BY�� �Բ� ���
SELECT order_num, COUNT(*) AS items
FROM Orderitems
GROUP by order_num
HAVING COUNT(*)>=3
ORDER BY items, order_num;

-- �ֹ��� ��ǰ�� ������
SELECT COUNT (DISTINCT prod_id)
FROM orderitems;

-- �ֹ��� ��ǰ�� �� �ֹ�����
SELECT prod_id, SUM(quantity)
FROM orderitems
GROUP BY prod_id;

-- �ֹ��� ��ǰ�� �� �ֹ������� 100���� ���� ��ǰ�� ��ǰ��ȣ
SELECT prod_id, SUM(quantity)
FROM orderitems
GROUP BY prod_id
HAVING SUM(quantity)>100;

-- �ֹ���ȣ�� 20005, 20007�� �ֹ��� ��ǰ�߿� �� �ֹ������� 100���� ���� ��ǰ�� ��ǰ��ȣ
SELECT prod_id, SUM(quantity)
FROM orderitems
WHERE order_num IN(20005, 20007)
GROUP BY prod_id
HAVING SUM(quantity) >100;

/*1. �ֹ���ǰ�� �ֹ���ȣ�� �ֹ���ȣ�� �ֹ���ǰ�� ���� �����Ͻÿ�
���: �ֹ���ȣ, �ֹ���ǰ�Ǽ� */
SELECT order_num, COUNT(prod_id) --SUM(quantity)
FROM orderitems
GROUP BY order_num;

/*2. �ֹ����� �ֹ����ں� �ֹ��� ���� ���� �����Ͻÿ�
���: �ֹ�����(YYYY-MM-DD), ���� ��*/
SELECT TO_CHAR(order_date,'yyyy-mm-dd'), COUNT(DISTINCT cust_id) --DISTINCT�� �ߺ������ؾ� ��Ȯ�� ������ ����
FROM orders
GROUP BY order_date;

/*3. ��ǰ���� ���޾�ü��ȣ�� ��ǰ�� ���� �����Ͻÿ�
���: ���޾�ü��ȣ, ��ǰ�Ǽ�*/
SELECT vend_id, COUNT(prod_name)
FROM products
GROUP BY vend_id;

/*4. �� �߿� �����ȣ�� 4�� ���۵Ǵ� ���� ���� �����Ͻÿ�
���: ���� ��*/
SELECT COUNT(cust_id)
FROM customers 
WHERE cust_zip LIKE '4%'
GROUP BY cust_zip;

/*5. �� �߿� �̸��� �ּҰ� ���� ���� ���� �����Ͻÿ�
���: ���� ��*/
SELECT COUNT(cust_name)
FROM customers
WHERE cust_email is NULL
GROUP BY cust_email;

/*6. ��ǰ�߿� ���޾�ü�� ��ǰ������ ����� �����Ͻÿ�
���: ���޾�ü��ȣ, ��հ���*/
SELECT vend_id, AVG(prod_price)
FROM products
GROUP BY vend_id;

/*7. ������ �ֺ� ���� ���� �����Ͻÿ�
���: ����, ���Ǽ�*/
SELECT cust_state, COUNT(cust_name)
FROM customers 
GROUP BY cust_state;

/*8. ��ǰ���� ���޾�ü�� BRS01, DLL01�� ��ǰ�߿� ������ ��ǰ�� ������ 5$�̻��� ���޾�ü��ȣ�� �����Ͻÿ�
���: ���޾�ü��ȣ */
SELECT vend_id
FROM products
WHERE vend_id IN('BRS01', 'DLL01') AND prod_price>5
GROUP BY vend_id;

/*9. �ֹ����� 1���� �ֹ��� �ֹ��߿� ����ʰ� �ֹ��� ����ȣ�� ����
���: ����ȣ�ֹ�����(YYYY-MM-DD), ����ȣ*/
SELECT MAX(TO_CHAR(order_date,'yyyy-mm-dd')), cust_id
FROM orders
WHERE TO_CHAR(order_date,'mm')='01'
GROUP BY cust_id;

/*? IN���ȿ� �������� ����ϱ�
- ���������� ���� �����Ͽ� ����� �����ϰ� �� ����� �������� ���� ������ �����Ѵ�
// ��ǰ��ȣ�� RGAN01�� ��ǰ�� �ֹ��� ��ID����*/
SELECT cust_id
FROM Orders
WHERE order_num IN(SELECT order_num
                    FROM  orderitems
                    WHERE prod_id = 'RGAN01'); -->������ IN�� ��� ����

/*// �������� �ȿ� �������� ���
// ��ǰ��ȣ�� RGAN01�� ��ǰ�� �ֹ��� ���� �̸��� ����ó ����*/
SELECT cust_name, cust_contact
FROM Customers
WHERE cust_id IN(SELECT cust_id
                   FROM orders
                  WHERE order_num IN(SELECT order_num
                                    FROM orderitems
                                    WHERE prod_id = 'RGAN01'));

/*? ���������� ����ʵ�� ���
- �ߺ��� �÷����� �����ϱ� ���� ���̺������ ����*/
SELECT cust_name,cust_state,
        (SELECT COUNT(*)
         FROM  orders
         WHERE Orders.cust_id = Customers.cust_id) 
FROM customers
order by cust_name;

--? FROM���� SQL ����ϱ�
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
    
/*1. ��ǰ�� ����ID�� ��ǰ�̸�, ��ǰ����, ��ǰ������ �����Ͻÿ�
����: ���޾�ü�� ������ ��USA���� ���޾�ü�� ��ǰ*/
SELECT prod_id, prod_name, prod_price, prod_desc
FROM products
WHERE vend_id IN (SELECT vend_id --vend_country(X)
             FROM  vendors
             WHERE vend_country ='USA');


/*2. ���� ����ȣ, ���̸�, ���ּ�, �������ּҸ� �����Ͻÿ�
����: ���� �����ּҰ� �ְ� �ֹ��� �� ���̶� �� ��*/
SELECT cust_id, cust_name, cust_address, cust_email
FROM customers a
WHERE cust_email is not null 
AND EXISTs (SELECT order_num, cust_id
            FROM orders 
            WHERE cust_id = a.cust_id);


/*AND EXISTs (SELECT order_num, cust_id
            FROM orders 
            WHERE cust_id is not null);*/

/*3. ���޾�ü�� ���޾�ü��ȣ, ���޾�ü�̸�, ���޾�ü�ּ�, ���޾�ü�� ��ǰ ���� �����Ͻÿ�
����: ���޾�ü�� ��ǰ���� 1�� �̻��� ���޾�ü*/
SELECT vend_id, vend_name, vend_address,
        (SELECT *
        FROM products)
      
FROM vendors
WHERE  

/*4. �ֹ���ǰ �߿� ��ǰ���� �׸񰡰��� ���� ���� ��ǰ��ȣ�� �����Ͻÿ�
���: ��ǰ��ȣ, �׸񰡰�(��ǰ�� ���� ���� �׸񰡰�)*/
SELECT 
FROM
WHERE

/*? ����: ���̺� ���� ������ �÷����� ������Ѽ� ���յ� ������ �����ϴ� ���
- ������ ���� �� ���� ������ ��������
// ��ǰ�� ���� ���޾�ü ������ �Բ� ���� -> �ؿ� ANSI SQL �������� �ϴ� �Ͱ� ���� ���*/
SELECT vend_name, prod_name
FROM VENDORS, Products
WHERE vendors.vend_id = Products.vend_id;

-- ���� �ÿ� ���������� ���̺��� ���踦 �������� ������ cartesian product
SELECT vend_name, prod_name
FROM vendors, Products;

--? ANSI SQL - ���� ����
SELECT vend_name, prod_name, prod_price
FROM vendors INNER JOIN products
    ON vendors.vend_id = products.vend_id;
    
/*? ���� ���̺� ����
// ��ǰ�� ���� ���޾�ü ������ �ֹ��������� ����*/
SELECT vend_name, prod_name, prod_price, quantity
FROM ORDERITEMS, vendors, products
WHERE PRODUCTs.vend_id = vendors.vend_id
AND Orderitems.prod_id = products.prod_id
AND order_num = 2007;

--��ǰ��ȣ�� RGAN01�� �ֹ����̸��� ����ó ����
SELECT cust_name, cust_contact
FROM customers, orders, orderitems
WHERE customers.cust_id = orders.cust_id
AND orderitems.order_num = orders.order_num
AND prod_id = 'RGAN01';

/*? ���̺� ��Ī���
// ��ǰ��ȣ�� RGAN01�� �ֹ����̸��� ����ó ����*/
SELECT cust_name, cust_contact
FROM customer C, Orders O, Orderitems oi
WHERE c.cust_id = O.cust_id
AND oi.order_num = o.order_num
AND prod_id ='RGAN01';

/*? ���� ���̺� ����
// Jim Jones��� ����� ���ϴ� ȸ���� ��� �� ������� �����ּ� ����*/
SELECT cust_id, cust_name, cust_contact
FROM customers
WHERE cust_name = (SELECT cust_name
                    FROM customers
                    WHERE cust_contact = 'Jim Jones');

/* ���� ������ �������� ����*/
SELECT c1.cust_id, c1.cust_name, c1.cust_contact
FROM customers c1, customers c2
WHERE c1.cust_name = c2.cust_name
AND c2.cust_contact = 'Jim Jones';

/*���ν� ��ü �÷� ��ȸ ó��*/
SELECT c.*, o.order_num, o.order_date, oi.prod_id
FROM customers c, orders O,orderitems oi
WHERE C.cust_id = o.cust_id
AND oi.order_num = o.order_num
AND prod_id = 'RGAN01';

/*1. �ֹ��� �������� �����Ͽ� ������ ����� �����Ͻÿ�
���: �ֹ���ȣ, �ֹ�����, ����ȣ, ���̸�, ���ּ�, ����, �������ּ�*/
SELECT a.order 

