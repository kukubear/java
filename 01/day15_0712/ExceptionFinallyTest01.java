package day15_0712;

public class ExceptionFinallyTest01 {

	public static void main(String[] args) {
		// method1�� static method�̹Ƿ� �ν��Ͻ� �������� ����ȣ��
		ExceptionFinallyTest01.method1();
		System.out.println("method1�� ������ ��ġ�� main method�� ����");

	}
	
	static void method1() {
		try {
			System.out.println("method1()�� ȣ��Ǿ����ϴ�.");
			return;
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("method1()�� finally���� ����Ǿ����ϴ�.");
		}
	}//method 1 method ��    

}
