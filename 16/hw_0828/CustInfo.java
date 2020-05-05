package hw_0828;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Servlet implementation class CustInfo
 */
//@WebServlet("/cust") mapping 충돌 방지
public class CustInfo extends HttpServlet {
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			doHandle(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String cust_id = request.getParameter("id");
		System.out.println("cust_id 넘어오는 것 확인 -> "+cust_id);
		PrintWriter writer = response.getWriter();
		CustDAO dao = new CustDAO();
		
		//배열에 저장할 ttlObject 선언
		JSONObject ttlObject = new JSONObject();
		//custInfo JSON객체를 저장할 custArray선언
		JSONArray custArray = new JSONArray();
		
		
		// cust.html에서 입력받은 input_id를 이용해
		//input_id와 일치하는  해당 고객 정보를
		//dao를 통해서 list로 받아오기
		
		List custlist = dao.custList(cust_id);
		
		System.out.println("custinfo's dao의 custlist ->> "+custlist);
		
		CustVO vo = (CustVO) custlist.get(0);
		
		//cust_id한명의 정보를 받을 JSON객체 선언
		JSONObject custInfo = new JSONObject();
		//고객정보를 name&value 쌍으로 저장
		custInfo.put("cust_id", vo.getId());
		custInfo.put("cust_name", vo.getName());
		custInfo.put("cust_address", vo.getAddress());
		custInfo.put("cust_state", vo.getState());
		custInfo.put("cust_zip", vo.getZip());
		custInfo.put("cust_country", vo.getCountry());
		custInfo.put("cust_contact", vo.getContact());
		custInfo.put("cust_email", vo.getEmail());
		
		System.out.println("Servlet cust_email 값 확인 ->> "+vo.getEmail());
		
//		//고객 정보 custInfo를 배열 custArray에 저장
//		custArray.add(custInfo);
		
//		//ttlObject에 customers라는 이름으로 custArray를 value로 저장
//		ttlObject.put("customer", custArray);
		
		ttlObject.put("customer",custInfo);
		
		//JSONOBject를 문자열로 변환
		String jsonInfo = ttlObject.toJSONString();
		
		System.out.println("jsonInfo log ->> "+jsonInfo);
		//JSON데이터를 브라우저에 전송
		writer.print(jsonInfo);
	}

}
