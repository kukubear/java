package sec01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
    /**
     * @see HttpServlet#HttpServlet()
     */
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		String user_email = request.getParameter("user_email");
		String user_hp = request.getParameter("user_pw");
		String user_address=request.getParameter("user_address");
		
		out.print("<html><body>");
		String data ="�ȳ��ϼ���!<br> �α����ϼ̽��ϴ�.<br><br>";
		//data+="<html><body>";
		data+="���̵� : "+user_id;
		data+="<br>";
		data+="�н����� : "+user_pw;
		data+="<br>";
		data+="email : "+user_email;
		data+="<br>";
		data+="�޴���ȭ : "+user_hp;
		data+="<br>";
		data+="�ּ� : "+user_address;
		data+="</body></html>";
		
		out.print(data);
		
	}

}
