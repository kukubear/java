package day17_0716;

class A {
	void test(String[] s) {
		s[0] = "A";
	}
}

public class CollectionTest {
	public static void main(String[] args) {
		A a = new A();
		String []ss = new String [5];
		//a.test(ss);
		System.out.println(ss[0]);
		//System.out.println(ss);
	}
}
