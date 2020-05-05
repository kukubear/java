package hw_0808;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VendorServlet
 */
@WebServlet("/vend")
public class VendorServlet extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			doHandle(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			doHandle(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		VendDAO dao = new VendDAO();
		String command = request.getParameter("command");
		
		List list = null;

		String p_vend_id = request.getParameter("vend_id");
		System.out.println(p_vend_id);
		list = dao.vendList(p_vend_id);

		if ((command != null) && command.equals("vendlist")) {
			String _id = request.getParameter("vend_id");
			String _name = request.getParameter("vend_name");
			String _address = request.getParameter("vend_address");
			String _city = request.getParameter("vend_city");
			String _state = request.getParameter("vend_state");
			String _zip = request.getParameter("vend_zip");
			String _country = request.getParameter("vend_country");

			VendVO vo = new VendVO();

//			vo.setVend_id(_id);
//			vo.setVend_name(_name);
//			vo.setVend_address(_address);
//			vo.setVend_city(_city);
//			vo.setVend_state(_state);
//			vo.setVend_zip(_zip);
//			vo.setVend_country(_country);
			
		}
		
		String searchId = request.getParameter("searchId");
		list = dao.vendList(searchId);
		VendVO vo = new VendVO();
//		vo.setVend_id(searchId);

		out.print("<html><body>");
		out.print("<table border=1><tr align='center' bgcolor='lightpink'>");
		out.print(
				"<td>공급업체번호</td><td>공급업체이름</td><td>공급업체 주소</td><td>공급업체 시</td><td>공급업체 주</td><td>공급업체 우편번호</td><td>공급업체 국가</td><td>수정</td><td>삭제</td><tr>");

		for (int i = 0; i < list.size(); i++) {
			VendVO vo1 = (VendVO) list.get(i);
//			String vend_id = vo1.getVend_id();
//			String vend_name = vo1.getVend_name();
//			String vend_address = vo1.getVend_address();
//			String vend_city = vo1.getVend_city();
//			String vend_state = vo1.getVend_state();
//			String vend_zip = vo1.getVend_zip();
//			String vend_country = vo1.getVend_country();
			
//			out.print("<tr><td>" + vend_id + "</td><td>" + vend_name + "</td><td>" + vend_address + "</td><td>"
//					+ vend_city + "</td><td>" + vend_state + "</td><td>"
//					+ vend_zip + "</td><td>" + vend_country +"</td><td>"
//					+ "<a href='/pro10/vend?command=correctVend&vend_id=" + searchId + "&vend_id=" + vend_id
//					+ "'> 수정 </a></td>" + "<a href='/pro10/vend?command=delVend&vend_id=" + vend_id + "&vend_id="
//					+ vend_id + "'> 삭제 </a></td></tr>");
		}

		out.print("</table></body></html>");
		out.print("<a href='/pro10/vendinfo.html'>새로운 공급업체 정보 조회하기</a>");

	}

}
