<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>catch tag</title>
</head>
<body>
<c:catch var="ex">
name 파라미터 값 = <%=request.getParameter("name") %><br>
<% if(request.getParameter("name").equals("test")){
	${param.name}은 test입니다.%>

<% }%>
</c:catch>
<p>
<c:if test="${ex!=null }">
Exception 발생<br>
${ex}
</c:if>
</body>

</html>