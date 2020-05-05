<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function fn_addMember(){
	var frmMember = document.frmMember;
	var member_id = frmMember.id.value;
	var name = frmMember.name.value;
	var password = frmMember.password.value;
	var checkPW = frmMember.checkPW.value;
	
	if(member_id.length ==0 || member_id==""){
		alert("ID는 필수입니다.");
	}else if(name.length==0||name ==""){
		alert("이름은  필수입니다.")
	}else if(password.length == 0 ||password==""){
		alert("비밀번호는 필수입니다.")
	}else if(password!=checkPW){
		alert("비밀번호가 일치하지 않습니다.")
	}else{
		frmMember.method="post";
		frmMember.action="pro14/hw_0819/member";
		frmMember.submit();
	}
}

</script>
<meta charset="UTF-8">



<title>회원가입창</title>
</head>
<body>
<form name="frmMember" action="First.jsp">
ID : <input type="text" name="id"><br>
이름 : <input type="text" name="name"><br>
암호 : <input type="password" name="password"><br>
확인 : <input type="password" name="checkPW"><br>
<input type="button" value="가입" onClick="fn_addMember()">
<input type="hidden" name="command" value="addMember">
</form>
</body>
</html>