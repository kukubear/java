/*0725 �ǽ�*/
/*1. ���������� ���̸��� ��The���� ���۵ǰ� �������� ��USA���� ���� �ּ������� ������ Format���� �����Ͻÿ�    
   (������� ������ �ʰ� ó���Ѵ�)    
   Format = ���ּҡ� ������/���� �����֡� ���������ȣ��(����������)��
*/
SELECT TRIM(cust_address) || ' ' || TRIM(cust_city) || ' ' || TRIM(cust_state) || ' ' || TRIM(cust_zip) || ' (' ||TRIM(cust_country)|| ' )' 
From customers
Where cust_name Like 'The'
And cust_country = 'USA';
/*2. �ֹ���ǰ�׸񿡼� �ֹ���ȣ�� ��20005��, ��20007�� �� �ֹ��� ���� �ֹ���ȣ, ��ǰ��ȣ�� �ֹ��ѱݾ�(�׸����*�׸񰡰�) �� 
   �����Ͻÿ�*/
SELECT TRIM(prod_name) || '['|| TRIM(prod_price) || ']'
From products
Where vend_id NOT IN('BRS01','DDL01');
 /*3. ��ǰ�������� ���޾�ü��ȣ�� ��BRS01��, ��DLL01���� �ƴ� ��ǰ�̸��� ��ǰ������ ������ Format���� �����Ͻÿ�
   Format = ��ǰ�̸���[����ǰ���ݡ�]��*/
