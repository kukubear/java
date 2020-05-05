<%@ page language="java" contentType="text/html; charset=UTF-8"
	session="true"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="input_id" value="${param.input_id }" scope="session" />
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript">
	function fn_logout(){
		var frmLogout = document.frm;
		frmLogout.method = "post";
		frmLogout.action = "logout.do";
		frmLogout.submit();
	}

</script>
<title>로그인 후 초기화면</title>
</head>
<body>
	<form name = "frm" method="post">
	${param.input_id}님 안녕하세요.<a href="/logout.do" onclick="fn_logout()">[로그아웃하기]</a>
	<a href = "/BBS/changepw.do">[암호변경하기]</a><br><br>
	<a href = /view/guestbook.jsp>방명록</a><br>
	<a href = >게시판</a>
	</form>
</body>
</html>