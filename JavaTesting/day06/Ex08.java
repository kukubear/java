package day06;

import java.util.Scanner;

/*����] 100�� 200�� ������� �հ踦 ���Ͽ� ����ϼ���.
 * ��, ����ó���� �ܺ�ó��(Measure class)�� �����Ͽ� �մϴ�.
 * ��� : ����� ������ ����� �������� �� 
 * 
 * */
public class Ex08 {
	
	public static int measure(int a){
		
		int sum=0;
		for(int i=1;i<=a;i++) {
			
				if(a%i==0) {
					sum +=i;
					System.out.println(sum);
					
				}
			
		}
		System.out.println();
		return sum;
		
	}
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���� �� ���� �Է��ϼ���: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		/*
		 * Measure ms = new Measure(); System.out.println(x+"������� �� = "+ms.measure(x));
		 * System.out.println(y+"�� ������� �� = "+ms.measure(y));
		 */
		
		
		  int sum = measure(x);
		  System.out.println("1.���� 100�� 200�� ����� ���� = "+sum);	
		  System.out.println();
		  int sum2 = measure(y); 
		  System.out.println("2.�ܺ� 100�� 200�� ����� ���� = "+sum2);
//		 System.out.println();
	}
}
