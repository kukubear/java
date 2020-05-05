package hw_0819;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MemberBean {
	private String id; // 고객 ID
	private String name; //이름
	private String password; //비밀번호
	private String checkPW; //가입 시 확인암호
	private String newPW;//새 암호
	private Date regDate;//가입날짜
	
	public MemberBean() {
		
	}
	public MemberBean(String id, String name, String password, String checkPW) {
		this.id=id;
		this.name=name;
		this.password=password;
		this.checkPW=checkPW;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNewPW() {
		return newPW;
	}
	public void setNewPW(String newPW) {
		this.newPW = newPW;
	}
	public String getCheckPW() {
		return checkPW;
	}
	public void setCheckPW(String checkPW) {
		this.checkPW = checkPW;
	}
	public String getRegDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		String sysdate = null;
		sysdate=formatter.format(cal.getTime());
		Timestamp ts = Timestamp.valueOf(sysdate);
		
		return sysdate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
}
