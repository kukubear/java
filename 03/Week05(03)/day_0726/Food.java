package day_0726;

public abstract class Food {
	private int foodNo;// ���Ĺ�ȣ
	private String foodNm; // �����̸�
	private int time;// �����ð�
	
	//������
	Food(int foodNo, String foodNm){
		this.foodNo = foodNo;
		this.foodNm=foodNm;
	}

	//�Ӽ��� ���� get/set
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
