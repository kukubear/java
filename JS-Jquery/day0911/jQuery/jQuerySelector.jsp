<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
//나 자신
$(document).ready(function(){
	$("button").click(function(){
		$(this).hide();
	});
});
//intro를 클래스로 가지는 P태그
$(document).ready(function(){
	$("button").click(function(){
		$("p.intro").hide();
	});
});
//button tag or input type이 button인 태그
$(document).ready(function(){
	$("button").click(function(){
		$(":button").hide();
	});
});

</script>
</head>
<body>
<h2 class ="intro">This is a heading</h2>
<p class ="intro">This is a paragraph</p>
<p>This is another paragraph.</p>
<button>Click Me!</button>
</body>
</html>