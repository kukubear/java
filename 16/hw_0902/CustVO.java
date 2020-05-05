package hw_0902;

public class CustVO {
	private String id; //고객번호
	private String name;//고객 이름
	private String address;//고객 주소
	private String state;//고객 주
	private String zip; //고객 우편번호
	private String country;//고객 국가
	private String contact;//고객 담당자
	private String email;//고객 이메일주소
	private String beforeId; //이전 아이디 
	private String afterId;// 이후 아이디
	
	public CustVO(String id, String name, String address, String state, String zip, String country, String contact,
			String email) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.state = state;
		this.zip = zip;
		this.country = country;
		this.contact = contact;
		this.email = email;
	}
		
	public CustVO() {
		
	}

	


	public CustVO(String beforeId, String afterId) {
		this.beforeId = beforeId;
		this.afterId = afterId;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getBeforeId() {
		return beforeId;
	}

	public void setBeforeId(String beforeId) {
		this.beforeId = beforeId;
	}


	public String getAfterId() {
		return afterId;
	}

	public void setAfterId(String afterId) {
		this.afterId = afterId;
	}
	
	
}
