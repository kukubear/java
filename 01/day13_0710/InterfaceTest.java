package day13_0710;

interface interA1 {
	int w = 10;
	static int x = 20;
	final int y = 30;
	public static final int z = 40;
}

public class InterfaceTest {
	public static void main(String[] args) {
		System.out.println("w = "+interA1.w);
		System.out.println("x = "+interA1.x);
		System.out.println("y = "+interA1.y);
		System.out.println("z = "+interA1.z);
	}
}
