package day09;

import java.util.Scanner;

/*
 * 클래스 : 객체를 사용하기 위한 틀
 * 객체 : 데이터를 처리하기 위한 틀 -> 값을 저장하기 위한 도구
 * 메소드 : 객체가 가지고 있는 데이터를 어떤 형태로 가공처리하기 위한 틀 or기준
 * 메소드 오버로딩 : 서로 다른 역할을 하지만, 이름은 반드시 메소드명과 같음 
 * 생성자 : 클래스단위 처리하는 데이터를  저장하여 초기화하는 역할 (클래스 변수)
 * 생성자 오버로딩 : 서로 다른 역할을 하지만, 이름은 반드시 클래스명과 같음 
 * 상속 : 부모클래스와 자식클래스 간의 관계성 extends(상속시) implements(정의된 멤버들을 클래스에서 대신 구현하겠다)
 * A extends B implements C,D,E{
 * interface A extends B
 * 
 * 메소드 오버라이딩 : 두 클래스가 상속관계일 때 메소드를 오버라이딩 할 수 있
 * 인터페이스 : 
 * 추상 클래스 : 
 * 내부클래스 :
 * 다형성 : 
 * */

public class Ex08OOP extends Parents {

	Ex08OOP(int dad, int mom) {
		super(dad, mom);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Parents c = new Parents(20000, 50000);
		c.add(20000, 50000);
		
	}

}
