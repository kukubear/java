package day06;

import java.util.Scanner;

class CalAdder {

	public float Adder(float first, int second) {// parameter=�Ű�����,���μ�

		float sum = 0.0f;
		sum = first + second;
		return sum;
	}

}

class CalDivide {

	public void Divide() {
		int first = 500, second = 200, sum = 0;
		sum = first / second;
		System.out.println("�������� ��� = " + sum);
	}

}

class CalMultiple {

	public int Multiple() {
		int first = 500, second = 200, sum = 0;
		sum = first * second;
		return sum;
	}
}

class CalRemain {
	public void Remain() {
		int first = 500, second = 200, sum = 0;
		sum = first % second;
		System.out.println("������ ������ ��� = " + sum);
	}
}

class CalSubtract {
	public void Subtract(int first, int second) {

		int sum = 0;
		sum = first - second;
		System.out.println("������ ��� = " + sum);
	}
}

public class Ex02 {
	/*������ �������ڰ� �� ���ְ�, ���ϰ� �ֽ��ϴ�. =>�䱸���� �ľ� �� ���ԵǾ�� �ϴ� ����
	 *������ �������ڰ� �� ���ְ�, ���ϰ� �����ϴ�.
	 *������ �������ڴ� ���� ���ϰ��� �ֽ��ϴ�. 
	 *�������� �������ڿ� ���ϰ� ��� �����ϴ�. 
	 */
	public static void main(String[] args) {
		int a,b;
		
		System.out.println("������ �μ��� �Է��ϼ���: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt(); 
		b = sc.nextInt();
		
		CalAdder add = new CalAdder();//-> Ŭ���������� �Ѱܹ޴´� ��������(arguments)
		float result1 = add.Adder(a,b);//��ü��.�޼ҵ��
		
		//�޼ҵ� Adder(x,y)��� ���� ������ �� add��� ��ü(������Ʈ)�� CalAdder()��� Ŭ�������� �������
		//��ü�̹Ƿ� CalAdder()��� Ŭ���� �����Ͽ� Adder(x,y)��� �޼ҵ���� ã�Ƽ�
		//���� �������ݴϴ�.
		//���θ޼ҵ忡�� ã�� ������ �ʵ� �׸����� ���� Ŭ�������� ������ ��Ű������ Ŭ�������� ���� ������ �޼ҵ带 ã��
		//
		
		System.out.println("������ ��� = "+result1);//���μ��� �����Ѵ�.
		
		CalSubtract sub = new CalSubtract();
		sub.Subtract(a,b);
		
		CalMultiple mul = new CalMultiple();
		int result2 = mul.Multiple();
		System.out.println("������ ��� = "+result2);
		
		CalDivide dvd = new CalDivide();
		dvd.Divide();
		
		CalRemain rm = new CalRemain();
		rm.Remain();
		
		sc.close();
		
		
	}
	
	


}



