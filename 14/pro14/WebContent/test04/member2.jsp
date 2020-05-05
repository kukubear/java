<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="java.util.*"
    import="sec01.ex01.*"
    pageEncoding="UTF-8"
    isELIgnored="false"
%>
<%@ taglib  prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<style>
h1 {
text-align: center;
}
</style>
  <meta charset="UTF-8">
<title>회원 정보 출력창</title> 
</head>
<body>
<h1>회원 정보 출력</h1>
<%
   request.setCharacterEncoding( "utf-8" );
	String command=request.getParameter("command");

%>
 <table border='1' width='800' align='center'>
   <tr align='center' bgcolor='#FFFF66'> 
     <td>아이디</td>
     <td>비밀번호</td>
     <td>이름</td>
     <td >이메일</td>
     <td>수정</td>
</tr>

<c:forEach var="member" items="${membersList}">
<c:set var="id" value="${member.id}"/>

<c:url var="url" value="member">
<c:param name="command" value="modSearch" />
<c:param name ="mod_id" value="${ member.id}"/>
</c:url>

     <tr align="center">
       <td>${member.id}</td>
       <td>${member.pwd}</td>
       <td>${member.name}</td>
       <td>${member.email}</td>
       <td><a href='${url}'>수정 </a></td>
     </tr>
   
</c:forEach>	
</table>
</body>
</html>