<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*"
	import="day_0809.*"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="m" class ="day_0809.MemberBean" scope ="page"/>
<%
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");
String name = request.getParameter("name");
String email = request.getParameter("email");

//MemberBean m = new MemberBean(id,pwd, name, email);
m.setId(id);
m.setPwd(pwd);
m.setName(name);
m.setEmail(email);

MemberDAO dao = new MemberDAO();
dao.addMember(m);
List membersList = dao.listMembers();
%>
<!DOCTYPE html>
<html>
<head>
<style>
h1{
text-align: center;
}

</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원정보 출력</h1>
<table align ="center" width ="100%">
<tr align ="center" bgcolor ="lightpink">

<td width="7%">아이디</td>
<td width="7%">비밀번호</td>
<td width="5%">이름</td>
<td width="11%">이메일</td>
<td width="5%">가입일자</td>
</tr>

<%
	if(membersList.size()==0){
		
%>
<tr>
<td colspan ="5">
<p align ="center"><b><span style="font-size:9pt;">
등록된 회원이 없습니다.</span></b></p>
</td>
</tr>

<%
}else {
	for(int i=0; i<membersList.size(); i++){
		MemberBean bean = (MemberBean) membersList.get(i);
	
%>
<tr align ="center">
<td>
<%=bean.getId() %>
</td>
<td>
<%=bean.getPwd() %>
</td>
<td>
<%=bean.getName() %>
</td>
<td>
<%=bean.getEmail() %>
</td>
<td>
<%=bean.getJoinDate() %>
</td>
<%
	}
}

%>
<tr height ="1" bgcolor="lightyellow">
<td colspan="5"></td>
</tr>
</table>
</body>
</html>