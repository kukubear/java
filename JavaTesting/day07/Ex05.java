package day07;

import java.util.Scanner;

//����] �̸��� ���� �ּҸ� �Է¹޾Ƽ� �����ڷ� �����ϰ� ����ϱ�
class OverLoad1{
	static String name, address;
	static int age;

	public OverLoad1(String name, int age, String address) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
}
public class Ex05 {
	static String name, address;
	static int age;
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���: ");
		String name = scan.next();
		System.out.println("���̸� �Է��ϼ���: ");
		int age = scan.nextInt();
		System.out.println("�ּҸ� �Է��ϼ���: ");
		String address = scan.next();
		
		OverLoad1 over = new OverLoad1(name, age, address);
		System.out.println(OverLoad1.name);
		System.out.println(OverLoad1.age);
		System.out.println(OverLoad1.address);
	}

}
