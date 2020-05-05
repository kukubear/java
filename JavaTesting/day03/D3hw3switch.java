package day03;

import java.util.Scanner;

public class D3hw3switch {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	 int menuNum=0;
	 
	 String menu;
	 int price=0;
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
	
	switch(menuNum) {
	case 1:
		menu = "피자";
		price = 8600;
		break;
	case 2:
		menu = "스파게티";
		price = 15000;
		break;
	case 3:
		menu = "햄버거";
		price = 10000;
		break;
	case 4:
		menu = "스프";
		price = 5000;
		break;
	case 5 :
		menu = "토마토";
		price = 3500;
		break;
	case 6 :
		menu = "종료";
		System.out.println("프로그램을 종료합니다.");
		break;
	default :
		System.out.println("잘못된 입력입니다. 다시 입력해주세요: ");
		menuNum = scan.nextInt();
	}
	
		System.out.println("수량을 입력하세요: ");
		count = scan.nextInt();
		totalPrice = price*count;
		System.out.println("지불하실 금액은 "+totalPrice+"원 입니다.");
	
	/*String menu1 = "피자";
	String menu2 = "스파게티";
	String menu3 = "햄버거";
	String menu4 = "스프";
	String menu5 = "토마토";
	
	
	int menuNum1 = 8600;
	int menuNum2 = 15000;
	int menuNum3 = 10000;
	int menuNum4 = 8600;
	int menuNum5 = 5000;
	String menuNum6 = "종료";*/
		
	}
}

