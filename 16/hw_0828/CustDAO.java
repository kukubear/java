package hw_0828;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

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
	
	public List custList(String input_id) {
		List list = new ArrayList();
		
		try {
			con = dataFactory.getConnection(); // DB¿¬°á
			
			String query ="SELECT cust_id, cust_name, cust_address, cust_state, cust_zip, cust_country, cust_contact, cust_email" + 
					" FROM customers" + 
					" WHERE cust_id = '"+input_id+"'";
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
				
				CustVO vo = new CustVO();
				
				vo.setId(id);
				vo.setName(name);
				vo.setAddress(address);
				vo.setState(state);
				vo.setZip(zip);
				vo.setCountry(country);
				vo.setContact(contact);
				vo.setEmail(email);
				System.out.println("DAO custList method email ->> "+email);
			
				list.add(vo);	
				
			}
						
		}catch(Exception e){
			e.printStackTrace();
		}		
		return list;
		
	}
}
