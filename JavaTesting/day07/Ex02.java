package day07;

import java.util.Scanner;

//문제]책 제목, 저자, 출판사, 가격
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
		System.out.println(bookName+"의 저자는 "+author+"이고, 출판사는 "+company+"입니다.");
		System.out.println(bookName+"의 가격은 "+price+"원 입니다.");
	}
	
	public void calcPrice(int x) {
		int sum = price*x;
		
		
		System.out.println("지금까지 팔린 책 값은 "+sum+"원 입니다.");
	}

	public static void main(String[] args) {
		
	
		
		
		
		
		// TODO Auto-generated method stub
		
		Ex02 bookMem = new Ex02(bookName, author, company, price);
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("책 제목을 입력하세요.: ");
		bookName = scan.nextLine();
		System.out.println("저자를 입력하세요: ");
		author = scan.nextLine();
		System.out.println("출판사를 입력하세요: ");
		company = scan.nextLine();
		System.out.println("책의 가격은?");
		price = scan.nextInt();
		
		bookMem.output();
		bookMem.calcPrice(9);
		
		
		
	}

}
