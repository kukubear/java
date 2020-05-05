package day06;

import java.util.Scanner;

//문제 ] 이름과 나이를 입력받아서 메소드 오버로딩을 이용하여 출력하세요
public class Ex10 {
	public static  void printInformation(String name) {
		// TODO Auto-generated method stub
		System.out.print("이름은 "+name+"이고, ");
	}
	
	public static void printInformation(int age) {
		// TODO Auto-generated method stub
		System.out.println("나이는 "+age+"입니다.");
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("이름과 나이를 입력하세요.");
	String name = sc.nextLine();
	int age = sc.nextInt();
	
	
	printInformation(name);
	printInformation(age);
}

	
}
