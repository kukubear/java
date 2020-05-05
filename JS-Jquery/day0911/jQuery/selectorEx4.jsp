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
 <div class="ab">
   <p>Hello</p>
   <div class="cd">
     <p class="ef">
       Lorem Ipsum Dolor
     </p>
   </div>
 </div>
</body>
</html>