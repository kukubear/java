package day02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D02Hw3 {
	public static void main(String[] args) throws Exception{
		//���� 3 BufferedReader Ŭ������ �̿��Ͽ� �� ���� �Է¹޾�, ���� ���� 6������ ���α׷� �ϼ���.
		
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.println("ù ��° ���ڸ� �Է��ϼ���: ");
				String x = br.readLine();   
				float a = Float.parseFloat(x);
				
				System.out.println("�� ��° ���ڸ� �Է��ϼ���");
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
