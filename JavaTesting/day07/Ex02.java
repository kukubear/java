package day07;

import java.util.Scanner;

//����]å ����, ����, ���ǻ�, ����
public class Ex02 {
	
private static int price;
private static String bookName, author, company;
	

	public Ex02(String bookName, String author, String company, int price) {
		// TODO Auto-generated constructor stub
		this.bookName=bookName;
		this.author=author;
		this.company=company;
		this.price=price;
	}
	
	public void output() {
		System.out.println(bookName+"�� ���ڴ� "+author+"�̰�, ���ǻ�� "+company+"�Դϴ�.");
		System.out.println(bookName+"�� ������ "+price+"�� �Դϴ�.");
	}
	
	public void calcPrice(int x) {
		int sum = price*x;
		
		
		System.out.println("���ݱ��� �ȸ� å ���� "+sum+"�� �Դϴ�.");
	}

	public static void main(String[] args) {
		
	
		
		
		
		
		// TODO Auto-generated method stub
		
		Ex02 bookMem = new Ex02(bookName, author, company, price);
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("å ������ �Է��ϼ���.: ");
		bookName = scan.nextLine();
		System.out.println("���ڸ� �Է��ϼ���: ");
		author = scan.nextLine();
		System.out.println("���ǻ縦 �Է��ϼ���: ");
		company = scan.nextLine();
		System.out.println("å�� ������?");
		price = scan.nextInt();
		
		bookMem.output();
		bookMem.calcPrice(9);
		
		
		
	}

}
