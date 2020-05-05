<%@ page language="java" contentType="text/html; charset=UTF-8"
	import ="java.util.*, sec01.ex01.*,sec01.ex02.*"
    pageEncoding="UTF-8"
    isELIgnored ="false"
    %>
    
    <%
    //회원 정보를 표시하기 전에 한글 인코딩 설정!!
    request.setCharacterEncoding("utf-8");
    %>
<jsp:useBean id="m" class="sec01.ex01.MemberBean"/>
<%--회원 가입창에 전송된 회원정보를 빈 속성에 설정 --%>
<jsp:setProperty name ="m" property="*"/>
<jsp:useBean id="addr" class ="sec01.ex02.Address" />

<jsp:setProperty name="addr" property="city" value="서울" />
<jsp:setProperty name ="addr" property="zipcode" value="07654" />


<%
m.setAddr(addr);

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
<td width ="7%"><b>아이디</b></td>
<td width ="7%"><b>비밀번호</b></td>
<td width ="5%"><b>이름</b></td>
<td width ="5%"><b>이메일</b></td>
<td width ="5%"><b>도시</b></td>
<td width ="5%"><b>우편번호</b></td>
</tr>

<tr align =center>
<%--HashMap 이름 뒤에 .(마침표)연산자로 저장 시 시용한 key를 사용하여 value를 가져옵니다.--%>
<td>${m.id }</td>
<td>${m.pwd }</td>
<td>${m.name }</td>
<td>${m.email }</td>
<%--속성들의 getter를 두번 호출해서 주소를 출력 --%>
<td><%=m.getAddr().getCity() %></td>
<td><%=m.getAddr().getZipcode() %></td>
</tr>
<tr align =center>
<td>${m.id }</td>
<td>${m.pwd }</td>
<td>${m.name }</td>
<td>${m.email }</td>
<%--자바 빈의 속성 이름과 마침표 연산자를 이용하여 주소를 출력 --%>
<td>${m.addr.city}</td>
<td>${m.addr.zipcode}</td>
</tr>
</table>
</body>
</html>