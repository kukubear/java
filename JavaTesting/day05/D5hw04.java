package day05;

import java.util.Scanner;

//�Ǻ���ġ ������ �ۼ��ϰ�, n��° �ױ����� ���� ���Ͽ� ����ϼ���.
//n�� �Է¹ޱ�
// 1 1 2 3 5 8........
public class D5hw04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Է��� �ױ��� �Ǻ���ġ ������ �հ踦 ���մϴ�. ���ϴ� ���� �Է��ϼ���: ");
		int n = sc.nextInt();

		if (n<= 0)
			return;
		fibo(n);
		
	}

	public static void fibo(int n) {
		int fibo=1; int sum=0;
		for(int i=1; i<=100 ;i++) {
			fibo = n+n--;
			sum+=fibo;
			System.out.println(fibo);
			
		}
		System.out.println(fibo);
		System.out.println(sum);
	}

}
