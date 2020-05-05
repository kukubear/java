package hw_0809;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/order")
public class OrderServlet extends HttpServlet {
	
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doHandle(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		OrderDAO dao = new OrderDAO();
		String command = request.getParameter("command");
		System.out.println("command ->"+command);
		
		String num = request.getParameter("_num");
		System.out.println("num->"+num);
			
	
		OrderVO ordervo = new OrderVO();
		
		if(command!=null && command.equals(ordervo.getNum())) {
			ordervo.setNum(num);
			List orderlists = dao.OrderLists(ordervo);
			request.setAttribute("orderlists", orderlists);
			RequestDispatcher dispatch = request.getRequestDispatcher("Order.jsp");
			dispatch.forward(request, response);
		}
		
	
		
		

		
		
	}

}
