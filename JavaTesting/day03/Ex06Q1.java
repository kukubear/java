package day03;

import java.util.Scanner;

public class Ex06Q1 {
	public static void main(String[] args) {
		//����] ���࿡ ���� �ϴ� �ݾ��� �Է� �ް� 
		//������ �ݾ��� 100�����̸� ���̸�Ʈ�� ���� ��Ʈ���� ��ϴ�.
		//80���� �̻��̸�  ���� ����
		//60���� �̻��̸� ���̽�ũ�� ����
		//������� 40�����̻��̸� ��ȭ����
		//������� 20�����̸� ���ε鿡�� �Ļ�����
		//������� 10���� �̻��̸� ������ ��ϴ�.
		//5���� �̻��̸� ��� ����
		//3�����̻��̸� ����
		//2���� ���ϸ� ������ ����
		//�׸���, Stop�� �Է��ϸ� ���α׷��� �����մϴ�.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �ݾ��� �Է����ּ���(��������)");
		String stop = " ";
		
		int money = scan.nextInt();
		
		
		if(money == 100)
			System.out.println("��Ʈ�� ����");
		if(money<100 && money>=80)
			System.out.println("���屸��");
		if(money<80 && money>=60)
			System.out.println("���̽�ũ�� ����");
		if(money<60 && money>=40)
			System.out.println("��ȭ����");
		if(money<40 && money>=20)
			System.out.println("���ε鿡�� �Ļ�����");
		if(money<20 && money>=10)
			System.out.println("���� ����");
		if(money<10 && money>=5)
			System.out.println("��� ����");
		if(money<5 && money>=3)
			System.out.println("���䰡��");
		if(money<=2)
			System.out.println("����");
		
		
		System.out.println("���α׷��� �����Ͻðڽ��ϱ�? (0�� ������ ����)");
		money = scan.nextInt();
		
		if(money == 0)
		return;
		
		
		
		
		
}
}
