package hw_0813;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustServlet
 */
@WebServlet("/cust")
public class CustServlet extends HttpServlet {
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    

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

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String input_id = request.getParameter("input_id");
		String command = request.getParameter("command");
		
		CustDAO dao = new CustDAO();
		List custlist;
		
		if(command !=null && command.equals("modify")) {
			String mod_id = request.getParameter("mod_id");
			
		}
		
	}
	
	public List search(String id) {
		CustDAO dao = new CustDAO();
		CustBean vo = new CustBean();
	    vo.setId(id);   
	    
	    List list = dao.custList(id);
	    return list;
	}

}
