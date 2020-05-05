package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import model.Bean;

public class DAO {
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource datafactory;

	public DAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			datafactory = (DataSource) envContext.lookup("jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void changePw(String p_password, String changepw) throws SQLException {
		try {
			Connection con = datafactory.getConnection();

			String query = "update member" +" set password=?" + " where password=?";
			System.out.println("prepareStatememt:" + query);
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, changepw);
			pstmt.setString(2, p_password);
			
			pstmt.executeUpdate();
			pstmt.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
			
		}
	

