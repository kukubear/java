package day05;

import java.util.Scanner;

//���� ���� ������ �Է��� �޾Ƽ� ó���ϵ�. 0���̻� 100�� ���Ϸ� ������ �Էµǵ��� �Ͽ� �հ�� ����� ���մϴ�.
public class D5hw02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eng,kor,sum,avr;
		
		System.out.println("���������� �Է��ϼ���: ");
		eng = sc.nextInt();
		System.out.println("���������� �Է��ϼ���: ");
		kor = sc.nextInt();
		
		if((eng>100 && eng<0)||(kor>100&&kor<0)) {
			System.out.println("�߸��� �Է��Դϴ�.");
			System.out.println("������ �ٽ� �Է����ּ���.");
			eng=sc.nextInt();
		}
		sum=eng+kor;
		avr=sum/2;
		System.out.println("������ "+sum+"�� �Դϴ�.");
		System.out.println("����� "+avr+"�� �Դϴ�.");
	}
}
