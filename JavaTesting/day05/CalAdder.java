package day05;
import java.util.Scanner;
public class CalAdder {

	public void Adder() {
		Scanner sc = new Scanner(System.in);
		int first, second,sum;
		
		
		System.out.println("원하는 두수를 입력해주세요.");
		first = sc.nextInt();
		second = sc.nextInt();
		
		sum = first + second;
		System.out.println("덧셈의 결과 = "+sum);
		
	}

}
