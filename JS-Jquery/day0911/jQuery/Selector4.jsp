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
	$(":checked").wrap("<span style=background-color:red'>");
	
});
</script>

</head>
<body>
<form action="">
 11: <input type="text" name="user"><br>
 22: <input type="checkbox"name="vehicle"><br>
 33: <input type="checkbox" name="vehicle"checked="checked"><br>
 44: <input type="checkbox"name="vehicle"><br>
 <input type="submit">
</form>
</body>
</html>