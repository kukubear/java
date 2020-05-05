package hw_0806;

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
@WebServlet("/cust3")
public class OrderServlet3 extends HttpServlet {
	
    /**
     * Default constructor. 
     */
    public OrderServlet3() {
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
		CustDAO2 dao = new CustDAO2();
		List list = dao.listMembers();
		
		out.print("<html><body>");
		out.print("<table border =1><tr align='center' bgcolor ='lightgreen'>");
		out.print("<td>고객번호</td><td>고객이름</td><td>고객주소</td><td>주문조회</td><td>삭제</td></tr>");
		
		for(int i=0; i<list.size(); i++) {
			CustVO2 custvo = (CustVO2) list.get(i);
			String cust_id = custvo.getCust_id();
			String cust_name = custvo.getCust_name();
			String cust_address = custvo.getCust_address();
		
			
			out.print("<tr><td>"+cust_id+"</td><td>"+cust_name+"</td><td>"+cust_address+"</td><tr>"+"<a href ='/pro07/cust2?command=checkOrder&cust_id="+cust_id+"'> 주문조회</a>"+"<a href = '/pro07/cust2?command=delOrder&cus_id ="+cust_id+"'>삭제</a></td></tr>");
			
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
