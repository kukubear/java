package day05;

import java.util.Scanner;

public class CalSubtract {

	public void Subtract() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int first, second,sum;
		
		
		System.out.println("원하는 두수를 입력해주세요.");
		first = sc.nextInt();
		second = sc.nextInt();
		
		sum = first - second;
		System.out.println("뺄셈의 결과 = "+sum);
		
	}

}
