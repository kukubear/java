package day12_0709;

 interface EmployeeType{
	public int getAmount();

}

class Engineer implements EmployeeType {
	public int getAmount() {
		return 100;
	}
}

class Manager implements EmployeeType {
	public int getAmount() {
		return 200;

	}
}

class Salesman implements EmployeeType {
	public int getAmount() {
		return 300;
	}
}
