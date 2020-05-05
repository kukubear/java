package day15_0712;

public class MathClassTest {
	//Mathclass�� Method�� ��� static
public static void main(String[] args) {
	//1. double abs (double a) /float,int,long -> ���밪 ��ȯ
	int l = Math.abs(-10);
	double d = Math.abs(-10.0);
	System.out.println("l�� ���� ���� = "+l);
	System.out.println("d�� ���� ���� = "+d);
	System.out.println();
	
	//2. double ceil(double a) -> �־��� ���� �ø��Ͽ� ��ȯ
	double d1 = Math.ceil(10.1);
	double d2 = Math.ceil(-10.1);
	double d3 = Math.ceil(10.000015);
	
	System.out.println("d1��  �ø� ���� = "+d1);
	System.out.println("d2�� �ø� ���� = "+d2);
	System.out.println("d3�� �ø� ���� = "+d3);
	System.out.println();
	
	//3. double floor(double a) ->�־��� ���� �����Ͽ� ��ȯ
	double d4 = Math.floor(10.8);
	double d5 = Math.floor(-10.8);
	
	System.out.println("d4��  ���� = "+d4);
	System.out.println("d5��  ���� = "+d5);
	System.out.println();
	
	//4.  double max(double a, double b)->�־��� �ΰ��� ���Ͽ� ū ���� ��ȯ/float,int,long
	double d6 = Math.max(9.5, 9.50001);
	int i = Math.max(0, -1);
	
	System.out.println("d6��  ���� = "+d6);
	System.out.println("i��  ���� = "+i);
	System.out.println();
	
	//5. double min(double a, double b) ->�־��� �ΰ��� ���Ͽ� ���� ���� ��ȯ/float,int,long
	double d7 = Math.min(9.5, 9.500001);
	int i1 = Math.min(0, -1);
	
	System.out.println("d7��  ���� = "+d7);
	System.out.println("i1��  ���� = "+i1);
	System.out.println();
	
	//6. double random() -> 0.0~0.1������ ������ double�� ��ȯ
	double d8 = Math.random();
	int i2 = (int)(Math.random()*10)+1;
	
	System.out.println("d8��  ���� = "+d8);
	System.out.println("i2��  ���� = "+i2);
	System.out.println();
	
	//7. double rint(double a) -> �־��� double���� ����� �������� double���� ��ȯ->�߾Ⱦ�
	double d9 = Math.rint(5.5);
	double d10 = Math.rint(5.1);
	double d11 = Math.rint(-5.5);
	double d12 = Math.rint(-5.1);
	
	System.out.println("d8��  ���� = "+d8);
	System.out.println("i2��  ���� = "+i2);
	
	
}
}
