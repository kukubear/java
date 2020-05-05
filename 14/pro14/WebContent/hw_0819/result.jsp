<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored ="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	request.setCharacterEncoding("utf-8");
%>



<!DOCTYPE html>
<html>
<head>
<script type ="text/javascript">
function frm_chgPW(){
		var frmChgPW = document.loginResult;
		frmChgPW.method="post";
		frmChgPW.action="changePassword.jsp"
		frmChg.submit();
	
}
</script>
<meta charset="UTF-8">
<title>로그인 결과</title>
</head>
<body>
<form name="loginResult" method="post" action="member">
<c:if test="${empty param.id }">
 아이디를 입력하세요.<br>
 <a href="login.jsp">로그인창</a>
 </c:if>
 <c:if test="${not empty param.id }">
	<h3>환영합니다. <c:out value="${param.id }" />님!!!</h3>

<input type="submit" value="로그아웃">
<input type="hidden" name="command" value="logout">
<input type="button" value="암호변경" onClick="frm_chgPW()">

</c:if>
</form>
</body>
</html>