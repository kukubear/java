package day_0726;

public abstract class Food {
	private int foodNo;// 음식번호
	private String foodNm; // 음식이름
	private int time;// 조리시간
	
	//생성자
	Food(int foodNo, String foodNm){
		this.foodNo = foodNo;
		this.foodNm=foodNm;
	}

	//속성에 대한 get/set
	public int getFoodNo() {
		return foodNo;
	}

	public void setFoodNo(int foodNo) {
		this.foodNo = foodNo;
	}

	public String getFoodNm() {
		return foodNm;
	}

	public void setFoodNm(String foodNm) {
		this.foodNm = foodNm;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	

	
	
}
