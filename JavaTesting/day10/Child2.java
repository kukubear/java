package day10;

public class Child2 extends Parent2{
	
	public void discount(int price) {
		sum = price - 3500;
		if(3500>price) {
			System.out.println("잘못된 금액을 입력하셨거나 쿠폰을 사용하실 수 없는 금액입니다.");
		}
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		
	}

}
