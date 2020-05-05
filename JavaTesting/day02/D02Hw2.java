package day02;

public class D02Hw2 {
	public static void main(String[] args) {
		//과제 2 1과 2의 숫자를 대상으로 관계(비교) 연산자 6가지를 구현하여 결과를 출력하세요.
		int a = 1, b = 2;
		boolean result = true;
		
		result = a > b || a <= b;
		System.out.println(result);
		
		result = a < b && a != b;
		System.out.println(result);
		
		result = a == b || a >=b;
		System.out.println(result);
		
		result = a < b && b>=2;
		System.out.println(result);
		
		result = a > b || a >=1;
		System.out.println(result);
		
		result = a !=b && b >=1;
		System.out.println(result);
		
				
}
}
