package bbs;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.NamingException;

import model.Bean;

public class LoginService {
	private DAO dao;
	
	//싱글턴패턴 적용 DAO사용
	public LoginService() {
		dao=DAO.getInstance();
	}

	public void login(LoginRequest loginreq) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection(); 
			conn.setAutoCommit(false);

			Bean member = dao.selectOne(loginreq.getId(), loginreq.getPassword());
			if (member != null) {
				JdbcUtil.rollback(conn);
				throw new DuplicateIdException();
			}
///+++
			
			conn.commit();
		} catch (NamingException e) {
			JdbcUtil.rollback(conn);
			throw new RuntimeException(e);
		} catch (SQLException e) {
			JdbcUtil.rollback(conn);
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.close(conn);
		}
	}
	}




