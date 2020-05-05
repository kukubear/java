<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="hw_0809.*"
    import ="java.util.*" 
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문내역 출력</title>
</head>
<body>
<h3>주문정보 출력</h3>

<%
request.setCharacterEncoding("utf-8");

List orderlists = (List)request.getAttribute("orderlists");
%>
<table border=1 width=800 align=center>
<tr align=center bgcolor="lightpink">
<td>주문번호</td>
<td>주문 항목번호</td>
<td>제품 ID</td>
<td>제품명</td>
<td>항목수량</td>
<td>항목가격</td>
<td>수정</td>
<td>삭제</td>
</tr>
<%
for(int i=0;i<orderlists.size();i++){
	OrderVO vo = (OrderVO) orderlists.get(i);
	String num = vo.getNum();
	String itemNum = vo.getItemNum();
	String id = vo.getId();
	String name = vo.getName();
	String quantity = vo.getQuantity();
	String price = vo.getPrice();

%>
<tr align =center bgcolor ="lightyellow">
<td><%=num %></td>
<td><%=itemNum %></td>
<td><%=id %></td>
<td><%=name %></td>
<td><%=quantity %></td>
<td><%=price %></td>
</tr>
<%} %>
</table>
</body>
</html>