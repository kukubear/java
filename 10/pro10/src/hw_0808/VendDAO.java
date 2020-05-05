package hw_0808;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class VendDAO {
	// 수정할 때는 세션이 담지 않고 디스패치나 다른걸로....+인코딩 필수
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;

	public VendDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List vendList(String p_vend_id) throws SQLException {
		List vendlist = new ArrayList();
		con = dataFactory.getConnection();
		
		String query = "SELECT vend_id, vend_name, vend_address, vend_city,vend_state, vend_zip, vend_country"
				+ " FROM vendors" 
				+ " WHERE TRIM(vend_id) LIKE '%"+p_vend_id+"%'";
		
		System.out.println("PrepareStatement : " + query);
		pstmt = con.prepareStatement(query);

		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {

			String _id = rs.getString("vend_id");
			String _name = rs.getString("vend_name");
			String _address = rs.getString("vend_address");
			String _city = rs.getString("vend_city");
			String _state = rs.getString("vend_state");
			String _zip = rs.getString("vend_zip");
			String _country = rs.getString("vend_country");

			VendVO vo = new VendVO();
			
			System.out.println("VendVo's vend id ->"+_id);
			System.out.println("VendVo's vend name ->"+_name);
			System.out.println("VendVo's vend address ->"+_address);
			System.out.println("VendVo's vend city ->"+_city);
			System.out.println("VendVo's vend state ->"+_state);
			System.out.println("VendVo's vend zip ->"+_zip);
			System.out.println("VendVo's vend country ->"+_country);
	
			vendlist.add(vo);
			System.out.println(vendlist);
			
		}
		rs.close();
		pstmt.close();
		con.close();
	
		try {
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return vendlist;
	}

	public void correctVend() {
		
	}
	
	public void delVend(String p_vend_id) {
		try {
			VendVO vo = new VendVO();
			//vo.setVend_id(p_vend_id);
			vo.setId(p_vend_id);
			Connection con = dataFactory.getConnection();

			String query = "delete from vendors where vend_id=?";
			System.out.println("prepareStatement: " + query);

			pstmt = con.prepareStatement(query);
			pstmt.setString(1, p_vend_id);
			pstmt.executeUpdate();
			
			
			pstmt.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
