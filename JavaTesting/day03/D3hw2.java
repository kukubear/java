package day03;

import java.util.Scanner;

/*[����2] equals, if
���� 2���� �Է� �޾Ƽ� �����ڿ� ���Ͽ� ó�� �ǵ��� �մϴ�.

�Է� ���> 30 50 +  => 80, 40 20 - => 20*/
public class D3hw2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���: ");
		int x = scan.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���: ");
		int y = scan.nextInt();
		System.out.println("�����ڸ� �Է��ϼ���: ");
		
		String op = scan.next();
		
		int a1 = x+y;
		int a2 = x-y;
		int a3 = x*y;
		int a4 = x/y;
		int a5 = x%y;
		
		if(op.equals("+")) {
			System.out.println(a1);
		}else if(op.equals("-")){
			System.out.println(a2);
		}else if(op.equals("*")) {
			System.out.println(a3);
		}else if(op.equals("/")) {
			System.out.println(a4);
		}else if(op.equals("%")) {
			System.out.println(a5);
		}
	}
}
