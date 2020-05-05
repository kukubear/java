<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="java.util.*,hw_0813.*"
    pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="c" class="hw_0813.CustBean" scope="page" />
<jsp:setProperty name ="c" property ="*" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객 정보 조회 결과</title>
</head>
<body>
<%String _cust_id = request.getParameter("cust_id");

CustBean vo = new CustBean();
vo.setId(_cust_id);
CustDAO dao = new CustDAO();
List custsList = dao.custList(_cust_id);

%>
<table align ="center" width ="100%">
<tr align ="center" bgcolor ="lightpink">
<td width ="11%">고객 번호</td>
<td width ="11%">고객 이름</td>
<td width ="15%">고객 주소</td>
<td width ="7%">고객 주 </td>
<td width ="7%">고객<br>우편번호</td>
<td width ="7%">고객 국가</td>
<td width ="11%">고객<br>담당자</td>
<td width ="15%">고객<br>메일주소</td>
<td width ="7%">수정</td>
</tr>


<tr align = "center">
<td>
<jsp:getProperty property="id" name="c"/>
</td>
<td>
<jsp:getProperty property="name" name="c"/>
</td>
<td>
<jsp:getProperty property="address" name="c"/>
</td>
<td>
<jsp:getProperty property ="state" name="c" />
</td>
<td>
<jsp:getProperty property ="zip" name ="c" />
</td>
<td>
<jsp:getProperty property ="country" name="c"/>
</td>
<td>
<jsp:getProperty property ="contact" name ="c" />
</td>
<td>
<jsp:getProperty property ="email" name="c" />
</td>
<td>
<input type = "button" value="수정" onClick="location ='modifyCust.jsp'">
</td>
</tr>

</table>
</body>
</html>