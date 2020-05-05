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
	var jb =$('li').get(0);//0번쨰 요소 리턴
	$('ul').after('<p>'+jb.innerHTML+'</p>');
	
});
</script>
</head>
<body>
 <ul>
   <li>Lorem</li>
   <li>Ipsum</li>
 </ul>
 
</body>
</html>