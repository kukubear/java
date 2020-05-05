package day03;

import java.util.Scanner;

//배수구하기
public class Ex07 {
	public static void main(String[] args) {
		//임의의 수를 입력받아서 그 수가 3,5,6,9의 배수인지 아닌지 판별
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int x = scan.nextInt();
		
		if(x%3==0)
			System.out.println(x+"는 3의 배수입니다.");
		if(x%5==0)
			System.out.println(x+"는 5의 배수입니다.");
		if(x%7==0)
			System.out.println(x+"는 7의 배수입니다.");
		if(x%9==0)
			System.out.println(x+"는 9의 배수입니다.");
		
		else
			System.out.println("3,5,7,9의 배수가 아닙니다.");
		
		//위의 소스를 줄여서 작성해보기
	
		
		
	}
}
