package day05;

import java.util.Scanner;

public class CalMultiple {

	public void Multiple() {
		Scanner sc = new Scanner(System.in);
		int first, second,sum;
		
		System.out.println("���ϴ� �μ��� �Է����ּ���.");
		first = sc.nextInt();
		second = sc.nextInt();
		
		sum = first * second;
		System.out.println("������ ��� = "+sum);
		
	}

}