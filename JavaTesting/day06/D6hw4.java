package day06;

import java.util.Scanner;

//�μ��� �ִ������� ���Ͽ� ����ϼ���.(����ó���� �ܺ�ó��)
//�ܺ�ó�� �޼ҵ� => MaxNum Class
public class D6hw4 {
	/*->����ó�� field�� 
	 * int i = 0, gcd=0; int max = num1; int min = num2;
	 * 
	 * if (num2 > num1) { max = num2; min = num1;
	 * 
	 * }
	 * 
	 * for (i = 1; i <= num2; i++) {
	 * 
	 * if (num1 % i == 0 && num2 % i == 0) {
	 * 
	 * gcd = i; }
	 * 
	 * }
	 * 
	 * System.out.println("�Է��Ͻ� �� ���� �ִ������� "+gcd);
	 */
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ִ� ������� ���� �� ���� �Է��ϼ���: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		MaxNum mx = new MaxNum();
		
	    mx.maxNum(x,y);
	    
	   
		
	}

	
	
}
