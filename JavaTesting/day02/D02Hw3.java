package day02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D02Hw3 {
	public static void main(String[] args) throws Exception{
		//과제 3 BufferedReader 클래스를 이용하여 두 수를 입력받아, 관계 연산 6가지를 프로그램 하세요.
		
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.println("첫 번째 숫자를 입력하세요: ");
				String x = br.readLine();   
				float a = Float.parseFloat(x);
				
				System.out.println("두 번째 숫자를 입력하세요");
				String y = br.readLine();
				float b = Float.parseFloat(y);
				
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
