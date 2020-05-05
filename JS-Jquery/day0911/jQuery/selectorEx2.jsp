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
	$("p:nth-child(3)").css("background-color","yellow"); // ptag3개를 세는게 아니라 그 안에서 3번째 자식을 세는 것
	//$("p:first-of-type").css("background-color","yellow");
	//$("p:first-child").css("background-color","yellow");
});
</script>
</head>
<body>
<h1>11:This is a heading inbody</h1>
<p>12:AAAAAAAAA</p>
<p>13:BBBBBBBBB</p>
<div style="border:1pxsolid;">
 <span>21:This is a span element in div</span>
 <p>22:AAAAAAAAA</p>
 <p>23:BBBBBBBBB</p>
 <p>24:CCCCCCCC</p>
</div><br>
<div style="border:1pxsolid;">
 <p>31:AAAAAAAAA</p>
 <p>32:BBBBBBBBB</p>
 <p>33:CCCCCCCC</p>
</div>
<p>14:CCCCCCCCC</p>
</body>
</html>