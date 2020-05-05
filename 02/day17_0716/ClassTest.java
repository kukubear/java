package day17_0716;
class A {
	public int i;
	public A () {
		System.out.println("A ������");
	}
	public void m() {
		System.out.println("A.m()");
	}
}
class B extends A {
	public B() {
		System.out.println("B ������");
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
		//class Ŭ������ �ν��Ͻ��� �ڹ� �󿡼� class���� ǥ���Ѵ�.
		Class c1 = a.getClass(); //object�� runtime���� Ŭ������ ��ȯ�Ѵ�.
		System.out.println(c1);
		System.out.println();
		System.out.println("class name : "+c1.getName());
		System.out.println("super class name : "+c1.getSuperclass());
		System.out.println();
		
		//���ο� instance ����
		B b = (B)(c1.newInstance());
		b.m2();
		
		//B ��� �̸��� Ŭ���� ��ü�� ��ȯ,package���� ǥ��
		Class c2 =Class.forName("data.B");
		
		//B instance�� A�� ����Ű��� override�� B.m()�� ȣ��
		((A)c2.newInstance()).m();
		System.out.println("abe".getClass().getName());
		
	}
}
