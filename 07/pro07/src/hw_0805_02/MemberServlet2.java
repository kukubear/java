package hw_0805_02;

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

import sec01.ex01.MemberDAO;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/member11")
public class MemberServlet2 extends HttpServlet {
	
    /**
     * Default constructor. 
     */
    public MemberServlet2() {
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		MemberDAO2 dao = new MemberDAO2();
		String input_id = request.getParameter("input_id");
		List list = dao.listMembers(input_id);
		
		
		out.print("<html><body>");
		out.print("<table border =1><tr align='center' bgcolor ='skyblue'>");
		out.print("<td>고객번호</td><td>고객이름</td><td>주문번호</td><td>상품번호</td><td>상품이름</td></tr>");
		
		for(int i=0; i<list.size(); i++) {
			MemberVO2 memberVO = (MemberVO2) list.get(i);
			String cust_id = memberVO.getCust_id();
			String cust_name = memberVO.getCust_name();
			String order_num = memberVO.getOrder_num();
			String prod_id = memberVO.getProd_id();
			String prod_name = memberVO.getProd_name();
			
			out.print("<tr><td>"+cust_id+"</td><td>"+cust_name+"</td><td>"+order_num+"</td><td>"+prod_id+"</td><td>"+prod_name+"</td></tr>");
			
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
