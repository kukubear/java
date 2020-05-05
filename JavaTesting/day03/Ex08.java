package day03;

import java.util.Scanner;

//임의의 수를 입력받아서, 그 수가 기준수보다 큰 수인지 작은 수인지 판별하여 출력하세요.
public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int hint =555;
		int a = scan.nextInt();
		
		if(a > hint) {
			System.out.println(a+" 가 큰 수 입니다.");
		}else if(a<hint) {
		System.out.println(a+" 가 작은 수 입니다.");
		}else if(a==hint) {
			System.out.println(a+" 가 같은 수 입니다.");
		}
		//임의 수를 입력받아서 1~100사이의 숫자인지 판별하고 그 수가 7의 배수인지 확인하여출력하세요.
		System.out.println("숫자를 입력하세요: ");
		int b = scan.nextInt();
		if(b>=1 && b <101 && b%7==0)
			System.out.println(b+"는 7의 배수입니다.");
		else if(b<1 && b>100)
		System.out.println("올바르지 못한 입력입니다.");
		
		//숫자 두개를 입력 받아 max,min을 판별하여 출력하세요.
		System.out.println("첫 번째 숫자를 입력하세요: ");
		int c = scan.nextInt();
		
		System.out.println("두 번째 숫자를 입력하세요: ");
		int d = scan.nextInt();
		
		if(c>d) {
		
		}
	}

}
