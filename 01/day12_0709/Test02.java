package day12_0709;

import java.util.Scanner;

//�ǽ� 2 �޿� ���
//�Է� : �⺻��, ��å(���, �븮, ����, ����)
//��� : �Ǽ��ɾ� ==xx��
//���� 
//�Ǽ��ɾ� + �⺻�� + ��å���� - ����
//���� = �⺻���� 10%
//��å ����ǥ
//-���� : 200,000
//���� : 500.000

public class Test02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int basePay = 0;
		int benefit = 0,salary;
		
		String position;

		System.out.println("�⺻�ް� ��å�� �Է��ϼ���: ");
		basePay = scan.nextInt();
		position = scan.next();

		if (position.equals("���") || position.equals("�븮")) {
			benefit = 0;
		} else if (position.equals("����")) {
			benefit = 200000;
		} else if (position.equals("����")) {
			benefit = 500000;
		}
		int tax = basePay*10/100;
		salary = basePay+benefit-tax;
		
		 System.out.println("����� ���� �Ǽ��ɾ� = "+salary+"���� �Դϴ�.");

	}

}
