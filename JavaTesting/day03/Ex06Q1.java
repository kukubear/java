package day03;

import java.util.Scanner;

public class Ex06Q1 {
	public static void main(String[] args) {
		//문제] 은행에 저축 하는 금액을 입력 받고 
		//저축한 금액이 100만원이면 하이마트에 가서 노트북을 삽니다.
		//80만원 이상이면  정장 구매
		//60만원 이상이면 아이스크림 구매
		//저축액이 40만원이상이면 영화관람
		//저축액이 20만원이면 지인들에게 식사제공
		//저축액이 10만원 이상이면 게임을 삽니다.
		//5만원 이상이면 라면 구매
		//3만원이상이면 부페
		//2만원 이하면 집에서 공부
		//그리고, Stop을 입력하면 프로그램을 종료합니다.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("저축할 금액을 입력해주세요(만원단위)");
		String stop = " ";
		
		int money = scan.nextInt();
		
		
		if(money == 100)
			System.out.println("노트북 구매");
		if(money<100 && money>=80)
			System.out.println("정장구매");
		if(money<80 && money>=60)
			System.out.println("아이스크림 구매");
		if(money<60 && money>=40)
			System.out.println("영화관람");
		if(money<40 && money>=20)
			System.out.println("지인들에게 식사제공");
		if(money<20 && money>=10)
			System.out.println("게임 구매");
		if(money<10 && money>=5)
			System.out.println("라면 구매");
		if(money<5 && money>=3)
			System.out.println("뷔페가기");
		if(money<=2)
			System.out.println("열공");
		
		
		System.out.println("프로그램을 종료하시겠습니까? (0을 누르면 종료)");
		money = scan.nextInt();
		
		if(money == 0)
		return;
		
		
		
		
		
}
}
