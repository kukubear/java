package day06;
import java.util.Scanner;

//����2]"Hello"��� ���ڿ���HelloClass()��� �޼ҵ带 �̿��Ͽ� ����ϼ���.
/*Method OverLoading(�޼ҵ� �����ε�)
 * �ǹ�: ���� �̸��� �޼ҵ������ ���� �ٸ� ����� �����ϰ��� �� �� �����
 *����>
 *1. �̸��� �ݵ�� ���ƾ���
 *2. �ڷ����� ������ ���� �ٸ��ų� ������ ������ ���� �޶�� ��
 *3. */
class HelloClass{
	 void Hello() {//�������� ���� �����ϴ�.
		
		System.out.println("first Hello");
	}
	 void Hello(float x) {
		for(float i=1.0f; i<=5.0f;i++) {
		System.out.println("Hello");
		}
	}

	 void Hello(float x,int y) {//�������� 2��
		float sum = 0.0f;
		sum= x+y;
		System.out.println("�հ�� = "+sum);
	}
	 void Hello(int x) {
		 int i =1;
			for( i=1; i<=9;i++) {
			System.out.println("������ "+x+"���� "+x+" * "+i+" = "+(x*i));
			}
		}
	 void Hello(int start,int end) {//�������� 2��
		int i,j;
			for(i=start; i<=end; i++) {
				for(j=1; j<=9; j++) {
			System.out.println("2. ������ = "+i+" * "+j+" = "+(i*j));
				}
				System.out.println();
			}
		}
	//6.
		void HAP(int x) {
		int sum = 0;
		for(int i =1; i<=100; i++) {
			sum+=i;
		}
		 System.out.println("1~100�հ� = "+sum);
	}

	//7. 
		int SUM(int x, int y) {
		int i,sum=0;
		for(i=x; i<=y; i++) {
			sum+=i;
		}
		return sum;
	}
	}

	

public class Ex04 {
	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); 
		 */
		HelloClass x = new HelloClass();
		x.Hello();//��������0
		x.Hello(5.0f);//1��
		x.Hello(5f, 2);//2��
		//���� 3���� ���μ��� �Ѱܼ� Hello�޼ҵ�� 3������غ���
		x.Hello(3);
		
		//���۴ܰ� ������ ���μ��� �Ѱܼ� Hello�޼ҵ�� �������� ����غ�����.
		x.Hello(3,7);
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���: ");
		int x1 = sc.nextInt();
		HelloClass hc = new HelloClass();
		hc.HAP(x1);
		
		//Sum()�̶�� �޼ҵ带 �̿��Ͽ� ���۰�(1)�� ����(100)�� �־����� �հ踦 ���Ͽ� ����ϼ���.
		
		int sum = hc.SUM(1,100);
		System.out.println(sum);
}
}
