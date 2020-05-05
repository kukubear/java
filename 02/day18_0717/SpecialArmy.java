package day18_0717;

import java.text.DecimalFormat;

public class SpecialArmy extends Army {
	private int bonus;

	SpecialArmy(String name, int age, String grade, String strDt, String endDt, int bonus) {
		super(name, age, grade, strDt, endDt);
		this.bonus=bonus;
	}

	public String getBonus() {
		DecimalFormat df = new DecimalFormat("#,###");
		String bonus1 = null;
		bonus1 = df.format(bonus);
		
		
		return bonus1;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}
