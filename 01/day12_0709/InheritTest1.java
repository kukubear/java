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
		System.out.println("A1 Ŭ������ x = "+ super.x);
		System.out.println("B1 Ŭ������ x = "+ this.x);
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
		//B1�ӿ� �ִ� A�� ��ü x�� ����Ű�� �� x�� b1�� Overriding �Ǿ�����
		//y�� �ȵ�
		//����Ű�� ������ ��������? 
		System.out.println(ap.x);
		ap.disp();
	}

}
