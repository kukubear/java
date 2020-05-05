package day06;

import java.util.Scanner;

//두수의 최대공약수를 구하여 출력하세요.(내부처리와 외부처리)
//외부처리 메소드 => MaxNum Class
public class D6hw4 {
	/*->내부처리 field에 
	 * int i = 0, gcd=0; int max = num1; int min = num2;
	 * 
	 * if (num2 > num1) { max = num2; min = num1;
	 * 
	 * }
	 * 
	 * for (i = 1; i <= num2; i++) {
	 * 
	 * if (num1 % i == 0 && num2 % i == 0) {
	 * 
	 * gcd = i; }
	 * 
	 * }
	 * 
	 * System.out.println("입력하신 두 수의 최대공약수는 "+gcd);
	 */
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("최대 공약수를 구할 두 수를 입력하세요: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		MaxNum mx = new MaxNum();
		
	    mx.maxNum(x,y);
	    
	   
		
	}

	
	
}
