package day05;

import java.util.Scanner;

//5��!���ϱ�
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=1;
		Scanner sc = new Scanner(System.in);
		for(int a=1;a<=5; a++) {
			sum*=a;
			System.out.println(sum);
		}
		/*
		 * int i, sum=1; Scanner sc = new Scanner(System.in);
		 * System.out.println("���丮�� ���� ���� �Է��ϼ���."); 
		 * int x = sc.nextInt();
		 * 
		 * for(i=1; i<=x; i++) 
		 * { sum*=i; System.out.println("i= "+i+", �հ��= "+sum); }
		 */
	}

}
