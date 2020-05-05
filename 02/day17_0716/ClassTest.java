package day17_0716;
class A {
	public int i;
	public A () {
		System.out.println("A 생성자");
	}
	public void m() {
		System.out.println("A.m()");
	}
}
class B extends A {
	public B() {
		System.out.println("B 생성자");
	}
	public void m() {
		System.out.println("B_m()");
	}
	public void m2() {
		System.out.println("B_m2()");
	}
}
public class ClassTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		A a = new B();
		//class 클래스의 인스턴스는 자바 상에서 class들을 표현한다.
		Class c1 = a.getClass(); //object의 runtime상의 클래스를 반환한다.
		System.out.println(c1);
		System.out.println();
		System.out.println("class name : "+c1.getName());
		System.out.println("super class name : "+c1.getSuperclass());
		System.out.println();
		
		//새로운 instance 형성
		B b = (B)(c1.newInstance());
		b.m2();
		
		//B 라는 이름의 클래스 객체를 반환,package까지 표현
		Class c2 =Class.forName("data.B");
		
		//B instance를 A가 가르키기로 override된 B.m()을 호출
		((A)c2.newInstance()).m();
		System.out.println("abe".getClass().getName());
		
	}
}
