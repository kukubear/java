package day06;

import java.util.Scanner;

/*현재까지 사용한 메소드는 사용자(개발자)정의 메소드
 * 입력받은 숫자를 논리연산을 홀수와 짝수로 구분하는 메소드를 만들어 출력하도록 한다.
 * 의미가 이미 부여되어있는 메소드 : 내장 라이브러리(API)
 * 
 * */
public class Ex09{
	public static boolean isEven(int n) {
		if(n%2==0) {
			return true;
		}else
			return false;
	}
	
	public static void main(String[] args) {
		
		String cha;
		Scanner sc = new Scanner(System.in);
		System.out.println("홀/짝을 판별할 숫자를 입력하세요.");
		int num = sc.nextInt();
		
		if(num!=0) {
			if(isEven(num)==true)
				cha = "짝수";
			
		else
			cha = "홀수";
		System.out.println("입력한 숫자 "+num+"은 "+cha+"입니다.");
		
	}
}
}