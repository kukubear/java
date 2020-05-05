package day04;

import java.util.Scanner;

//반지름을 입력받아서, 원의 넓이와 둘레를 구하여 출력하세요.
//계속하려면 yes를 입력하고, no이면 중단합니다.
public class D4hw4 {
	public static void main(String[] args) {
		double leng, sqr,r;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("원의 반지름을 입력하세요 :" );
		r=sc.nextDouble();
		leng = 2*r*3.14;
	    sqr = r*r*3.14;
		System.out.println("원의 둘레는 "+leng+"이고, 원의 넓이는 "+sqr+"입니다.");
	}
}
