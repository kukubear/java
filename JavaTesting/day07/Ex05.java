package day07;

import java.util.Scanner;

//문제] 이름과 나이 주소를 입력받아서 생성자로 저장하고 출력하기
class OverLoad1{
	static String name, address;
	static int age;

	public OverLoad1(String name, int age, String address) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
}
public class Ex05 {
	static String name, address;
	static int age;
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요: ");
		String name = scan.next();
		System.out.println("나이를 입력하세요: ");
		int age = scan.nextInt();
		System.out.println("주소를 입력하세요: ");
		String address = scan.next();
		
		OverLoad1 over = new OverLoad1(name, age, address);
		System.out.println(OverLoad1.name);
		System.out.println(OverLoad1.age);
		System.out.println(OverLoad1.address);
	}

}
