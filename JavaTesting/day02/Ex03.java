package day02;
//������ : ���� ū ���̳� ���� ���� ���� ǥ���� ��, ���� �߻��� �� ���
//10���� 2���� 8���� 16���� �������
public class Ex03 {
	public static void main(String[] args) {
		double e1 = 333.1415e-3;
		double e2 = 15.123e+3;
		double e3 = 1234567.123e-7;
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		int x = 100;//10����
		int y = 0100;//8����
		int z = 0x100;//16���� = 2�� 4��(4bit�� ������ ó��)
		int a = 0b0010;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
		
		//�ٴ���ǻ���� ȿ�� : �߱����� ->����������->�����̸�
		//10���� : ��� �ַ� ���
		//2���� : 0�� 1�� ǥ��
		//8���� : 0~7�� ǥ��
		//16���� :0~9, A,B,C,D,E,F(15)�� ǥ��
		
		//API �������� - oracle -> java SE -> java APIs
		System.gc();//
		//java.lang. -> ��������
		
		System.out.println(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		
	}
}
