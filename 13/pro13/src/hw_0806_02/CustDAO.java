package hw_0806_02;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List listCust(String input_id) {
		
		List list = new ArrayList();

		try {
			// connDB();			
			con = dataFactory.getConnection();
			String query = "SELECT cust_id, cust_name, cust_address" 
					+ " FROM customers" 
					+ " WHERE cust_id = '"
					+ input_id + "'";

			System.out.println("PreparedStatement : " + query);
			pstmt = con.prepareStatement(query);//database¿Í ¿¬°á

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String _id = rs.getString("cust_id");
				String _name = rs.getString("cust_name");
				String _address = rs.getString("cust_address");

				CustnOrderVO vo = new CustnOrderVO();

				
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

	public List listOrders(String cust_id) throws SQLException {
		
		List list = new ArrayList();
		con = dataFactory.getConnection();
		
		String query = 
				" SELECT c.cust_id, oi.order_num, TRIM(p.prod_name), oi.quantity, oi.item_price "
				+ " FROM orderitems oi, products p, customers c, orders o" 
				+ " WHERE oi.prod_id = p.prod_id" 
				+ " AND oi.order_num = o.order_num" 
				+ " AND c.cust_id = o.cust_id"
				+ " AND c.cust_id Like '%"+cust_id+"%'";

		System.out.println("PreparedStatement : " + query);
		
		pstmt = con.prepareStatement(query);		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {			
			String orderNum =rs.getString("order_num");
			String prodName = rs.getString("prod_name");
			String quantity = rs.getString("quantity");
			String itemPrice = rs.getString("item_price");
			
			CustnOrderVO custvo = new CustnOrderVO();
			
			custvo.setOrderNum(orderNum);
			custvo.setProdName(prodName);
			custvo.setQuantity(quantity);
			custvo.setItemPrice(itemPrice);
			
			list.add(custvo);
			System.out.println(list);
			
		}
		return list;
	}

	public void delCust(String id) {
		
		try {
			Connection con = dataFactory.getConnection();
			String query = "delete from t_member" 
							+ "where id=?";
			System.out.println("prepareStatement : " + query);
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, id);
			pstmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delOrder(String order_num, String prod_id) {

		try {
			
			Connection con = dataFactory.getConnection();
			String query = "delete from orderitems" + 
			" where order_num='" + order_num 
			+ "' and prod_id='"+prod_id+"' ";
			System.out.println("prepareStatement: " + query);
			
			pstmt = con.prepareStatement(query);
			pstmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

}
