package day03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� � ���ڸ� �Է¹޾Ƽ� �������� ������� 0������ �Ǵ��Ͽ� ����ϼ���.
		// ���ǿ������� ������ if���� ����ȭ��
		Scanner scan = new Scanner(System.in);
		
		/*if(number==0) {
					System.out.println("�Է��Ͻ� ���ڴ� 0 �Դϴ�.");
				}else if(number < 0) {
					System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
				}else if(number > 0) {
					System.out.println("�Է��Ͻ� ���ڴ� ����Դϴ�.");
				}*/
				
				System.out.println("���ڸ� �Է��ϼ���: ");
				int number = scan.nextInt();
				
				String x = (number > 0 ) ?"���":(number < 0) ? "����" : "0" ;
				System.out.println(x);
				
				
	}

}
