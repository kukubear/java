package day09;

import java.util.Scanner;

//엄마 (20000) 아빠 50000
public class Ex09 extends MamaPapa{

	


	public Ex09(int m2, int f2) {
		super(m2, f2);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("엄마에게 받은 용돈의 금액을 입력하세요: ");
		int m = sc.nextInt();
		System.out.println("아빠에게 받은 용돈의 금액을 입력하세요: ");
		int f= sc.nextInt();
		
		MamaPapa mf = new MamaPapa(m,f);
		mf.sum();

		
	}


}
