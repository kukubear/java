package day09;

import java.util.Scanner;
//사칙연산을 상속을 이용하여 풀어보세요
public class Ex10 extends CalcAll{

	Ex10(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("사칙연산할 두 수를 입력하세요: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		CalcAll ca = new CalcAll(a,b);
		System.out.println();
		System.out.println(""
				+ "사칙 연산 결과");
		ca.Adder(a, b);
		ca.Divide(a, b);
		ca.Multiple(a, b);
		ca.Remain(a, b);
		ca.Subtract(a, b);
	}

}
