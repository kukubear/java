package hw_0813;

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
	private DataSource datafactory;

	public CustDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			datafactory = (DataSource) envContext.lookup("jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List custList(String input_id) {
		List list = new ArrayList();

		try {
			con = datafactory.getConnection();
			
			String query = "SELECT cust_id, TRIM(cust_name), TRIM(cust_address), TRIM(cust_state), cust_zip, TRIM(cust_country) , TRIM(cust_contact),TRIM(cust_email)"
					+ " FROM customers" + " WHERE 1=1";
			
			if(input_id != null && input_id.length()!=0) {
				query+= " AND cust_id = '"+input_id+"'";
			}
			
			System.out.println("preparedstatement =" + query);
			pstmt = con.prepareStatement(query);

			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				
				String cust_id = rs.getString("cust_id");
				String cust_name = rs.getString("cust_name");
				String cust_address =rs.getString("cust_state");
				String cust_zip = rs.getString("cust_zip");
				String cust_country = rs.getString("cust_country");
				String cust_contact = rs.getString("cust_contact");
				String cust_email = rs.getString("cust_email");
				
				CustBean vo = new CustBean();
				
				vo.setId(cust_id);
				vo.setName(cust_name);
				vo.setAddress(cust_address);
				vo.setZip(cust_zip);
				vo.setCountry(cust_country);
				vo.setContact(cust_contact);
				vo.setEmail(cust_email);
				
				list.add(vo);
			}
			rs.close();
			pstmt.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void updateCust(String id, String name, String address, String state, String zip, String country, String contact, String email) {
		try {
			con = datafactory.getConnection();

			String query = "update customers";
			query += " set  name = ? ";
			query += "    , address = ? ";
			query += "    , state = ? ";
			query += "    , zip = ? ";
			query += "    , country = ? ";
			query += "    , contact = ? ";
			query += "    , email = ? ";
			query += " where id = ? ";
			System.out.println("prepareStatement: " + query);
			System.out.println("3333333333333333: " + id + "," + name + "," + address+ "," + state+"," + zip + "," + country+"," + contact + "," + email);

			pstmt = con.prepareStatement(query); 
			pstmt.setString(1, name);
			pstmt.setString(2, address);
			pstmt.setString(3, state);
			pstmt.setString(4, zip);
			pstmt.setString(5, country);
			pstmt.setString(6, contact);
			pstmt.setString(7, email);
			pstmt.setString(8, id);
			pstmt.executeUpdate();
			
			pstmt.close();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}	
}
