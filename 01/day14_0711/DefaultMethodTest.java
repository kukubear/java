package day14_0711;

interface MyInterface {
	default void method1() {
		System.out.println("method1() in MyInterface");
	}

	default void method2() {
		System.out.println("method2() in MyInterface");
	}

	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}

	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}

public interface DefaultMethodTest {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method1();
		c.method2();
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
	}
}

class Child2 extends Parent2 implements MyInterface, MyInterface2{
	public void method1() {
		System.out.println("method1() in Child2");
	}
}

class Parent2{
	public void method2() {
		System.out.println("method2() in Parent2");
	}
}