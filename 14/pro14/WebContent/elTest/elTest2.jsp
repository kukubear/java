<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>여러가지 산술연산자</title>
</head>
<body>
<h2>여러가지 산술연산자</h2>
<h1>
\${10+10}:${10+10}<br>
\${20-10}:${20-10}<br>
\${10*10}:${10*10}<br>
\${100/9}:${100/9}<br>
<%--div를 사용해 나누기 연산 --%>
\${100 div 9}:${100div9}<br>
\${100%}:${100%9}<br>
<%--mod를 사용해 나머지를 구함 --%>
\${100 mod 9}:${100 mod 9}<br>
</h1>
</body>
</html>