package day06;

import java.util.Scanner;

//10!�� ���Ͽ� �հ踦 ����ϼ���. �޼ҵ��̿�



public class D6hw1 {
	
	public static int factorial(int a){
		int sum=1;
		for(int i=1; i<=a; i++) {
			sum*=i;
			;
				
		}
		System.out.println(sum);
		return sum;
	
	}
	
	
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("���ڸ� �Է��ϼ���: ");
	int x=sc.nextInt();
	
	 factorial(x);
	
}
}
