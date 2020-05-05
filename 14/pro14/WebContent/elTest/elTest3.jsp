<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>여러가지 비교 연산자</title>
<h2>여러가지 비교 연산자</h2>
<h3>
<%--서로 같은지 비교할 때는 ==나 eq를 연산자로 사용함 --%>
\${10==10}:${10==10}<br>
\${10 eq 10}:${10 eq 10}<br><br>

\${"hello"=="hello"}:${"hello"=="hello"}<br>
\${"hello"eq"hello"}:${"hello"eq"hello"}<br><br>

<%--서로 다른지 비교할 때는 !=나 ne를 연산자로 사용함 --%>
\${20!=10}:${20!=10}<br>
\${20 ne 10}:${20 ne 10}<br><br>

\${"hello"!="apple"}:${"hello"!="apple"}<br>
\${"hello"ne"apple"}:${"hello"ne"apple"}<br><br>

\${10 < 10}:${10 < 10}<br>
\${10 lt 10}:${10 lt 10}<br><br>

\${100>10}:${100>10}<br>
\${100 gt 10}:${100 gt 10}<br><br>


\${100 <= 10}:${10 <= 10}<br>
\${100 le 10}:${100 le 10}<br><br>

\${100>=10}:${100>=10}<br>
\${100 ge 10}:${100 ge 10}<br><br>

</h3>
</head>
<body>

</body>
</html>