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
	var jb =$('li').get();//선택요소 배열로 리턴
	for(var i =0; i<jb.length; i++){
		$('div').append('<p>'+jb[i].innerHTML+'</p>');
	}
});
</script>
</head>
<body>
 <ul>
   <li>Lorem</li>
   <li>Ipsum</li>
 </ul>
 <div></div>
</body>
</html>