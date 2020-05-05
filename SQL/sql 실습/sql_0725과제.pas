/*0725 실습*/
/*1. 고객정보에서 고객이름이 ‘The’로 시작되고 고객국가가 ‘USA’인 고객의 주소정보를 다음의 Format으로 추출하시오    
   (빈공백은 나오지 않게 처리한다)    
   Format = 고객주소’ ‘고객시/도’ ‘고객주’ ‘고객우편번호’(‘고객국가’)’
*/
SELECT TRIM(cust_address) || ' ' || TRIM(cust_city) || ' ' || TRIM(cust_state) || ' ' || TRIM(cust_zip) || ' (' ||TRIM(cust_country)|| ' )' 
From customers
Where cust_name Like 'The'
And cust_country = 'USA';
/*2. 주문제품항목에서 주문번호가 ‘20005’, ‘20007’ 인 주문에 대해 주문번호, 제품번호와 주문총금액(항목수량*항목가격) 을 
   추출하시오*/
SELECT TRIM(prod_name) || '['|| TRIM(prod_price) || ']'
From products
Where vend_id NOT IN('BRS01','DDL01');
 /*3. 제품정보에서 공급업체번호가 ‘BRS01’, ‘DLL01’이 아닌 제품이름과 제품가격을 다음의 Format으로 추출하시오
   Format = 제품이름’[’제품가격’]’*/
