package day02;
//bit ������
public class Ex06 {
	public static void main(String[] args) {
		//��Ű���, ���ڰ���, �������, �ݵ�ü ���� ��� �Ӻ���� �ý��ۿ��� ���
		
		int x = 20, y=30, z= x & y;
		System.out.println("&����: "+z);
		
		int z1 = x|y;
		System.out.println("|����: "+z1);
		
		int z2 = x ^ y;
		System.out.println("exor����:  "+z2);
		
		int z3 = x << 3;
		System.out.println("shift<<����:  "+z3);
		
		int z4 = x >> 3;
		System.out.println("shift>>����: "+z4);
		
		
	}
}
