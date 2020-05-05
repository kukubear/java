package day03;

import java.util.Scanner;

/*[과제2] equals, if
숫자 2개를 입력 받아서 연산자에 의하여 처리 되도록 합니다.

입력 양식> 30 50 +  => 80, 40 20 - => 20*/
public class D3hw2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요: ");
		int x = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요: ");
		int y = scan.nextInt();
		System.out.println("연산자를 입력하세요: ");
		
		String op = scan.next();
		
		int a1 = x+y;
		int a2 = x-y;
		int a3 = x*y;
		int a4 = x/y;
		int a5 = x%y;
		
		if(op.equals("+")) {
			System.out.println(a1);
		}else if(op.equals("-")){
			System.out.println(a2);
		}else if(op.equals("*")) {
			System.out.println(a3);
		}else if(op.equals("/")) {
			System.out.println(a4);
		}else if(op.equals("%")) {
			System.out.println(a5);
		}
	}
}
