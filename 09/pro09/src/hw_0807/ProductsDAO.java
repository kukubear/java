package hw_0807;

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



public class ProductsDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;

	
	public ProductsDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List listProducts(String p_prod_id, String p_vend_name) throws SQLException {
		List list = new ArrayList();
		con = dataFactory.getConnection();
		
		
		String query = "SELECT p.prod_id, TRIM(p.prod_name), p.prod_price, p.prod_desc, TRIM(v.vend_name)" + 
				" FROM products p, vendors v" + 
				" WHERE p.vend_id = v.vend_id";
		if(p_prod_id!=null && p_vend_name !=null) {
			query+= " AND p.prod_id = like '%"+p_prod_id+"%'";
			query+= " AND v.vend_id like'%"+p_vend_name+"%'";
		} else if(p_prod_id!=null && p_vend_name ==null) {
			query += "AND p.prod_id like '%"+p_prod_id+"'%";
		}else if(p_prod_id ==null && p_vend_name!=null) {
			query += "AND v.vend_id like '%"+p_prod_id+"'%";
		}
		System.out.println("PreparedStatement : " + query);
		pstmt = con.prepareStatement(query);

		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			
			String prod_id = rs.getString("prod_id");
			String prod_name = rs.getString("prod_name");
			String prod_price = rs.getString("prod_pric");
			String prod_desc = rs.getString("prod_desc");
			String vend_name = rs.getString("vend_name");

			ProductVO vo = new ProductVO();

			vo.setProd_id(prod_id);
			vo.setProd_name(prod_name);
			vo.setProd_price(prod_price);
			vo.setProd_desc(prod_desc);
			vo.setVend_id(vend_name);
			
			list.add(vo);
			System.out.println(list);
		}
		rs.close();
		pstmt.close();
		con.close();
	
		try {
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
		
	}
	public void addProd(String id, String name, double price, String desc, String vendId) {
		try {
			Connection con = dataFactory.getConnection();
			
			String query = "insert into products"
					+ " (prod_id, prod_name, prod_price, prod_desc, vend_id)"
					+ " values (?, ?, ?, ?, ?)";
			System.out.println("prepareStatement: " + query);
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setDouble(3, price);
			pstmt.setString(4, desc);
			pstmt.setString(5, vendId);

			pstmt.executeUpdate();
			
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public void delProd(String id) {
		try {
			ProductVO vo = new ProductVO();
			vo.setDelId(id);
			Connection con = dataFactory.getConnection();

			String query = "delete from products where prod_id='" + id + "'";
			System.out.println("prepareStatement: " + query);
			pstmt = con.prepareStatement(query);
			pstmt.executeUpdate();
			
			
			pstmt.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
		
	}

	

	
		
	

	
