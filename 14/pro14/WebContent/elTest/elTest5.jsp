<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
 <%--useBean 생성 --%>
<jsp:useBean id="m1" class="sec01.ex01.MemberBean" scope="page"/>

<%--Bean의 name의 속성에 값을 설정 --%>
<jsp:setProperty name="m1" property="name" value="이순신"/>

<%--ArrayList 객체를 빈으로 생성 --%>
<jsp:useBean id="m2" class ="java.util.ArrayList" scope="page" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현 언어의 여러가지 연산자들</title>
</head>
<body>
empty연산자
<h2>
<%--m1 name의 속성에 값이 설정되어 있으므로 false를 반환 --%>
\${empty m1 }:${empty m1 }<br>
<%--m1 name의 속성에 값이 설정되어 있으므로 true를 반환 --%>
\${not empty m1 }:${not empty m1 }<br><br>

<%--ArrayList 객체인 m2는 비어있으므로 true를 반환 --%>
\${empty m2 }:${empty m2 }<br>
<%--false를 반환 --%>
\${not empty m2 }:${not empty m2 }<br><br>

<%--문자열에 대해 false를 반환 --%>
\${empty "hello" }:${empty "hello" }<br>
<%--null은 true를 반환 --%>
\${empty null }:${empty null }<br>
<%--빈 문자열은 true를 반환 --%>
\${empty "" }:${empty "" }<br><br>


</h2>
</body>
</html>