<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	isELIgnored="false"%>
	
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객 정보 조회</title>
</head>
<body>

	<br> 고객번호
	<input type="text" id="cust_id" />
	<input type="button" id="btn_search" value="조회" onClick="fn_process()" />
	<br>
	<br>
	<table border="1">
		<tr align="center">


			<th bgcolor="lightpink">고객 번호</th>
			<td><input type="text" id="custId"></td>
		</tr>

		<tr>
			<th bgcolor="lightpink">고객이름</th>
			<td><input type="text" id="custName"></td>
		</tr>

		<tr>
			<th bgcolor="lightpink">고객 주소</th>
			<td><input type="text" id="custAddress"></td>
		</tr>

		<tr>
			<th bgcolor="lightpink">고객주</th>
			
			<td><select>
			
			<option><script>
			/* //이렇게 하면 null됨
			var cust_info = document.getElementById("custState");
			var cust_state = cust_info[0].getAttribute("custState"); */
			
		
			</script>
			</option>
			</select></td>
		</tr>

		<tr>
			<th bgcolor="lightpink">고객 우편번호</th>
			<td><input type="text" id="custZip"></td>
		</tr>

		<tr>
			<th bgcolor="lightpink">고객국가</th>
			<td><select name="custCountry" id="custCountry"></select></td>
		</tr>

		<tr>
			<th bgcolor="lightpink">고객 담당자</th>
			<td><input type="text" id="custContact"></td>
		</tr>

		<tr>
			<th bgcolor="lightpink">고객 메일주소</th>
			<td><input type="text" id="custEmail"></td>
		</tr>
	</table>
	
<!-- script body안에 있는게 효율이 더 좋음 -->
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	function fn_process() {
		//텍스트 박스로부터 입력받은 고객 번호 받아오기
		var _id = $('#cust_id').val();

		//고객 번호 존재하지 않을 때 alert처리
		if (_id == '') {
			alert("고객이 존재하지 않습니다.");
			return;
		}

		$.ajax({

			type : "post",
			async : false,
			url : "http://localhost:8060/pro16/cust",
			dataType : "text",

			// 서블릿(CustInfo)에서 request.getParameter("id")로 받음!!
			data : {
				id : _id
			},

			success : function(data, textStatus) {
				//서버에서 전송한 JSON 데이터를 파싱 
				var jsonInfo = data;
				alert(data);
				console.log(jsonInfo);

				/* 			//배열로 받았으면 배열로!!!![[index]잊지 말기!!
				 $('#custId').val(jsonInfo.customer[0].cust_id);
				 $('#custName').val(jsonInfo.customer[0].cust_name);
				 $('#custAddress').val(jsonInfo.customer[0].cust_address);
				 $('#custState').val(jsonInfo.customer[0].cust_state);
				 $('#custZip').val(jsonInfo.customer[0].cust_zip);
				 $('#custCountry').val(jsonInfo.customer[0].cust_country);
				 $('#custContact').val(jsonInfo.customer[0].cust_contact);
				 $('#custEmail').val(jsonInfo.customer[0].cust_email); 
				 */

				$('#custId').val(jsonInfo.customer.cust_id);
				$('#custName').val(jsonInfo.customer.cust_name);
				$('#custAddress').val(jsonInfo.customer.cust_address);
				$('#custState').val(jsonInfo.customer.cust_state);
				$('#custZip').val(jsonInfo.customer.cust_zip);
				$('#custCountry').val(jsonInfo.customer.cust_country);
				$('#custContact').val(jsonInfo.customer.cust_contact);
				$('#custEmail').val(jsonInfo.customer.cust_email);

				console.log(custEmail);

			},
			error : function(data, textStatus) {
				alert("에러가 발생했습니다.");
			},
			complete : function(data, textStatus) {
				alert("작업을 완료했습니다.");
			}
		});
	}
</script>
</body>
</html>