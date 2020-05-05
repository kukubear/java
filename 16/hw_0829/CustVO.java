package hw_0829;

public class CustVO {
	private String id; //绊按锅龋
	private String name;//绊按 捞抚
	private String address;//绊按 林家
	private String state;//绊按 林
	private String zip; //绊按 快祈锅龋
	private String country;//绊按 惫啊
	private String contact;//绊按 淬寸磊
	private String email;//绊按 捞皋老林家
	
	
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
	
	
}
