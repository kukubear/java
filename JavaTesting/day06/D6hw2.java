package day06;

import java.util.Scanner;

//�� ���� �Է��Ͽ� ���밪�� ���ϴ� ���α׷� �ۼ�/ �޼ҵ��̿� 
//���� ���� ����ϰų� ���� ���ϴ� ���α׷� ¥�ų� 
//���� �� ���ϴ� ���� �ð� ����
public class D6hw2 {
	public static int absolute(int x){
		
		if(x<0) {
			 System.out.println(x*(-1));

			
		}else if(x>0 ) {
			System.out.println(x);

		}else if(x==0) {
			System.out.println(x+"�� 0�Դϴ�.");

		}	
		return x;
	}
	
//���ȣ����
	/*
	 * */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���밪�� ���� �� ���� �Է��ϼ���.");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		absolute(x);
		absolute(y);
	}
}
