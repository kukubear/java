<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="java.util.*"
    import="sec02.ex01.*"
    pageEncoding="UTF-8"
    isELIgnored="false"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean  id="vo"  class="sec01.ex01.MemberBean"  scope="request"/>
<c:set var="command" value="${param.command }" scope="request"/>
<%
   request.setCharacterEncoding( "utf-8" );
%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form name="frm" method="post" action="member" encType="UTF-8">
	ID :<input type="text" name="id" value="${vo.id}"><br>
	비밀번호 :<input type="text" name="pwd" value="${vo.pwd}"><br>
	이름 :<input type="text" name="name" value="${vo.name}"><br>
	이메일:<input type="text" name="email" value="${vo.email}"><br>

<c:if test="${not empty command}">
	<c:if test="${command==modSearch}">
	<input type="submit" name='submit' value="수정">
	<input type='hidden' name='command' value='modUpdate'   /> 
	</c:if>
	<c:if test="${command==addSearch}">
	<input type="submit" name='submit' value="추가"> 
	<input type='hidden' name='command' value='addUpdate'   />
	</c:if>
</c:if>	

	</form>
</body>
</html>