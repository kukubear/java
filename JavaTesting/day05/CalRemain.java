package day05;

import java.util.Scanner;

public class CalRemain {

	public void Remain() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int first, second,sum;
		
		
		System.out.println("���ϴ� �μ��� �Է����ּ���.");
		first = sc.nextInt();
		second = sc.nextInt();
		
		sum = first % second;
		System.out.println("������ ������ ��� = "+sum);
		
	}

}
