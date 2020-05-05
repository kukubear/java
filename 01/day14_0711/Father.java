package day14_0711;

public class Father {
	String name;
	int age;
	String job;
	//항상 속성을 초기화 해주는 생성자가 있어야 함 ++(따로하면 좋음) 수정사항
	
	void goToWork(int time) {
		System.out.printf("%d시에 출근하다",time);
		
	}
	void goOffWork(int time) {
		System.out.printf("%d시에 퇴근하다",time);
	}
	
	public static void main(String[] args) {
		Father ft = new Father();
		ft.goToWork(8);
		System.out.println();
		ft.goOffWork(6);
	}
}
