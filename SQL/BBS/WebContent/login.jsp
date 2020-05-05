<%@ page language="java" contentType="text/html; charset=UTF-8"
	session ="true"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<jsp:useBean id="bean" class="model.Bean"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 화면</title>
</head>
<body>
<form method="post" action="login.do" >
<p>
아이디 : <br><input type ="text" name="input_id"><br><br>

</p>
<p>
비밀번호 : <br><input type="text" name="input_pwd"><br>

</p>
<input type="button" value="로그인">
<input type="hidden" name="command" value="">
</form>
</body>
</html>