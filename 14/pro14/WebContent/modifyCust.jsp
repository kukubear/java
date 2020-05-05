<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="java.util.*, hw_0813.*"
    pageEncoding="UTF-8"
    %>
<jsp:useBean id="c" class="hw_0813.CustBean" scope ="page"/>
<%
request.setCharacterEncoding("utf-8");
String command = (String) request.getAttribute("command");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정 및 추가</title>
</head>
<body>
<form name ="frm" method ="post" action ="cust" encType="utf-8">
	고객번호 : <input type="text" name="id" value=<jsp:getProperty name="c" property="id"/>>
	고객이름 : <input type ="text" name="name" value=<jsp:getProperty name ="c" property="name"/>>
	고객 주소 : <input type ="text" name="address" value=<jsp:getProperty name ="c" property ="address" />>
	고객 주 :  <input type ="text" name="state" value =<jsp:getProperty name="c" property="state"/>>
	고객 우편번호 :  <input type ="text" name="zip" value =<jsp:getProperty name="c" property="zip"/>>
	고객 국가 : <input type ="text" name="country" value =<jsp:getProperty name="c" property="country"/>>
	고객 연락담당자 : <input type ="text" name="contact" value =<jsp:getProperty name="c" property="contact"/>>
	고객 이메일 : <input type ="text" name="email" value =<jsp:getProperty name="c" property="email"/>>
	</form>
<%
if("add".equals(command)){	
%>
<input type ="submit" name='submit' value="추가">
<input type ="hidden" name="command" value="updateCust" />
<%} %>
<%
if("modify".equals(command)){
%>
<input type ="submit" name="submit" value="추가">
<input type ="hidden" name="command" value="modifyCust" />
<% } %>

</form>
</body>
</html>