package hw_0805_02;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class MemberDAO2 {
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String user = "cott";
	private static final String pwd = "tiger";
	private Connection con;
	private PreparedStatement pstmt;

	public List listMembers(String input_id) {
		List list = new ArrayList();

		try {
			connDB();

			String query = "SELECT c.cust_id, c.cust_name, oi.order_num, p.prod_id, p.prod_name "
					
					+ " FROM CUSTOMERS c, orderitems oi, products p, orders o "
					+ " WHERE c.cust_id = o.cust_id "
					+ " AND oi.order_num = o.order_num"
					+ " AND oi.prod_id = p.prod_id" 
					+ " AND c.cust_id = '" + input_id + "'"; 
			System.out.println("PreparedStatement : " + query);
			pstmt = con.prepareStatement(query);

			ResultSet rs = pstmt.executeQuery(query);
			while (rs.next()) {
				String cust_id = rs.getString("cust_id");
				String cust_name = rs.getString("cust_name");
				String order_num = rs.getString("order_num");
				String prod_id = rs.getString("prod_id");
				String prod_name = rs.getString("prod_name");

				MemberVO2 vo2 = new MemberVO2();

				vo2.setCust_id(cust_id);
				vo2.setCust_name(cust_name);
				vo2.setOrder_num(order_num);
				vo2.setProd_name(prod_id);
				vo2.setProd_name(prod_name);
				list.add(vo2);
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

	private void connDB() {
		try {
			Class.forName(driver);
			System.out.println("Oracle Driver Loading 己傍");
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection 己傍");

			System.out.println("Statement 积己己傍");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
