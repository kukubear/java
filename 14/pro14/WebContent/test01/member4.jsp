<%@ page language="java" contentType="text/html; charset=UTF-8"
	import ="java.util.*, sec01.ex01.*"
    pageEncoding="UTF-8"
    isELIgnored ="false"
    %>
    <%
    //회원 정보를 표시하기 전에 한글 인코딩 설정!!
    request.setCharacterEncoding("utf-8");
    %>
<jsp:useBean id="m1" class="sec01.ex01.MemberBean"/>
<%--회원 가입창에 전송된 회원정보를 빈 속성에 설정 --%>
<jsp:setProperty name ="m1" property="*"/>
<%--memberList로 ArrayList 객체 생성 --%>
<jsp:useBean id="membersList" class ="java.util.ArrayList" />

<%
//자바 코드로 새로운 회원정보를 저장하는 memberbean객체를 생성
MemberBean m2 = new MemberBean("son","1234","손흥민","son@test.com");
membersList.add(m1);
membersList.add(m2);
%>
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
<%--인덱스가 0이므로 첫 번째 회원 정보를 출력합니다.  --%>
<td>${membersList[0].id }</td>
<td>${membersList[0].pwd }</td>
<td>${membersList[0].name }</td>
<td>${membersList[0].email }</td>
</tr>
<tr align =center>
<%--인덱스가 1이므로 두 번째 회원 정보를 출력합니다. --%>
<td>${membersList[1].id }</td>
<td>${membersList[1].pwd }</td>
<td>${membersList[1].name }</td>
<td>${membersList[1].email }</td>

</tr>
</table>
</body>
</html>