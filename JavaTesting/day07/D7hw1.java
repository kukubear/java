package day07;

import java.util.Scanner;

//������ �����ε�
//����1] �⼷�̶�� �̸��� ģ��
// ����, ����, ���������� �Է��� �˴ϴ�.
//�� �������� �Է� �����͸� �����ڸ� �̿��Ͽ� �Է��� �ް� ����
//����, ��� ���ϱ�
public class D7hw1 {
	static int kor,eng,math;
	String name = "�⼷";

	public D7hw1(int kor, int eng, int math) {
		// TODO Auto-generated constructor stub
		
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		
		int sum = kor+eng+math;
		int avr = sum/3;
		
		System.out.println(name+"���� �� ������ ������ "+sum+"���̰�, ����� "+avr+"�� �Դϴ�.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���: ");
		int kor = scan.nextInt();
		System.out.println("���� ������ �Է��ϼ���: ");
		int eng = scan.nextInt();
		System.out.println("���� ������ �Է��ϼ���: ");
		int math = scan.nextInt();
		
		
		
		D7hw1 input = new D7hw1(kor, eng, math);
		;
		
		
	}

}
