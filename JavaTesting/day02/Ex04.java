package day02;
//��������(Ÿ��)
public class Ex04 {
	public static void main(String[] args) {
		//1. byte(1byte)
		byte ba=10;
		byte bb = 20;
		byte bc = (byte) (ba + bb);
		System.out.println("Byte = "+bc);
		//(byte�� short�� �⺻������ int��� �޾Ƽ� ������ ����ȯ �ʿ�)
		//2. short(2)
		short sa = 10;
		short sb = 20;
		short sc = (short)(sa+sb);
		System.out.println("Short = "+sc);
			
		//3. int(4)
		int ia = 10;
		int ib = 20;
		int ic = ia+ib;
		System.out.println("Integer = "+ic);
		
		//4. long(4)
		long la = 30l;//L���� ���ϸ� int��(����������)�ν�
		long lb = 50l;
		long lc = la+lb;
		System.out.println("Long = "+lc);
		
		//5. float(4)
		float fa = 30.67f;
		float fb = 45.12f;
		float fc = fa + fb;
		System.out.println("Float = "+fc);
		
		//6. double(8):2^63
		double da =12.456;
		double db= 123.56;
		double dc = da+db;
		System.out.println("Double = "+dc);
		
		//����
	}
}
