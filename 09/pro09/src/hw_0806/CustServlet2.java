package hw_0806;

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
public class CustServlet2 extends HttpServlet {
	
    /**
     * Default constructor. 
     */
    public CustServlet2() {
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
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		CustDAO2 dao = new CustDAO2();
		String command = request.getParameter("command");
		
		
		String input_id = request.getParameter("cust_id");
	
		List list = dao.listMembers(input_id); //�޼ҵ� �̿��� ȸ������ ��ȸ
		
		out.print("<html><body>");
		out.print("<table border =1><tr align='center' bgcolor ='lightgreen'>");
		out.print("<td>����ȣ</td><td>���̸�</td><td>���ּ�</td><td>�ֹ���ȸ</td><td>����</td><</tr>");
		
		
		for(int i=0; i<list.size(); i++) {
			CustVO2 custvo = (CustVO2) list.get(i);
			String cust_id = custvo.getCust_id();
			String cust_name = custvo.getCust_name();
			String cust_address = custvo.getCust_address();
			String order_num = custvo.getOrder_num();
			
			out.print("<tr><td>"+cust_id+"</td><td>"+cust_name+"</td><td>"+cust_address+"</td><tr>"
			+"<a href ='/pro09/cust?command=checkOrder&order_num="+order_num+"'> �ֹ���ȸ</a>"
				+"<a href = '/pro09/cust?command=delMember&cust_id ="+cust_id+"'>����</a></td></tr>");
			
			}
			
		out.print("</table></body></html>");
			
			
		}
		
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	
	

}
