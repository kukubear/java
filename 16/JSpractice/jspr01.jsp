<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
 function join(){
   var input = prompt('이름이 무엇입니까?', '이름을 입력해 주세요');
   if(input == null){
      alert('가입이 취소되었습니다');
  }else{
      alert(input + '님 가입을 축하합니다');
   }
 }
</script>
</head>
<body>
<input type="button" value="가입하기" onClick="join()">

</body>
</html>