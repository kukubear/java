package hw_0809;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import javax.xml.ws.Response;





public class OrderDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;

	
	public OrderDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public List OrderLists(OrderVO ordervo) {
		List list = new ArrayList();
		String _num =ordervo.getNum(); //조회할 번호을 가져옴
		
		System.out.println(" _num->"+_num);

		try {
			//connDB();
			con = dataFactory.getConnection();
			
			String query = "SELECT order_num, order_item, prod_id, prod_name, quantity, item_price" + 
					" FROM orderitems oi, products p" + 
					" WHERE oi.prod_id = p.prod_id";
			
			//_num 값이 존재하면 SQL문에 where절을 추가하여 해당 번호로 조회
			if(ordervo.getNum()!=null &&ordervo.getNum().length()!=0){
				query+=" AND oi.order_num like '%"+ordervo.getNum()+"%'";	
			}
			
			System.out.println("PreparedStatement : " + query);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				
				String num = rs.getString("order_num");
				String itemNum = rs.getString("order_item");
				String id = rs.getString("prod_id");
				String name = rs.getString("prod_name");
				String quantity = rs.getString("quantity");
				String price = rs.getString("item_price");
				String num2 = ordervo.getNum();
				
				System.out.println(num);
				System.out.println(itemNum);
				System.out.println(id);
				System.out.println(name);
				System.out.println(quantity);
				System.out.println(price);
				
				System.out.println("dao num->"+num);
				
				OrderVO vo = new OrderVO();

				vo.setNum(num);
				vo.setItemNum(itemNum);
				vo.setId(id);
				vo.setName(name);
				vo.setQuantity(quantity);
				vo.setPrice(price);
				
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
	
//	public boolean isExisted(MemberVO vo) {
//		boolean result =false;
//		String id = vo.getId();
//		String pwd = vo.getPwd();
//		
//		try {
//			con=dataFactory.getConnection();
//			String query ="select decode (count(*),1,'true','false') as result from t_member";
//					query += " where id=? and pwd=?";
//					pstmt = con.prepareStatement(query);
//					pstmt.setString(1, id);
//					pstmt.setString(2, pwd);
//					ResultSet rs = pstmt.executeQuery();
//					rs.next();
//					result =Boolean.parseBoolean(rs.getString("result"));
//					System.out.println("result = "+result);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return result;
//		
//	}
//	
	
	
	
	
	/*
	 * public void addMember(MemberVO vo) {
	 * 
	 * try { Connection con = dataFactory.getConnection(); String id = vo.getId();
	 * String pwd = vo.getPwd(); String name = vo.getName(); String email =
	 * vo.getEmail();
	 * 
	 * String query = "insert into t_member"; query += "(id,pwd,name,email)"; query
	 * += "values(?,?,?,?)"; System.out.println("prepareStatement: "+query);
	 * 
	 * pstmt = con.prepareStatement(query); pstmt.setString(1, id);
	 * pstmt.setString(2, pwd); pstmt.setString(3, name); pstmt.setString(4, email);
	 * pstmt.executeUpdate(); pstmt.close();
	 * 
	 * }catch(Exception e) { e.printStackTrace(); }
	 * 
	 * }
	 */
	 /*
	 * public void delMember(String id) { try { Connection con =
	 * dataFactory.getConnection();
	 * 
	 * String query ="delete from t_member"+" where id=?";
	 * System.out.println("prepareStatement : "+query); pstmt =
	 * con.prepareStatement(query); pstmt.setString(1, id);
	 * 
	 * pstmt.executeUpdate(); pstmt.close(); } catch(Exception e) {
	 * e.printStackTrace(); } }
	 */

}
