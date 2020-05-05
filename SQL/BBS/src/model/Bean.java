package model;

import java.util.Date;

public class Bean {
	private String id;
	private String password;
	private String name;
	private Date regDate;
	private String changepw;
	
	public Bean() {}
	
	public Bean(String id, String name, String password, Date regDate) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.regDate = regDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getChangepw() {
		return changepw;
	}
	public void setChangepw(String changepw) {
		this.changepw = changepw;
	}
	
	
	
}
