package day10;

import java.util.Scanner;


public class Ex01 extends Information{

	public static void main(String[] args) {
		// 번호, 이름, 주민번호 입력하여 출력 상속이용
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("010을 제외한 핸드폰 번호 8자리를 입력해주세요.(-생략)");
		int phNum = scan.nextInt();
		System.out.println("이름을 입력해주세요.");
		String name = scan.next();
		System.out.println("주민등록번호 13자리를 입력해주세요. (-생략)");
		long idNum = scan.nextLong();
		
		Information ifm = new Information();
		
		
	}

}
