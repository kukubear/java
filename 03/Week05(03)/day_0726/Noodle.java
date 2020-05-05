package day_0726;

import java.util.Comparator;

public class Noodle extends Food {
	private int time;
	static int count;
	Noodle(int foodNo, String foodNm,int time) {
		super(foodNo, foodNm);
		this.time=time;
		count++;	
	}
	
	public int getTime() {
		return time;
	}
	
	public void setTime(int time) {
		this.time = time;
	}

	
	

	

}
