package day03;
//����1] �̸��� ����, ����, ���� ������ �Է¹޾Ƽ� ����, ���, ������ ���ϼ���. if���̿�

import java.util.Scanner;

public class D3hw1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String name, grade;
	int kor, eng, math, total;
	float avr;
	
	System.out.println("�̸��� �Է��ϼ���: ");
	name = sc.nextLine();
	
	System.out.println("���������� �Է��ϼ���: ");
	kor = sc.nextInt();
	
	System.out.println("���������� �Է��ϼ���: ");
	math = sc.nextInt();
	
	System.out.println("���������� �Է��ϼ���: ");
	eng = sc.nextInt();
	
	total = kor+eng+math;
	avr = total/3;
	
	System.out.println(name+"�� ������ "+total+"���̰�, �����"+avr+" �� �Դϴ�.");
	
	if(avr >=90) {
	
	System.out.println(name+"���� ������ A�Դϴ�.");
	
	}else if(avr<90 && avr>=80) {
		
		System.out.println(name+"���� ������ B�Դϴ�.");
		
	}else if(avr<80 && avr>=70) {
		System.out.println(name+"���� ������ C�Դϴ�.");
		
		
	}else if(avr<60) {
		System.out.println(name+"���� ������ F�Դϴ�.");
		
	}
	
}
}
