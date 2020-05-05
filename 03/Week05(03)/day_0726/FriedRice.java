package day_0726;

public class FriedRice extends Food{
	
	static int count;
	private int time;
	FriedRice(int foodNo, String foodNm, int time) {
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
