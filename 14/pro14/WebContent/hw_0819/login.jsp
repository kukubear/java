<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.sql.Timestamp"
	session ="true"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:useBean id="m" class="hw_0819.MemberBean"/>
<c:set var="id" scope="session"/>
<c:set var="pw" scope="session"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 창</title>
</head>
<body>
<form action="result.jsp"> <%--아이디 비밀번호 결과창으로 전송 --%>
아이디 : <input type ="text" name="id" ><br>
비밀번호 : <input type ="password" name="pw" ><br>
<input type="button" value="로그인" onClick="loaction.href='result.jsp'">

</form>
</body>
</html>