package day03;

import java.util.Scanner;

//��� : ���ǹ�, �ݺ���
public class Ex03 {
	public static void main(String[] args) {
	//���ǹ� (condition statement): if, if~else, if ~else if, if if ~else
		//���� ���ǿ� ���� ���������� ó����
		int score = 93;
		
		if(score >=90) {
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A �Դϴ�.");
		}
		
		
		//����] ���������� �Է��Ͽ� ������ �ο��ϴ� ���α׷��� �ۼ��ϼ���.
		Scanner scan = new Scanner(System.in);
		System.out.println("���������� �Է��ϼ���: ");
		int eng = scan.nextInt();;
	    
		if(eng >=90) {
			System.out.println("����� A�Դϴ�.");
		}else if(eng>=80 && eng<90) {
			System.out.println("����� B�Դϴ�.");
		}else if(eng>=60 && eng<80) {
			System.out.println("����� C�Դϴ�.");
		}else if(eng<60) {
			System.out.println("F����Դϴ�.");
		}
		
		//����2] ���� �⵵�� �Է��Ͽ� ¦��������, Ȧ�������� �Ǵ��Ͽ� ����ϼ���.
		
		int year;
		System.out.println("�⵵�� �Է��ϼ���");
		year = scan.nextInt();
		
		if(year%2==0) {
			System.out.println(year+"�� ¦���� �Դϴ�.");
		}else if(year%2==1) {
			System.out.println(year+"�� Ȧ���� �Դϴ�.");
		}
		//���� 3] ȫ�浿�� ���м����� 85�� �Դϴ�. 
		//70�� �̻��̸� �հ����� �ϰ�, �ƴϸ� ���հ��Դϴ�.
		String name;
		System.out.println("�̸��� �Է��ϼ���: ");
		name=scan.nextLine();
		name=scan.nextLine();
		
		
		System.out.println("���������� �Է��ϼ���: ");
		int math = scan.nextInt();
		
		if(math >=70) {
			System.out.println(name+"�� �հ��Դϴ�.");
		}else if(math<70) {
			System.out.println(name+"�� ���հ��Դϴ�.");
		
		}
		
		
		
	}
	
}
