package day02;

import java.util.Scanner;

//���� �̸��� ���̸� �Է¹޾Ƽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
//��°�� > ����� �̸��� ȫ�浿, ���̴� 123�� �Դϴ�.
public class Ex04Q2 {

	public static void main(String[] args) {
		
		String name;
		int age;
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		name = scan.nextLine();
		System.out.println("���̸� �Է��ϼ���");
	    age = scan.nextInt();
		System.out.println("����� �̸��� "+name+"�̰�, ���̴� "+age+"�� �Դϴ�.");
		
	}

}
