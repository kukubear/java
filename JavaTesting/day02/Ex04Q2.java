package day02;

import java.util.Scanner;

//문제 이름과 나이를 입력받아서 출력하는 프로그램을 작성하세요.
//출력결과 > 당신의 이름은 홍길동, 나이는 123세 입니다.
public class Ex04Q2 {

	public static void main(String[] args) {
		
		String name;
		int age;
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		name = scan.nextLine();
		System.out.println("나이를 입력하세요");
	    age = scan.nextInt();
		System.out.println("당신의 이름은 "+name+"이고, 나이는 "+age+"세 입니다.");
		
	}

}
