package day12_0709;

import java.util.Scanner;

//실습 2 급여 계산
//입력 : 기본급, 직책(사원, 대리, 과장, 부장)
//출력 : 실수령액 ==xx원
//계산식 
//실수령액 + 기본급 + 직책수당 - 세금
//세금 = 기본급의 10%
//직책 수당표
//-과장 : 200,000
//부장 : 500.000

public class Test02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int basePay = 0;
		int benefit = 0,salary;
		
		String position;

		System.out.println("기본급과 직책을 입력하세요: ");
		basePay = scan.nextInt();
		position = scan.next();

		if (position.equals("사원") || position.equals("대리")) {
			benefit = 0;
		} else if (position.equals("과장")) {
			benefit = 200000;
		} else if (position.equals("부장")) {
			benefit = 500000;
		}
		int tax = basePay*10/100;
		salary = basePay+benefit-tax;
		
		 System.out.println("당신의 연봉 실수령액 = "+salary+"만원 입니다.");

	}

}
