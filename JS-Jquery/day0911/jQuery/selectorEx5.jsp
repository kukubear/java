<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
//부모 중에 div.cd가 있어야 적용
$('p.ef').parent('div.cd').css('color','red');
	
});
</script>
</head>
<body>
<ul>ul (부모)
<li>li(형제)</li>
 <li>li (형제)</li>
 <li class="me">li (나)</li>
 <li>li (형제)</li>
 <li>li (형제)</li>
</ul>
</body>
</html>