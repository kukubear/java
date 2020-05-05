package day10;

import java.util.Scanner;

public class Ex03 extends Car{

	public static void main(String[] args) {
		// Car class 이름과 속도 정의
		// 자식 클래스 사용하여 이름과 속도 입력받고 사용
		Scanner sc = new Scanner(System.in);
		String carName, company; int speed; 
		
		System.out.println("자동차의 이름을 입력하세요: ");
		carName = sc.next();
		System.out.println("자동차 제조사를 입력하세요 : ");
		company = sc.next();
		System.out.println("입력하신 자동차가 낼 수 있는 최고 속도를 입력하세요: ");
		speed = sc.nextInt();
		
		
		
	}

}
