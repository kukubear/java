package day04;

import java.util.Scanner;

public class Ex01Q1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a = 0;
	System.out.println("������ ������ �Է��ϼ���: ");
	a = sc.nextInt();
	
	if(a%7 == 1) {
		System.out.println(a+"��(��) 7�� ������ �� �������� 1�Դϴ�.");
		}else if(a%7 == 2 || a%7 ==3) {
		System.out.println(a+"��(��) 7�� ������ ���������� 2 �Ǵ� 3�Դϴ�.");
		}else if(a%7 == 4 || a%7 ==5) {
		System.out.println(a+"��(��)7�� ������ ���������� 4 �Ǵ� 5�Դϴ�.");
		}else if(a%7 == 6) {
		System.out.println("��(��) 7�� ������ ���������� 6�Դϴ�.");
		}else if(a%7 == 0) {
		System.out.println(a+"��(��) 7�� ����Դϴ�.");}
	//switch~case
	
	switch(a){
		case 1:
			System.out.println(a+"��(��) 7�� ������ �� �������� 1�Դϴ�.");
			break;
		case 2:
		case 3:
			System.out.println(a+"��(��) 7�� ������ ���������� 2 �Ǵ� 3�Դϴ�.");
			break;
		case 4:
		case 5:
			System.out.println(a+"��(��)7�� ������ ���������� 4 �Ǵ� 5�Դϴ�.");
			break;
		case 6:
			System.out.println("��(��) 7�� ������ ���������� 6�Դϴ�.");
			break;
		default:
			System.out.println(a+"��(��) 7�� ����Դϴ�.");
	          break;
	          }
	}

}

