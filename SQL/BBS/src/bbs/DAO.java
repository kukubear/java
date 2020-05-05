package bbs;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import model.Bean;

public class DAO {
	
	private static DAO instance;
	
	public static DAO getInstance() {
		if(instance == null)
			instance = new DAO();
		return instance;
	}

	public Bean selectById(Connection conn, String id) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(
					"select * from member where member_id = ?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			Bean member = null;
			if (rs.next()) {
				member = new Bean(
						rs.getString("member_id"), 
						rs.getString("name"), 
						rs.getString("password"),
						toDate(rs.getTimestamp("regdate")));
			}
			return member;
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
	}

	private Date toDate(Timestamp date) {
		return date == null ? null : new Date(date.getTime());
	}

	public void insert(Connection conn, Bean mem) throws SQLException {
		try (PreparedStatement pstmt = 
				conn.prepareStatement("insert into member values(?,?,?,?)")) {
			pstmt.setString(1, mem.getId());
			pstmt.setString(2, mem.getName());
			pstmt.setString(3, mem.getPassword());
			pstmt.setTimestamp(4, new Timestamp(mem.getRegDate().getTime()));
			pstmt.executeUpdate();
		}
	}

	public void update(Connection conn, Bean member) throws SQLException {
		try (PreparedStatement pstmt = conn.prepareStatement(
				"update member set name = ?, password = ? where memberid = ?")) {
			pstmt.setString(1, member.getName());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getId());
			pstmt.executeUpdate();
		}
	}
	
	public void changePw(Connection conn, Bean bean) throws SQLException {
		try (PreparedStatement pstmt = conn.prepareStatement(
				"update member set password = ? where password = ?")) {
			pstmt.setString(1, bean.getChangepw());
			pstmt.setString(2, bean.getPassword());
			
			pstmt.executeUpdate();
		}
	}
	
	//id에 해당하는 멤버의 이름을 가져오기
		public String selectName(String p_id) throws SQLException {
			
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
			String query ="SELECT name FROM member WHERE member_id = '"+p_id+"'";
			String name= null;
			
	        Bean bean = null;//리턴할 객체참조변수
	        rs = pstmt.executeQuery();
	        
			if(rs.next()) {
				bean= new Bean();
				name = rs.getString("name");
			}
			return name;
			
			}finally {
				JdbcUtil.close(rs);
				JdbcUtil.close(pstmt);
			}
			
		}	
		
		public String selectOne(String p_id, String p_pw) throws SQLException {
			
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
			String query ="SELECT member_id, password FROM member WHERE member_id = '"+p_id+"'";
			String name= null;
			
	        Bean bean = null;//리턴할 객체참조변수
	        rs = pstmt.executeQuery();
	        
			if(rs.next()) {
				bean= new Bean();
				name = rs.getString("name");
			}
			return name;
			
			}finally {
				JdbcUtil.close(rs);
				JdbcUtil.close(pstmt);
			}
			
		}	
	
}
