package day02;
//Ű����� ������ �Է��ϴ� �����
import java.io.BufferedReader;
import java.io.InputStreamReader;

//Ű����κ��� ������ �Է¹�� 2
public class Ex01 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ù ��° ���� �Է�: ");
		String x = br.readLine();
		float xx = Integer.parseInt(x);
		System.out.println("�� ��° ���� �Է�: ");
		String y = br.readLine();
		float yy = Float.parseFloat(y);
		float zz = xx + yy;
		System.out.println(zz);
		
		
	}
}
