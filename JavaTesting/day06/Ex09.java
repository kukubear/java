package day06;

import java.util.Scanner;

/*������� ����� �޼ҵ�� �����(������)���� �޼ҵ�
 * �Է¹��� ���ڸ� �������� Ȧ���� ¦���� �����ϴ� �޼ҵ带 ����� ����ϵ��� �Ѵ�.
 * �ǹ̰� �̹� �ο��Ǿ��ִ� �޼ҵ� : ���� ���̺귯��(API)
 * 
 * */
public class Ex09{
	public static boolean isEven(int n) {
		if(n%2==0) {
			return true;
		}else
			return false;
	}
	
	public static void main(String[] args) {
		
		String cha;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ȧ/¦�� �Ǻ��� ���ڸ� �Է��ϼ���.");
		int num = sc.nextInt();
		
		if(num!=0) {
			if(isEven(num)==true)
				cha = "¦��";
			
		else
			cha = "Ȧ��";
		System.out.println("�Է��� ���� "+num+"�� "+cha+"�Դϴ�.");
		
	}
}
}