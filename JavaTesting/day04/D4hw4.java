package day04;

import java.util.Scanner;

//�������� �Է¹޾Ƽ�, ���� ���̿� �ѷ��� ���Ͽ� ����ϼ���.
//����Ϸ��� yes�� �Է��ϰ�, no�̸� �ߴ��մϴ�.
public class D4hw4 {
	public static void main(String[] args) {
		double leng, sqr,r;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("���� �������� �Է��ϼ��� :" );
		r=sc.nextDouble();
		leng = 2*r*3.14;
	    sqr = r*r*3.14;
		System.out.println("���� �ѷ��� "+leng+"�̰�, ���� ���̴� "+sqr+"�Դϴ�.");
	}
}
