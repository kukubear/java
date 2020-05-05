package day12_0709;
class A {
	private int x = 100;
	private int y = 200;
	
}

class B extends A {
	private int r = 300;
}

public class InheritTest {
	public static void main(String[] args) {
		B bp = new B();
		//아무런 멤버변수에 접근 할 수 없음
	}
	
}
