<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
//ul자손 모든li중 첫번째
$(document).ready(function(){
	$("button").click(function(){
		$("ul li:first").hide();
	});
});

//ul별로 첫번째 li
$(document).ready(function(){
	$("button").click(function(){
		$("ul li:first-child").hide();
	});
});

</script>

</head>
<body>
<p>List 1:</p>
<ul>
<li>Coffee</li>
<li>Milk</li>
<li>Tea</li>
</ul>
<p>List 2:</p>
<ul>
<li>Coffee</li>
<li>Milk</li>
<li>Tea</li>
</ul>
<button>Click Me!</button>
</body>
</html>