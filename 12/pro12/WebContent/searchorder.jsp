<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문 정보 검색</title>
</head>
<body>
<form method ="post" action ="/pro12/order">
<h3>조회할 주문번호를 입력하세요.</h3>
주문번호 : <input type ="text" name = "num">
<input type ="submit" value ="조회하기">
<input type ="hidden" name ="command" value="num">
</form>
</body>
</html>