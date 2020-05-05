package hw_0902;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.json.simple.JSONArray;

public class CustDAO {
	
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;

	
	public CustDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//고객 조회 
	public List custList(String input_id) {
		List list = new ArrayList();
		
		try {
			con = dataFactory.getConnection(); // DB연결
			
			String query ="SELECT *" + 
					" FROM   customers" + 
					" WHERE cust_id = '"+input_id+"'"+
					" ORDER BY cust_id desc";
			pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				
				String id = rs.getString("cust_id");
				String name= rs.getString("cust_name");
				String address = rs.getString("cust_address");
				String state = rs.getString("cust_state");
				String zip = rs.getString("cust_zip");
				String country = rs.getString("cust_country");
				String contact = rs.getString("cust_contact");
				String email = rs.getString("cust_email");
				String beforeId = rs.getString("before_value");
				String afterId = rs.getString("after_value");
				CustVO vo = new CustVO();
				
				vo.setId(id);
				vo.setName(name);
				vo.setAddress(address);
				vo.setState(state);
				vo.setZip(zip);
				vo.setCountry(country);
				vo.setContact(contact);
				vo.setEmail(email);
				vo.setBeforeId(beforeId);
				vo.setAfterId(afterId);
				
//				System.out.println("DAO custList method email ->> "+email);
			
				list.add(vo);	
				
			}
			rs.close();
			pstmt.close();
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}		
		return list;
		
	}
	
	//고객 정보수정
	public void upadateCust(String id ,CustVO vo) throws SQLException {
		
		try {
			
		
		con = dataFactory.getConnection(); //DB연결
		String query = "UPDATE customers" 
						+ " SET cust_name = '"+ vo.getName() +"', cust_address = '"+vo.getAddress()+"', cust_state = '"+vo.getState()
								+"', cust_zip = '"+vo.getZip()+"', cust_country ='"+vo.getCountry()
								+"', cust_contact ='"+vo.getContact()+"', cust_email ='"+vo.getEmail()+"'" 
						+" WHERE cust_id= '"+id+"'";
		pstmt = con.prepareStatement(query);
		
		pstmt.executeUpdate(); //DB에 정보 update
		
		//query 다 끝내고 연결된 것들 닫아줘야 서버 다운 안됨!!!
		
		pstmt.close();
		con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
//	public void stateList(JSONArray state) {
//		try {
//			con = dataFactory.getConnection();
//			
//			String query = "SELECT DISTINCT(cust_state) FROM customers WHERE cust_state IS NOT NULL";
//			pstmt = con.prepareStatement(query);
//			ResultSet rs = pstmt.executeQuery();
//			
//			while(rs.next()) {
//				state.add(rs.getString("cust_state"));
//			}
//			rs.close();
//			pstmt.close();
//			con.close();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void countryList(JSONArray country) {
//		try {
//			con = dataFactory.getConnection();
//			
//			String query = "SELECT DISTINCT(cust_country) FROM customers WHERE cust_country IS NOT NULL";
//			pstmt = con.prepareStatement(query);
//			ResultSet rs = pstmt.executeQuery();
//			
//			while(rs.next()) {
//				country.add(rs.getString("cust_country"));
//			}
//			rs.close();
//			pstmt.close();
//			con.close();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	//고객 추가
	public void InsertCust(CustVO vo) {
		
		try {
			con = dataFactory.getConnection(); //DB연결
			String query ="INSERT INTO Customers(cust_id, cust_name, cust_address, cust_state, cust_zip, cust_country, cust_contact, cust_email)"
							+" VALUES('"+vo.getId()+"', '"+vo.getName()+"', '"+vo.getAddress()+"', '"+vo.getState()+"', '"
							+vo.getZip()+"', '"+vo.getCountry()+"', '"+vo.getContact()+"', '"+vo.getEmail()+"')";
			pstmt = con.prepareStatement(query);
			pstmt.executeUpdate();
			
			pstmt.close();
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//고객삭제
	public void ClearCust(String id) {
	 try {
		 
		 con = dataFactory.getConnection();
		 String query =  "DELETE FROM customers"
				 		+" Where cust_id ='"+id+"'";
		 pstmt = con.prepareStatement(query);
		 pstmt.executeUpdate();
		 
		 pstmt.close();
		 con.close();
		 
	 }catch(Exception e) {
		 e.printStackTrace(); 
	 }
	}
}
