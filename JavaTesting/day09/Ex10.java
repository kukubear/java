package day09;

import java.util.Scanner;
//��Ģ������ ����� �̿��Ͽ� Ǯ�����
public class Ex10 extends CalcAll{

	Ex10(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("��Ģ������ �� ���� �Է��ϼ���: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		CalcAll ca = new CalcAll(a,b);
		System.out.println();
		System.out.println(""
				+ "��Ģ ���� ���");
		ca.Adder(a, b);
		ca.Divide(a, b);
		ca.Multiple(a, b);
		ca.Remain(a, b);
		ca.Subtract(a, b);
	}

}
