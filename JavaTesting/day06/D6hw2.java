package day06;

import java.util.Scanner;

//두 수를 입력하여 절대값을 구하는 프로그램 작성/ 메소드이용 
//절대 값을 사용하거나 보수 취하는 프로그램 짜거나 
//절대 값 구하는 것이 시간 절약
public class D6hw2 {
	public static int absolute(int x){
		
		if(x<0) {
			 System.out.println(x*(-1));

			
		}else if(x>0 ) {
			System.out.println(x);

		}else if(x==0) {
			System.out.println(x+"는 0입니다.");

		}	
		return x;
	}
	
//재귀호출방법
	/*
	 * */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("절대값을 구할 두 수를 입력하세요.");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		absolute(x);
		absolute(y);
	}
}
