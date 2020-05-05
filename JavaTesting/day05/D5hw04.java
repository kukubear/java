package day05;

import java.util.Scanner;

//피보나치 수열을 작성하고, n번째 항까지의 합을 구하여 출력하세요.
//n은 입력받기
// 1 1 2 3 5 8........
public class D5hw04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력한 항까지 피보나치 수열의 합계를 구합니다. 원하는 항을 입력하세요: ");
		int n = sc.nextInt();

		if (n<= 0)
			return;
		fibo(n);
		
	}

	public static void fibo(int n) {
		int fibo=1; int sum=0;
		for(int i=1; i<=100 ;i++) {
			fibo = n+n--;
			sum+=fibo;
			System.out.println(fibo);
			
		}
		System.out.println(fibo);
		System.out.println(sum);
	}

}
