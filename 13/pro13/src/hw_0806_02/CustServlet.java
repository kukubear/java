package hw_0806_02;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet("/cust")
public class CustServlet extends HttpServlet {

	/**
	 * Default constructor.
	 */
	public CustServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		CustDAO dao = new CustDAO();
		String command = request.getParameter("command");
		String input_id = request.getParameter("cust_id");
		
		List list = dao.listCust(input_id);
		
		
		out.print("<html><body>");
		out.print("<table border =1><tr align='center' bgcolor ='lightpink'>");
		out.print("<td>고객번호</td><td>고객이름</td><td>고객주소</td><td>주문조회</td><td>삭제</td></tr>");

		for (int i = 0; i < list.size(); i++) {
			CustnOrderVO custvo = (CustnOrderVO) list.get(i);
			String cust_id = custvo.getId();
			String cust_name = custvo.getName();
			String cust_address = custvo.getAddress();
			String order_num = custvo.getOrderNum();

			out.print("<tr><td>" + cust_id + "</td><td>" + cust_name + "</td><td>" + cust_address + "</td></tr>"
					+ "<a href ='/pro13/cust?command=listOrder&order_num =" + order_num + "'>주문조회</a>"
					+ "<a href = '/pro13/cust?command=delCust&cust_id =" + cust_id + "'>삭제</a></td></tr>");

		}

	}
	
}
