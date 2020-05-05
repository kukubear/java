package hw_0806_02;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/order")
public class OrderServlet extends HttpServlet {
	
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		// TODO Auto-generated method stub
	}

	/*
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/*
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		CustDAO dao = new CustDAO();
		
		String input_id = request.getParameter("input_id");
		List list = dao.listMembers(input_id);

		out.print("<html><body>");
		out.print("<table border =1><tr align='center' bgcolor ='lightpink'>");
		out.print("<td>�ֹ���ȣ</td><td>��ǰ��</td><td>�׸����</td><td>�׸񰡰�</td><td>����</td></tr>");
					
		for(int i=0; i<list.size(); i++) {
			
			CustnOrderVO custvo = (CustnOrderVO) list.get(i);
			String orderNum = custvo.getOrderNum();
			String prodName = custvo.getProdName();
			String quantity = custvo.getQuantity();
			String itemPrice = custvo.getItemPrice();
			
			out.print("<tr><td>"+orderNum+"</td><td>"+prodName+"</td><td>"+quantity+"</td><td>"
					+itemPrice+"</td><td>"
			+"<a href ='/pro13/order?command=delOrder&order_num="+orderNum+"'>����</a></td></tr>");			
		}
		
		out.print("</table></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	

}
