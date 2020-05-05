<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>암호변경</title>
</head>
<body>
<form>
현재 암호 : <input type="password" name="password"><br>
새 암호 : <input type="password" name="newPW"><br>
</form>
<c:if test="${empty param.password }">
암호를 입력하세요!!!
현재 암호 : <input type="password" name="password"><br>
새 암호 : <input type="password" name="newPW"><br>
<a href="">
</c:if>
<c:if test="${param.password!=password }">
현재 암호를 잘못입력하셨습니다!
현재 암호 : <input type="password" name="password"><br>
새 암호 : <input type="password" name="newPW"><br>
</c:if>
<c:if test="${param.password=newPW }">
동일한 암호로 변경이 불가합니다.
현재 암호 : <input type="password" name="password"><br>
새 암호 : <input type="password" name="newPW"><br>
</c:if>
<input type="button" value="암호변경" onClick="location.href='First.jsp'">
</body>
</html>