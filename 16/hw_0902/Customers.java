package hw_0902;

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

import hw_0829.CustDAO;
import hw_0829.CustVO;

/**
 * Servlet implementation class Customers
 */
@WebServlet("/customer")
public class Customers extends HttpServlet {
	

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

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");

		String cust_id = request.getParameter("cust_id");
		System.out.println("cust_id 넘어오는 것 확인 -> " + cust_id);

		String command = request.getParameter("command");
		System.out.println("command 넘어오는 것 확인 ->> " + command);

		PrintWriter writer = response.getWriter();
		CustDAO dao = new CustDAO();

		JSONObject ttlObject = new JSONObject();// 배열에 저장할 ttlObject 선언
		JSONArray stateArray = new JSONArray();// state넣을 배열
		JSONArray countryArray = new JSONArray();
		JSONObject custInfo = new JSONObject();// cust_id한명의 정보를 받을 JSON객체 선언
		JSONObject error = new JSONObject(); // error 담을 json객체 선언
		String jsonInfo = null; // parsing한 것 담을 변수 선언

		// 고객 정보 조회 할 때
		if (command != null && "search".equals(command)) {
			List custlist = dao.custList(cust_id);
			System.out.println("custinfo's dao의 custlist ->> " + custlist);

			if (custlist.size() == 0) { // custlist에 정보가 없을 때 처리하는 로직
				error.put("error_yn", "Y");
				error.put("error_text", "고객 번호가 존재하지 않습니다");

				ttlObject.put("error", error);

				jsonInfo = ttlObject.toJSONString();
				System.out.print(jsonInfo);
				writer.print(jsonInfo);
				return;
			}

			CustVO vo = (CustVO) custlist.get(0);

			// 고객정보를 name&value 쌍으로 저장
			custInfo.put("cust_id", vo.getId());
			custInfo.put("cust_name", vo.getName());
			custInfo.put("cust_address", vo.getAddress());
			custInfo.put("cust_state", vo.getState());
			custInfo.put("cust_zip", vo.getZip());
			custInfo.put("cust_country", vo.getCountry());
			custInfo.put("cust_contact", vo.getContact());
			custInfo.put("cust_email", vo.getEmail());

			ttlObject.put("customer", custInfo);
			error.put("errors", "N");
			ttlObject.put("error", error);

			// JSONOBject를 문자열로 변환
			jsonInfo = ttlObject.toJSONString();

			System.out.println("jsonInfo log ->> " + jsonInfo);
			// JSON데이터를 브라우저에 전송
			writer.print(jsonInfo);

		}
		if (command != null && "save".equals(command)) {
			CustVO vo = new CustVO();
			
			vo.setName(request.getParameter("custName"));
			vo.setAddress(request.getParameter("custAddress"));
			vo.setState(request.getParameter("custState"));
			vo.setZip(request.getParameter("custZip"));
			vo.setCountry(request.getParameter("custCountry"));
			vo.setContact(request.getParameter("custContact"));
			vo.setEmail(request.getParameter("custEmail"));
		
			
			String p_id = request.getParameter("cust_id");
			System.out.println("idCopy 넘어오는 것 확인 ->> " + p_id);

			if (p_id.equals("")) {
				System.out.println(" else if p_id ==null");
				vo.setId(request.getParameter("custId"));
				System.out.println(request.getParameter("custId"));
				dao.InsertCust(vo);

			}else if (p_id != null) {
				System.out.println("add command check - >>" + command);
				dao.upadateCust(cust_id, vo);
			}

		}

	}
	}


