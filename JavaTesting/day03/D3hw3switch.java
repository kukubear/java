package day03;

import java.util.Scanner;

public class D3hw3switch {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	 int menuNum=0;
	 
	 String menu;
	 int price=0;
	 int totalPrice, count;
	
	System.out.println("==============================");
	System.out.println("    �޴�                         ����");
	System.out.println("==============================");
	System.out.println("1. ����                       8,600");
	System.out.println("2. ���İ�Ƽ                 15,000");
	System.out.println("3. �ܹ���                    10,000");
	System.out.println("4. ����                       5,000");
	System.out.println("5. �丶��                     3,500");
	System.out.println("6. ����");
	System.out.println("==============================");
	System.out.println("���� �޴� �� ���ϴ� ���� ��ȣ�� �Է��ϼ���");
	menuNum = scan.nextInt();
	
	switch(menuNum) {
	case 1:
		menu = "����";
		price = 8600;
		break;
	case 2:
		menu = "���İ�Ƽ";
		price = 15000;
		break;
	case 3:
		menu = "�ܹ���";
		price = 10000;
		break;
	case 4:
		menu = "����";
		price = 5000;
		break;
	case 5 :
		menu = "�丶��";
		price = 3500;
		break;
	case 6 :
		menu = "����";
		System.out.println("���α׷��� �����մϴ�.");
		break;
	default :
		System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���: ");
		menuNum = scan.nextInt();
	}
	
		System.out.println("������ �Է��ϼ���: ");
		count = scan.nextInt();
		totalPrice = price*count;
		System.out.println("�����Ͻ� �ݾ��� "+totalPrice+"�� �Դϴ�.");
	
	/*String menu1 = "����";
	String menu2 = "���İ�Ƽ";
	String menu3 = "�ܹ���";
	String menu4 = "����";
	String menu5 = "�丶��";
	
	
	int menuNum1 = 8600;
	int menuNum2 = 15000;
	int menuNum3 = 10000;
	int menuNum4 = 8600;
	int menuNum5 = 5000;
	String menuNum6 = "����";*/
		
	}
}

