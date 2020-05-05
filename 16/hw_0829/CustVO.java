package hw_0829;

public class CustVO {
	private String id; //����ȣ
	private String name;//�� �̸�
	private String address;//�� �ּ�
	private String state;//�� ��
	private String zip; //�� �����ȣ
	private String country;//�� ����
	private String contact;//�� �����
	private String email;//�� �̸����ּ�
	
	
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
