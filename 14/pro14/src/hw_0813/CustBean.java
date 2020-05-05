package hw_0813;

public class CustBean {
	private String id; //°í°´¹øÈ£
	private String name; //°í°´ ÀÌ¸§
	private String address; //°í°´ ÁÖ¼Ò
	private String state; //°í°´ ÁÖ
	private String zip; //°í°´ ¿ìÆí¹øÈ£
	private String country; // °í°´ ±¹°¡
	private String contact; //°í°´ ¿¬¶ô´ã´çÀÚ
	private String email; //°í°´ ÀÌ¸ŞÀÏ	
	
	public CustBean() {
		
	}
	
	public CustBean(String id, String name, String address, String state, String zip, String country, String contact,
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
