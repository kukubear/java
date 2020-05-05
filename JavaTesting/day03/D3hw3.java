package day03;

import java.util.Scanner;

/*[과제3] 음식점의 메뉴가 다양하게 전시되어 있습니다.

 1.피자 2.스파게티 3.햄버거 4.스프 5.토마토가 존재 합니다.

 피자 가격은 8600원이고, 스파게티는 15000원, 햄버거는 10만원, 스프는 5천원, 토마토는 3500원 입니다.

 if문으로 작성하고, 이를 switch ~ case문으로 옮겨보세요.



 1

주문할 피자의 갯수를 입력하세요: 3

 8600 * 3 = 25,800원 입니다.

 6

프로그램이 종료되었습니다.*/
public class D3hw3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		 int menuNum=0;
		 
		 String menu;
		 int price = 0;
		 int totalPrice, count;
		
		System.out.println("==============================");
		System.out.println("    메뉴                         가격");
		System.out.println("==============================");
		System.out.println("1. 피자                       8,600");
		System.out.println("2. 스파게티                 15,000");
		System.out.println("3. 햄버거                    10,000");
		System.out.println("4. 스프                       5,000");
		System.out.println("5. 토마토                     3,500");
		System.out.println("6. 종료");
		System.out.println("==============================");
		System.out.println("다음 메뉴 중 원하는 것의 번호를 입력하세요");
		menuNum = scan.nextInt();
		
		if(menuNum == 1) {
			menu = "피자";
			price = 8600;
			
		}else if(menuNum == 2) {
			menu = "스파게티";
			price = 15000;
			
		}else if(menuNum == 3) {
			menu = "햄버거";
			price = 10000;
			
		}else if(menuNum == 4) {
			menu = "스프";
			price = 5000;
			
		}else if(menuNum == 5) {
			menu = "토마토";
			price = 3500;
			
		}else if(menuNum ==6) {
			menu = "종료";
			System.out.println("프로그램을 종료합니다.");
			return;
		}
		
		if(menuNum <=0 && menuNum>6){
			System.out.println("잘못된 입력입니다. 다시 입력해주세요: ");
			menuNum = scan.nextInt();
		}
		
		System.out.println("수량을 입력하세요: ");
		count = scan.nextInt();
		totalPrice = price*count;
		System.out.println("지불하실 금액은 "+totalPrice+"원 입니다.");
			
		
	}

}
