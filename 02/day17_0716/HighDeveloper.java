package day17_0716;

public class HighDeveloper extends Developer {
	private String specialSkill;
	

	// 생성자
	HighDeveloper(String name, int period, String specialSkill) {
		super(name, period);
		this.specialSkill = specialSkill;

	}

	// 각 속성의 get,set Method
	public String getSpecialSkill() {
		return  specialSkill;
	}

	public void setSpecialSkill(String specialSkill) {
		this.specialSkill = specialSkill;
	}

	

}
