package day03;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		//���ǽ� : ���������� 70������ ũ�ų� ������ �հ� �ƴϸ� ���հ�
		//���ǿ����� : ���ǽ� ? ��:����;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���: ");
		int eng;
		eng = scan.nextInt();
		int grade = (eng>=90)? 'A' : (eng<90 && eng>=80)? 'B' :(eng < 80 && eng >=60) ? 'C':'F' 
					;
	   System.out.println(grade);
}
}
