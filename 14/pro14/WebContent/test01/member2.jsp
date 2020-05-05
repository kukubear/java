<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored ="false"
    %>
    <%
    //회원 정보를 표시하기 전에 한글 인코딩 설정!!
    request.setCharacterEncoding("utf-8");
    //표현식으로 출력하기 위해 getParameter()메서드를 이용해 회원정보를 가져옴
    String id = request.getParameter("id");
    String pwd = request.getParameter("pwd");
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 출력창</title>
</head>
<body>
<table border ="1" align = "center">
<tr align = "center" bgcolor ="lightpink">
<td width ="20%"><b>아이디</b></td>
<td width ="20%"><b>비밀번호</b></td>
<td width ="20%"><b>이름</b></td>
<td width ="20%"><b>이메일</b></td>
<td width ="20%"><b>주소</b></td>
</tr>

<tr align =center>
<%--param객체를 이용해 getParameter메서드를 이용하지 않고 바로 회원정보 출력 --%>
<td>${param.id }</td>
<td>${param.pwd }</td>
<td>${param.name }</td>
<td>${param.email }</td>
<td>${requestScope.address }</td>
</tr>
</table>
</body>
</html>