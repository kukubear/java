package day10;

public class Parent2 {
int price, sum;
	public void discount(int price) {
		sum = price - 3000;
		if(3000>price) {
			System.out.println("잘못된 금액을 입력하셨거나 쿠폰을 사용하실 수 없는 금액입니다.");
		}
		System.out.println(sum);
		
	}

}
