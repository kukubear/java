package day03;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class printTest {
	public static void main(String[] args) throws IOException {
	int su = 12345;
	
	System.out.printf("\n %8d \n",su);
	System.out.printf("\n %-8d \n",su);
	System.out.printf("\n %08d \n",su);
	
	//�ѱ��� �Է¿���
	Scanner sc = new Scanner(System.in);
	
	int ken = 0;
	System.out.println("Ű����κ��� �����Է� ���: ");
	 char art = (char)System.in.read();
	 System.in.read();
	 System.in.read();
	 System.out.println("�Է��� ����: "+art);
	 
	 System.out.println("Ű����κ��� �Է¿��: ");
	 ken = System.in.read();
	 System.out.println("�Է��� ������ 10������: "+ken);
	 //0~9������ ���� 3���� �̿��Ͽ� �հ踦 ���ϴ� ���α׷��� �ۼ��ϼ���.
	 int x,y,z,sum;
	 System.out.println("X�� ���� ���ڸ��� �Է����ּ���.");
	 x = System.in.read() - 48;
	 System.in.read();
	 System.in.read();
	 
	 System.out.println("Y�� ���� ���ڸ��� �Է����ּ���.");
	 y = System.in.read() - '0';
	 System.in.read();
	 System.in.read();
	 
	 System.out.println("z�� ���� ���ڸ��� �Է����ּ���.");
	 z = System.in.read() - 48;
	 System.in.read();
	 System.in.read();
	 
	 sum = x+y+z;
	 System.out.println("�հ��"+sum);
}
}
