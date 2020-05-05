package day13_0710;
class A6{
	public void aaa() {
		System.out.println("aaa");
	}
	public void bbb() {
		System.out.println("bbb");
	}
}
class B6 extends A6{
	public void bbb() {
		System.out.println("bbb1");
	}
	
	public void ccc() {
		System.out.println("ccc");
	}
	
}
public class PolymorTest {
public static void main(String[] args) {
	A6 ap = new B6();
	ap.aaa();
	ap.bbb();
}
}
