package day07;

import java.util.Scanner;

//������ �����ε�
//�������� ������ ���� �����մϴ�.

//����] ���� ���� ��������, ������ �Է¹޾Ƽ� ó���ϴµ� �����ε����� �����ϼ���.
class OverLoad {
	 static int kor;//private ���� ->Ŭ���������� ���ٿ� ���� ����
	static int math;
	 static double eng;
	 static String grade;

	public OverLoad() {
		// TODO Auto-generated constructor stub
	}

	public OverLoad(int kor) {
		// TODO Auto-generated constructor stub
		this.kor=kor;
	}

	public OverLoad(double eng) {
		// TODO Auto-generated constructor stub
		this.eng=eng;
	}

	public OverLoad(int kor, double eng) {
		// TODO Auto-generated constructor stub
		this.kor=kor;
		this.eng=eng;
	}
	
	public OverLoad(int kor, int math) {
		// TODO Auto-generated constructor stub
		this.kor=kor;
		this.math=math;
	}

	public OverLoad(int kor, double eng, int math) {
		// TODO Auto-generated constructor stub
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}

	public OverLoad(int kor, double eng, int math, String grade) {
		// TODO Auto-generated constructor stub
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.grade=grade;
	}

	 

}

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���: ");
		int kor = scan.nextInt();
		System.out.println("���� ������ �Է��ϼ���: ");
		double eng = scan.nextDouble();
		System.out.println("���������� �Է��ϼ���: ");
		int math = scan.nextInt();
		System.out.println("������ �Է��ϼ���: ");
		String grade = scan.next();
		
		OverLoad over1 = new OverLoad();
		OverLoad over2 = new OverLoad(kor);
		OverLoad over3 = new OverLoad(eng);
		OverLoad over4 = new OverLoad(kor,eng);
		OverLoad over5 = new OverLoad(kor,math);
		OverLoad over6 = new OverLoad(kor, eng, math);
		OverLoad over7 = new OverLoad(kor, eng, math, grade);
		
		System.out.println("=== ������ �����ε� ��� ===");
		System.out.println("1.������Ʈ�� �̿��� ���");
		System.out.println("over7�� ���� ���� ���� ���: "+over7.kor);
		System.out.println("over7�� ���� ���� ���� ���: "+over7.eng);
		System.out.println("over7�� ���� ���� ���� ���: "+over7.math);
		System.out.println("over7�� ���� ���� ���: "+
		over7.grade);
		System.out.println(OverLoad.kor);
		System.out.println(OverLoad.eng);
		System.out.println(OverLoad.math);
		System.out.println(OverLoad.grade);
	}

}
