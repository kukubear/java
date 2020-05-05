package hw_0807;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductsServlet
 */
@WebServlet("/product")
public class ProductsServlet extends HttpServlet {
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			doHandle(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		ProductsDAO dao = new ProductsDAO();
		String command = request.getParameter("command");
		List list = null;
		
		
		if(command != null && command.equals("delProd")) {
			String id = request.getParameter("id");
			dao.delProd(id);
		} else if(command != null && command.equals("addProd")) {
			String id = request.getParameter("id");
			String name = request.getParameter("name");
			double price = Double.parseDouble(request.getParameter("price"));
			String desc = request.getParameter("desc");
			String vendId = request.getParameter("vend");
			
			dao.addProd(id, name, price, desc, vendId);
			
		}
		
		String prodId = request.getParameter("prodId");
		String vendId = request.getParameter("vendId");
		list = dao.listProducts(prodId, vendId);

		
		out.print("<html><body>");
		out.print("<table border=1><tr align='center' bgcolor='lightyellow'>");
		out.print("<td>제품번호</td><td>제품명</td><td>제품가격</td><td>제품설명</td><td>공급업체명</td><td>삭제</td></tr>");
		
		for(int i=0;i<list.size();i++) {
			ProductVO vo = (ProductVO)list.get(i);
			String prod_id = vo.getProd_id();
			String prod_name = vo.getProd_name();
			String prod_price = vo.getProd_price();
			String prod_desc = vo.getProd_desc();
			String vend_name = vo.getVend_name();
			String vend_id = vo.getVend_id();

			out.print("<tr><td>" + prod_id + "</td><td>" + prod_name + "</td><td>" + prod_price + "</td><td>" + prod_desc + "</td><td>" + vend_name + "</td><td>" + "<a href='/practice/prod?command=delProd&id=" + prod_id + "&prodId=" + prodId  + "&vendId=" + vendId + "'> 삭제 </a></td></tr>");
		}
		
		out.print("</table></body></html>");
		out.print("<a href='/pro09/product.html'>새로운 상품 조회하기</a>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			doHandle(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
