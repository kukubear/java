package hw_0819;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource datafactory;

	public MemberDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			datafactory = (DataSource) envContext.lookup("jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void addMember(MemberBean membean) throws SQLException {
		
		try {
		Connection con = datafactory.getConnection();
		String id = membean.getId();
		String pw = membean.getPassword();
		String name = membean.getName();
		
		String query = " insert into member ";
		query += " (member_id, name, password, regdate) ";
		query += "values (?,?,?,?)";
		
		pstmt = con.prepareStatement(query);
		pstmt.setString(1, id);
		pstmt.setString(2, pw);
		pstmt.setString(3, name);
		//pstmt.setDate(4, );
		
		pstmt.executeUpdate(); //회원 정보를 테이블에 추가합니다.
		pstmt.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		public boolean isExist(MemberBean bean) {
			boolean result = false;
			
			return result;
		}
	}
}


