package day06;

import java.util.Scanner;

//���� ] �̸��� ���̸� �Է¹޾Ƽ� �޼ҵ� �����ε��� �̿��Ͽ� ����ϼ���
public class Ex10 {
	public static  void printInformation(String name) {
		// TODO Auto-generated method stub
		System.out.print("�̸��� "+name+"�̰�, ");
	}
	
	public static void printInformation(int age) {
		// TODO Auto-generated method stub
		System.out.println("���̴� "+age+"�Դϴ�.");
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("�̸��� ���̸� �Է��ϼ���.");
	String name = sc.nextLine();
	int age = sc.nextInt();
	
	
	printInformation(name);
	printInformation(age);
}

	
}
