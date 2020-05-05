<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>elTest4</title>
</head>
<body>
<h1>여러가지 논리연산자</h1>
<h2>
<%--연산자 양쪽 값이 true일 때만 true르 반환합니다. --%>
\${(10==10)&&(20==20)}:${(10==10)&&(20==20)}<br>
\${(10==10)and(20==20)}:${(10==10)and(20==20)}<br><br>

<%--연산자 양쪽 값 중 하나라도 true이면 true르 반환합니다. --%>
\${(10==10)||(20!=30)}:${(10==10)||(20!=30)}<br>
\${(10==10)or(20!=30)}:${(10==10)or(20!=30)}<br><br>

\${!(20==10)}:${!(20==10)}<br>
\${not(20==10)}:${not(20==10)}<br><br>
</h2>
</body>
</html>