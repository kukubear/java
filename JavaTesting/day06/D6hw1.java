package day06;

import java.util.Scanner;

//10!을 구하여 합계를 출력하세요. 메소드이용



public class D6hw1 {
	
	public static int factorial(int a){
		int sum=1;
		for(int i=1; i<=a; i++) {
			sum*=i;
			;
				
		}
		System.out.println(sum);
		return sum;
	
	}
	
	
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("숫자를 입력하세요: ");
	int x=sc.nextInt();
	
	 factorial(x);
	
}
}
