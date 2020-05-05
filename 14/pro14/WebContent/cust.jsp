<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객 정보 조회</title>
</head>
<body>
<form method ="post" action ="cust">
<h3>정보 조회를 원하시는 고객 번호(고객ID)를 입력해주세요.</h3>
고객번호 : <input type="number" name="input_id">
<input type="submit" value="조회">
<input type ="submit" value ="고객추가" onClick ="location.href='modifyCust.jsp?command=add'">

</form>
</body>
</html>