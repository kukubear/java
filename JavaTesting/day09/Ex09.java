package day09;

import java.util.Scanner;

//���� (20000) �ƺ� 50000
public class Ex09 extends MamaPapa{

	


	public Ex09(int m2, int f2) {
		super(m2, f2);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("�������� ���� �뵷�� �ݾ��� �Է��ϼ���: ");
		int m = sc.nextInt();
		System.out.println("�ƺ����� ���� �뵷�� �ݾ��� �Է��ϼ���: ");
		int f= sc.nextInt();
		
		MamaPapa mf = new MamaPapa(m,f);
		mf.sum();

		
	}


}
