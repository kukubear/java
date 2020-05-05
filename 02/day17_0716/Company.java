package day17_0716;

public class Company {
	private String name;
	private int period;

	Company(String name){
		this.name=name;
	}
	
	Company(String name, int period){
		this(name);
		this.period=period;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

}
