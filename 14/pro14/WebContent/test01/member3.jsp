<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored ="false"
    %>
    <%
    //회원 정보를 표시하기 전에 한글 인코딩 설정!!
    request.setCharacterEncoding("utf-8");
    %>
<jsp:useBean id="m" class="sec01.ex01.MemberBean"/>
<jsp:setProperty name ="m" property="*"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 출력창</title>
</head>
<body>
<table align = "center" border ="1">
<tr align = "center" bgcolor ="lightpink">
<td width ="20%"><b>아이디</b></td>
<td width ="20%"><b>비밀번호</b></td>
<td width ="20%"><b>이름</b></td>
<td width ="20%"><b>이메일</b></td>

</tr>

<tr align =center>
<%--표현식을 이용해 회원정보 출력 --%>
<td><%=m.getId() %></td>
<td><%=m.getPwd() %></td>
<td><%=m.getName() %></td>
<td><%=m.getEmail() %></td>
</tr>
<tr align =center>
<%--빈 id와 속성이름으로 접근해 회원 정보를 출력 --%>
<td>${param.id }</td>
<td>${param.pwd }</td>
<td>${param.name }</td>
<td>${param.email }</td>

</tr>
</table>
</body>
</html>