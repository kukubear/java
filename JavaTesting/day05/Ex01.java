package day05;

import java.util.Scanner;

//5의!구하기
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=1;
		Scanner sc = new Scanner(System.in);
		for(int a=1;a<=5; a++) {
			sum*=a;
			System.out.println(sum);
		}
		/*
		 * int i, sum=1; Scanner sc = new Scanner(System.in);
		 * System.out.println("팩토리얼 구할 수를 입력하세요."); 
		 * int x = sc.nextInt();
		 * 
		 * for(i=1; i<=x; i++) 
		 * { sum*=i; System.out.println("i= "+i+", 합계는= "+sum); }
		 */
	}

}
