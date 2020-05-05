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
//@WebServlet("/cust") mapping �浹 ����
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
		System.out.println("cust_id �Ѿ���� �� Ȯ�� -> "+cust_id);
		PrintWriter writer = response.getWriter();
		CustDAO dao = new CustDAO();
		
		//�迭�� ������ ttlObject ����
		JSONObject ttlObject = new JSONObject();
		//custInfo JSON��ü�� ������ custArray����
		JSONArray custArray = new JSONArray();
		
		
		// cust.html���� �Է¹��� input_id�� �̿���
		//input_id�� ��ġ�ϴ�  �ش� �� ������
		//dao�� ���ؼ� list�� �޾ƿ���
		
		List custlist = dao.custList(cust_id);
		
		System.out.println("custinfo's dao�� custlist ->> "+custlist);
		
		CustVO vo = (CustVO) custlist.get(0);
		
		//cust_id�Ѹ��� ������ ���� JSON��ü ����
		JSONObject custInfo = new JSONObject();
		//�������� name&value ������ ����
		custInfo.put("cust_id", vo.getId());
		custInfo.put("cust_name", vo.getName());
		custInfo.put("cust_address", vo.getAddress());
		custInfo.put("cust_state", vo.getState());
		custInfo.put("cust_zip", vo.getZip());
		custInfo.put("cust_country", vo.getCountry());
		custInfo.put("cust_contact", vo.getContact());
		custInfo.put("cust_email", vo.getEmail());
		
		System.out.println("Servlet cust_email �� Ȯ�� ->> "+vo.getEmail());
		
//		//�� ���� custInfo�� �迭 custArray�� ����
//		custArray.add(custInfo);
		
//		//ttlObject�� customers��� �̸����� custArray�� value�� ����
//		ttlObject.put("customer", custArray);
		
		ttlObject.put("customer",custInfo);
		
		//JSONOBject�� ���ڿ��� ��ȯ
		String jsonInfo = ttlObject.toJSONString();
		
		System.out.println("jsonInfo log ->> "+jsonInfo);
		//JSON�����͸� �������� ����
		writer.print(jsonInfo);
	}

}
