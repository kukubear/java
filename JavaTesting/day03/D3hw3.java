package day03;

import java.util.Scanner;

/*[����3] �������� �޴��� �پ��ϰ� ���õǾ� �ֽ��ϴ�.

 1.���� 2.���İ�Ƽ 3.�ܹ��� 4.���� 5.�丶�䰡 ���� �մϴ�.

 ���� ������ 8600���̰�, ���İ�Ƽ�� 15000��, �ܹ��Ŵ� 10����, ������ 5õ��, �丶��� 3500�� �Դϴ�.

 if������ �ۼ��ϰ�, �̸� switch ~ case������ �Űܺ�����.



 1

�ֹ��� ������ ������ �Է��ϼ���: 3

 8600 * 3 = 25,800�� �Դϴ�.

 6

���α׷��� ����Ǿ����ϴ�.*/
public class D3hw3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		 int menuNum=0;
		 
		 String menu;
		 int price = 0;
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
		
		if(menuNum == 1) {
			menu = "����";
			price = 8600;
			
		}else if(menuNum == 2) {
			menu = "���İ�Ƽ";
			price = 15000;
			
		}else if(menuNum == 3) {
			menu = "�ܹ���";
			price = 10000;
			
		}else if(menuNum == 4) {
			menu = "����";
			price = 5000;
			
		}else if(menuNum == 5) {
			menu = "�丶��";
			price = 3500;
			
		}else if(menuNum ==6) {
			menu = "����";
			System.out.println("���α׷��� �����մϴ�.");
			return;
		}
		
		if(menuNum <=0 && menuNum>6){
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���: ");
			menuNum = scan.nextInt();
		}
		
		System.out.println("������ �Է��ϼ���: ");
		count = scan.nextInt();
		totalPrice = price*count;
		System.out.println("�����Ͻ� �ݾ��� "+totalPrice+"�� �Դϴ�.");
			
		
	}

}
