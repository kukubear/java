package hw_0806;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class CustDAO2 {
	/*
	 * private static final String driver = "oracle.jdbc.driver.OracleDriver";
	 * private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
	 * private static final String user = "cott"; private static final String pwd =
	 * "tiger";
	 */
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;

	
	public CustDAO2() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	public List listMembers(String input_id) {
		List list = new ArrayList();

		try {
			//connDB();
			con = dataFactory.getConnection();
			String query = "SELECT cust_id, cust_name, cust_address\r\n" + 
					" FROM customers"
					+" WHERE cust_id Like '%1%'"
					;
			
			System.out.println("PreparedStatement : " + query);
			pstmt = con.prepareStatement(query);

			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String cust_id = rs.getString("cust_id");
				String cust_name = rs.getString("cust_name");
				String cust_address = rs.getString("cust_address");
				
				

				CustVO2 vo = new CustVO2();

				vo.setCust_id(cust_id);
				vo.setCust_name(cust_name);
				vo.setCust_address(cust_address);
				
				list.add(vo);
				System.out.println(list);
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}
	
	public void delMember(String id) {
		try {
			Connection con =dataFactory.getConnection();
			
			String query = "delete from t_member"+ "where id=?";
			System.out.println("prepareStatement : "+query );
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, id);
			pstmt.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void checkOrder(CustVO2 custvo2) {
		
		try {
			Connection con = dataFactory.getConnection();
			String cust_id = custvo2.getCust_id();
			
			String query = "SELECT oi.order_num, p.prod_name, oi.quantity, oi.item_price\r\n" + 
					"FROM orderitems oi, products p, customers c\r\n" + 
					"WHERE p.prod_id = oi.prod_id"
					+"AND c.cust_id = "+custvo2.getCust_id();
			
			System.out.println("prepareStatement: "+query);
			
			pstmt = con.prepareStatement(query);
			
			
			pstmt.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	

	/*
	 * private void connDB() { try { Class.forName(driver);
	 * System.out.println("Oracle Driver Loading 己傍"); con =
	 * DriverManager.getConnection(url, user, pwd);
	 * System.out.println("Connection 己傍");
	 * 
	 * System.out.println("Statement 积己己傍"); } catch (Exception e) {
	 * e.printStackTrace(); } }
	 */
}
