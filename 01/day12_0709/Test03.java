package day12_0709;

import java.util.Scanner;

//�ǽ� 3 ��Ģ ����
//�Է�
//A�� :
//B��:
// ������()
//��°�� = xxx

//*����ó�� : �������̿� �Է� �� ���� �߸��ȿ����� �Է�


public class Test03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int result;
		System.out.println("������ ���ϴ� �� ���� �Է��ϼ���.");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("������ ���ϴ� �����ڸ� �Է����ּ���.");
		String operator = scan.next();
		
		
		if(operator.equals("+")) {
			result = a+b;
			System.out.println("������ ����� "+result);
		}else if(operator.equals("-")) {
			result = a-b;
			System.out.println("������ ����� "+result);
		}else if(operator.equals("*")) {
			result = a*b;
			System.out.println("������ ����� "+result);
		}else if(operator.equals("/")) {
			result = a/b;
			System.out.println("������ ����� "+result);
		}else{
			System.out.println("�߸��� �����ڸ� �Է��ϼ̽��ϴ�.");
		
		}
		
		
		
		

	}

}
