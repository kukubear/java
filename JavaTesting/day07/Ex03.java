package day07;

import java.util.Random;
import java.util.Scanner;

//����] ���������� �ֽ��ϴ�.
//�� ������ ���¸� �����ϰ� �����ϱ�
//1. ���� ����
//2. ����: 1000����, 2000��, 3000��
//3. ��� : 500
//4. �ܾ�

	
public class Ex03 {
	static String name;
    static int phNum,account, input, withdrawl, remain;

	public Ex03(String name2, int input2, int phNum2, int withdrawl2, int remain2) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.phNum=phNum;
		this.input=input;
		this.withdrawl=withdrawl;
		this.remain=remain;
	}
//Random ������ 11�ڸ� ���¹�ȣ ����� ���� ����ϱ�
	public static void phNum() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�ڵ��� ��ȣ�� �Է��ϼ���: ");
		phNum = scan.nextInt();
		phNum=account;
		System.out.println("�Է��Ͻ� �ڵ��� ��ȣ�� ���º�ȣ�Դϴ�.");
	}
	
	public static void input() {
		int sum =0;
		Scanner scan = new Scanner(System.in);
 
		for(int i=0; i>=input; i++) {
			
			sum += input;
			if(i==0) {
				System.out.println("�Ա��� �����մϴ�.");
			    break;
			}else {
				System.out.println("�Ա��Ͻ� �ݾ��� �Է����ּ���: ");
			    input = scan.nextInt();
			    
			}
			
		}
		
	}

@SuppressWarnings("resource")
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���¸� �����Ͻ÷��� �̸��� �Է����ּ���: ");
		String name = scan.nextLine();
		phNum();
	    input();
	    
	    Ex03 infor = new Ex03(name, input,phNum,withdrawl,remain);
	    
		
		
		
		
	}




	


	
}
