package day06;
//재귀 호출 되부름
//재귀 메소드:메소드가 자신을 다시 호출하여 작업을 반복 수행하는 방식을 말한다.
//
import java.util.Scanner;
	


class Ex05 {
	private static void ReHi(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return;
		}
		System.out.println("HI");
		ReHi(n-1);
	}
	
	public static void main (String[] args) {
	System.out.println("숫자를 입력하세요: ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	ReHi(n);
}

	
}
