package day15_0712;

public class ExceptionEx01 {
public static void main(String[] args) {
	System.out.println(1);
	System.out.println(2);
	try {
		System.out.println(3);//3??�� ������ 
		System.out.println(0/0);
		System.out.println(4); // ����ȵ�
	}catch(ArithmeticException ae){ 
		if(ae instanceof ArithmeticException) {
			System.out.println("true");
		}
		System.out.println("ArithmeticException");
	}catch(Exception e) {//���� ū ����
		System.out.println("Exception");
	}  //try-catch end
	System.out.println(6);
} //main end
}
