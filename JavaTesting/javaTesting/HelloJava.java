package javaTesting;

import java.util.Scanner;

//ctrl + f11 = 실행
public class HelloJava {

	public static void main(String[] args) {
		System.out.println("안녕하세요?");//화면의 내용을 출력합니다. 한 줄짜리 주석
		System.out.println("HelloJava");
		System.out.println("반갑습니다.");
/*
 * System : 클래스
 * out :object 객체
 * println: 메소드
 * ("안녕하세요?"): 매개변수 값
 * ; : 문자의 끝
 * */
		
		int x = 100;//int는 정수형 데이터 -> 100을 변수 x에 저장하시오.
		int y = 300;
		int z = x + y;
		System.out.println(z);
		/*
		 * int : 정수형 4바이트 메모리
		 * x : 변수
		 * = : 대입연산자(오른쪽의 연산의 결과를 왼쪽으로 저장하시오)
		 * 100 : 실데이터
		 * ; : 문장의 끝
		 * */
		
		/*1. 데이터 : 자료 = 정수형(소수점이 없는 수), 실수형(소수점이 있는 수), 문자(character = 알파벳 한문자(대/소)), 
		 * 문자열(String=>여러개의 문자로 구성), 특수기호(^,%,$,#,@,!,~,*,&,(,))
		 *숫자와 문자
		 *2. 변수(variable): x,y,z....
		 *3. 자료형: byte(1byte), short(2), long(4), float(4), double(8), boolean(1bit).....
		 *4. 메모리 : RAM(8GB) = 주소값(address) = 포인터
		 *5. algorithm(알고리즘): 문제해결방법 =>조건문, 반복문, 배열, 객체지향내용.....
		 *6. 사고력(국어) + 논리력(수학) = 문제해결능력  */
		
		/*문제풀이 방법 (프로그래밍 5단계)
		 * 1. 요구사항 파악: 문제가 목적, 의도하는 바를 알아내는 것
		 * 2. 요구사항 분석 : 인재, 비용, 메모리, 데이터베이스 사양, 서버 사양, 주변 상황...
		 * 3. 요구사항 설계 : 데이터파악, 적절한 변수, 자료형, 형변환, 객체지향접근(클래스, 인터페이스...)....
		 * 4. 구현: 코딩
		 * 5. 테스트: 정상적으로 동작하는지 확인!!! (1~5까지가 SI)
		 * 6. 배포 및 유지보수: 60~70%가 수입원(회사):SM
		 * */
		
		//문제] 1000+5000=6000 나오도록 프로그램을 구성하세요
		int i = 10*x;
		int j = 10*y+20*x;
		int k = i+j;
		System.out.println(k);
		
		
		Scanner sc = new Scanner(System.in);
		//scanner = class
		System.out.println("첫번째 숫자를 입력하세요.");
		int a = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int b = sc.nextInt();
		
		int c = a+b;
		System.out.println("두 수의 합은 = "+ c);
		//자바는 데이터가 입력될때 대부분 문자로 인식됨
		
		
		//문제2] first=250, second= 450, third =550.0f 합계르 구하여 출력해봅시다.
		int first = 250, second = 450;
		float third = 550.000f;
		float calcAll= first + second + third;//묵시적형변환(자동형변환-정수+실수->실수)
		//System.out.println(calcAll);
		System.out.printf("%d \n", calcAll);
		
		
		int sum;
		sum = (int)((first+ second)+third); //-> casting 강제적 형변환(정수+실수->정수)
		//System.out.println(sum);
		System.out.printf("%5.1f \n", sum);
		
	
	}

}
