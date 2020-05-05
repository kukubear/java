package day12_0709;


public class Employee2 {
	private EmployeeType type;

	public Employee2(EmployeeType type) {
		setType(type);

	}

	public Employee2() {
		this.setType(type);
	}

	public void setType(EmployeeType type) {
		this.type = type;
	}

	public int getAmount() {
	   return type.getAmount();
	}

	public static void main(String[] args) {
		Engineer em2 = new Engineer();
		System.out.println(em2.getAmount());

	}

}
