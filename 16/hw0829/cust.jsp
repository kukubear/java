<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객 정보 조회</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	function fn_process(p_command) {
		$("#command").val(p_command); //command를 맨 위에 써야 조회를 2번 누르는 오류가 발생하지 않음
		var param = $("#frm").serialize(); // 모든 값을 한번에 넘길 수 있음(form에서 입력한 값들)
		//텍스트 박스로부터 입력받은 고객 번호 받아오기

		var _id = $('#cust_id').val();

		console.log(_id);
		console.log(param);

		

		//추가 시 값 초기화 후 종료
		if (p_command == 'add') {

			$('#frm')[0].reset(); //배열로 받기 때문에 인덱스 표시 필수
			return;
		} // command add check if end

		//조회 시 유효성 검사
		if (p_command == 'search' && _id == '') {
			alert("ID를 입력하세요");
			return;
		} //command search check if end 

		//저장 시 유효성 검사
		var v_id = $("#custId").val();

		if (p_command == 'save' && v_id == '') {
			alert("조회나 추가 후 저장을 선택해 주세요.");
			return;
		} // command save check if end

		$.ajax({

			type : "post",
			async : false,
			url : "http://localhost:8060/pro16/cust",
			data : param,
			dataType : "text", // dataType default = text / json으로 지정 시 자동 파싱
			//dataType text로 했을때 에러 화면에 값이 안뜸 -> 왜그런지 모르겠음......흠.....ㅜㅜ
			//json으로 해야 오류 안뜸

			success : function(data, textStatus) {
				var jsonInfo = JSON.parse(data);
				alert(data);
				
				console.log(data);
				if (p_command == 'search') {
					
					/*if(jsonInfo.error.error == 'Y'){
						alert(jsonInfo.error.error_text);
						return;
					} // json error check if end   */

					$('#custId').val(jsonInfo.customer.cust_id);
					$('#custName').val(jsonInfo.customer.cust_name);
					$('#custAddress').val(jsonInfo.customer.cust_address);
					$('#custState').val(jsonInfo.customer.cust_state);
					$('#custZip').val(jsonInfo.customer.cust_zip);
					$('#custCountry').val(jsonInfo.customer.cust_country);
					$('#custContact').val(jsonInfo.customer.cust_contact);
					$('#custEmail').val(jsonInfo.customer.cust_email);
					
					//고객 주와 고객국가 select 사용하기 위해서 아래와 같이
					/* $('#custState').html(""); //초기화
					$('#custState').prepend(
							"<option value= '"+ jsonInfo.customer.cust_state+"'>"
							+jsonInfo.customer.cust_state+"</option>");
					
					for(var i in jsonInfo.customer.cust_state){
						$('#cust_state').append(
								"<option value ='"+jsonInfo.customer.cust_state+"'>"
								+jsonInfo.state[i]+"</option>"
						);	
					} */
					
					/* $('#cust_country').html(""); // 초기화
					$('#cust_country').prepend(
						"<option value= '"+jsonInfo.customer.cust_country+"'>"
						+jsonInfo.customer.cust_country+"</option>"				
					);
					
					for(var i in jsonInfo.state.state){
						$('#cust_country').append(
											"<select><option value='"+jsonInfo.customer.cust_country+"'>"
											+jsonInfo.country[i]
											+"</option></select>");
						
					} */

				} //command search method if end
				else if(command =='save'){
				
					alert("저장을 완료했습니다.");
					
				}else {
					alert("고객이 존재하지 않습니다.");
				}

			}, // success end
			error : function(data, textStatus) {
				alert("에러가 발생했습니다.");
			}, // error end
			complete : function(data, textStatus) {
				//alert("작업을 완료했습니다.");
			} //complete end
		}); // ajax end
	}//process end
</script>
</head>
<body>
	<form name="frm" id="frm">
		<br> 고객번호 <input type="text" name="cust_id" id="cust_id" /> 
		<input type="hidden" name="command" id="command"> 
		<input type="button" id="btn_search" value="조회" onClick="fn_process('search')" /> 
		<input type="button" id="btn_add" value="추가" onClick="fn_process('add')" /> 
		<input type="button" id="btn_save" value="저장" onClick="fn_process('save')" />
		<input type ="button" id="btn_clear" value="삭제" onClick="fn_process('clear')" />  <br> <br>
		<table border="1">
			<tr align="center">
				<th bgcolor="lightpink">고객 번호</th>
				<td><input type="text" name="custId" id="custId">
				<input type="hidden" name="idCopy" id="idCopy"></td>
				
			</tr>

			<tr>
				<th bgcolor="lightpink" >고객이름</th>
				<td><input type="text" name="custName" id="custName"></td>
			</tr>

			<tr>
				<th bgcolor="lightpink">고객 주소</th>
				<td><input type="text" name="custAddress" id="custAddress"></td>
			</tr>

			<tr>
				<th bgcolor="lightpink">고객주</th>

				<td><input type="text" name="custState" id="custState" >
				</td>
			</tr>

			<tr>
				<th bgcolor="lightpink">고객 우편번호</th>
				<td><input type="text" name="custZip" id="custZip"></td>
			</tr>

			<tr>
				<th bgcolor="lightpink">고객국가</th>
				<td><input type="text"  name="custCountry" id="custCountry">
			</td>
			</tr>

			<tr>
				<th bgcolor="lightpink">고객 담당자</th>
				<td><input type="text" name="custContact" id="custContact"></td>
			</tr>

			<tr>
				<th bgcolor="lightpink">고객 메일주소</th>
				<td><input type="text" name="custEmail" id="custEmail"></td>
			</tr>
		</table>
	</form>
</body>
</html>