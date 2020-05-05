package sec01.ex01;

import java.util.Date;

import sec01.ex02.Address;



public class MemberBean {
	private String name;
	private String id;
	private String pwd;
	private String email;
	private Date joinDate;
	private Address addr;
	
	public MemberBean() {
		
	}

	public MemberBean(String name, String id, String pwd, String email) {

		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	
}
