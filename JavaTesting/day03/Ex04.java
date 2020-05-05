package day03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 어떤 숫자를 입력받아서 음수인지 양수인지 0인지를 판단하여 출력하세요.
		// 조건연산자의 목적은 if문의 간소화임
		Scanner scan = new Scanner(System.in);
		
		/*if(number==0) {
					System.out.println("입력하신 숫자는 0 입니다.");
				}else if(number < 0) {
					System.out.println("입력하신 숫자는 음수입니다.");
				}else if(number > 0) {
					System.out.println("입력하신 숫자는 양수입니다.");
				}*/
				
				System.out.println("숫자를 입력하세요: ");
				int number = scan.nextInt();
				
				String x = (number > 0 ) ?"양수":(number < 0) ? "음수" : "0" ;
				System.out.println(x);
				
				
	}

}
