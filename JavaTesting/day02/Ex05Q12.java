package day02;

import java.util.Scanner;

public class Ex05Q12 {
public static void main(String[] args) {
	//Q1. ���� ���� ���� ������ �Է¹޾Ƽ�, �հ�� ����� ���ϼ���.
	int eng, math, kor, Sum;
	Scanner sc = new Scanner(System.in);
	System.out.println("���������� �Է��ϼ���: ");
	kor = sc.nextInt();
	
	System.out.println("���������� �Է��ϼ���: ");
	eng = sc.nextInt();
	
	System.out.println("���������� �Է��ϼ���: ");
	math = sc.nextInt();
	
	Sum = eng + math + kor;
	double avr = Sum/3.0;
	
	System.out.println("�� ������ ������ �հ�� "+Sum+"�� �Դϴ�.");
	System.out.println("�������� ����� "+avr+"�� �Դϴ�.");
	
	/*Q1. args[]�� �̿��ؼ� ����� �亯
	*kor = Integer.parseInt(args[0]);
	*eng = Integer.parseInt(args[1]);
	*math = Integer.parseInt(args[2]);
	*Sum = eng + math + kor;
	*double avr = Sum/3.0;
	*System.out.println("�� ������ ������ �հ�� "+Sum+"�� �Դϴ�.");
	*System.out.println("�������� ����� "+avr+"�� �Դϴ�.");
	*���� ��� Ŀ�� ������ Ŭ���ϰ� ������ run as Ŭ���� 3��° Ŭ��/ ���� class Ȯ�� �� ���� �Է��ϸ� ��� ����*/
	
	//Q2. a=0, b=10, c=20, d= 30, e=40, sum1=0, sum2=0;
	int a=0, b=10, c=20, d= 30, e=40, sum1=0, sum2=0;
	
	System.out.println("----Answers for Q2----");
	b++;
	System.out.println(b++);
	System.out.println(b);
	
	sum1 = c-- + --e - a++;
	System.out.println(sum1);
	
	sum2 = sum1 - c + a;
	System.out.println(sum2);
	System.out.println(a);
	System.out.println(c);
	System.out.println(b);
	System.out.println(d);
	
	sum1 = c++ - a-- + b - --d;
	System.out.println(sum1);
	
	sum2 = --c + e++;
	System.out.println(sum2);
	
	sum2 = c +e;
	System.out.println(sum2);
}
}
