package day03;

import java.util.Scanner;

//������ ���� �Է¹޾Ƽ�, �� ���� ���ؼ����� ū ������ ���� ������ �Ǻ��Ͽ� ����ϼ���.
public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int hint =555;
		int a = scan.nextInt();
		
		if(a > hint) {
			System.out.println(a+" �� ū �� �Դϴ�.");
		}else if(a<hint) {
		System.out.println(a+" �� ���� �� �Դϴ�.");
		}else if(a==hint) {
			System.out.println(a+" �� ���� �� �Դϴ�.");
		}
		//���� ���� �Է¹޾Ƽ� 1~100������ �������� �Ǻ��ϰ� �� ���� 7�� ������� Ȯ���Ͽ�����ϼ���.
		System.out.println("���ڸ� �Է��ϼ���: ");
		int b = scan.nextInt();
		if(b>=1 && b <101 && b%7==0)
			System.out.println(b+"�� 7�� ����Դϴ�.");
		else if(b<1 && b>100)
		System.out.println("�ùٸ��� ���� �Է��Դϴ�.");
		
		//���� �ΰ��� �Է� �޾� max,min�� �Ǻ��Ͽ� ����ϼ���.
		System.out.println("ù ��° ���ڸ� �Է��ϼ���: ");
		int c = scan.nextInt();
		
		System.out.println("�� ��° ���ڸ� �Է��ϼ���: ");
		int d = scan.nextInt();
		
		if(c>d) {
		
		}
	}

}
