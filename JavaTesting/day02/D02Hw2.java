package day02;

public class D02Hw2 {
	public static void main(String[] args) {
		//���� 2 1�� 2�� ���ڸ� ������� ����(��) ������ 6������ �����Ͽ� ����� ����ϼ���.
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
