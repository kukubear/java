package day09;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//�迭���� ���ϴ� ������ ã��
		int test[] = new int [10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("10���� ������ �����͸� �Է����ּ���.");
		for(int i=0; i<test.length; i++) {
			test[i] = sc.nextInt();
			
		}
		System.out.println();
		System.out.println("ã�� �����͸� �Է��ϼ���.");
		
		int su = sc.nextInt();
		
		for(int i=0; i<test.length; i++) {
			if(test[i]==su)
				break;
			
			if(i!=test.length)
				System.out.println("���ڰ� ��ġ�� ���� �迭�� ÷�ڴ� = "+i);
			else
				System.out.println("���ڸ� ã�� ���߽��ϴ�.");
		}
	}

}
