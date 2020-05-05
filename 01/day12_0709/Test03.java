package day12_0709;

import java.util.Scanner;

//실습 3 사칙 연산
//입력
//A값 :
//B값:
// 연산자()
//출력결과 = xxx

//*오류처리 : 연산자이외 입력 시 오류 잘못된연산자 입력


public class Test03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int result;
		System.out.println("연산을 원하는 두 수를 입력하세요.");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("연산을 원하는 연산자를 입력해주세요.");
		String operator = scan.next();
		
		
		if(operator.equals("+")) {
			result = a+b;
			System.out.println("연산의 결과는 "+result);
		}else if(operator.equals("-")) {
			result = a-b;
			System.out.println("연산의 결과는 "+result);
		}else if(operator.equals("*")) {
			result = a*b;
			System.out.println("연산의 결과는 "+result);
		}else if(operator.equals("/")) {
			result = a/b;
			System.out.println("연산의 결과는 "+result);
		}else{
			System.out.println("잘못된 연산자를 입력하셨습니다.");
		
		}
		
		
		
		

	}

}
