package day06;
//��� ȣ�� �Ǻθ�
//��� �޼ҵ�:�޼ҵ尡 �ڽ��� �ٽ� ȣ���Ͽ� �۾��� �ݺ� �����ϴ� ����� ���Ѵ�.
//
import java.util.Scanner;
	


class Ex05 {
	private static void ReHi(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return;
		}
		System.out.println("HI");
		ReHi(n-1);
	}
	
	public static void main (String[] args) {
	System.out.println("���ڸ� �Է��ϼ���: ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	ReHi(n);
}

	
}
