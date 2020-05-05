<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>암호 변경</title>
</head>
<body>
	<form method="post" action="changepw.do">
	현재 암호:<br><input type = "password" name="old_pwd"><br>
	새 암호:<br><input type = "password" name="new_pwd"><br>
	<input type="submit" value="암호 변경">
	</form>
</body>
</html>