package day03;

import java.util.Scanner;

//������ϱ�
public class Ex07 {
	public static void main(String[] args) {
		//������ ���� �Է¹޾Ƽ� �� ���� 3,5,6,9�� ������� �ƴ��� �Ǻ�
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int x = scan.nextInt();
		
		if(x%3==0)
			System.out.println(x+"�� 3�� ����Դϴ�.");
		if(x%5==0)
			System.out.println(x+"�� 5�� ����Դϴ�.");
		if(x%7==0)
			System.out.println(x+"�� 7�� ����Դϴ�.");
		if(x%9==0)
			System.out.println(x+"�� 9�� ����Դϴ�.");
		
		else
			System.out.println("3,5,7,9�� ����� �ƴմϴ�.");
		
		//���� �ҽ��� �ٿ��� �ۼ��غ���
	
		
		
	}
}
