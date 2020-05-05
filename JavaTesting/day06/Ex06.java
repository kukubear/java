package day06;

import java.util.Scanner;
	class Hello{
		static void ReHi2(int n) {
			if(n==0) {
				return;
			}
			System.out.println("HI");
			ReHi2(n-1);
}
}

public class Ex06 {
	public static void main (String[] args) {
		System.out.println("숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Hello hc2 = new Hello();
		hc2.ReHi2(n);
}
}