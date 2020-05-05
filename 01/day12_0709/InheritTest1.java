package day12_0709;
class A1 {
	protected int x = 100;
	protected void disp() {
		
	}
}

class B1 extends A1 {
	//privat int x = 200;
	public int x = 200;
	public int y = 100;
	public void disp() {//Overriding
		System.out.println("A1 클래스의 x = "+ super.x);
		System.out.println("B1 클래스의 x = "+ this.x);
	}


public void disp2() {
	
}
}
public class InheritTest1 {
	public static void main(String[] args) {
		B1 bp = new B1();
		System.out.println(bp.x);
		bp.disp();
		
		A1 ap = new B1();
		//B1속에 있는 A의 객체 x를 가리키고 그 x가 b1에 Overriding 되어있음
		//y는 안됨
		//가리키는 범위가 좁아진다? 
		System.out.println(ap.x);
		ap.disp();
	}

}
