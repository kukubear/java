package day16_0715;



public class Project {
	private String name;
	private int month;

	private String company;

	Project(String name, int month, String company) {
		this(month);
		this.getName();
		this.getCompany();

	}

	Project(int month) {

		this.month = month;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
