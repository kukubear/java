package day05;
//1~100������ �Ҽ��� ���Ͽ� ����ϼ���

//�Ҽ��� 1�� �ڱ� �ڽ��� ����� ���´�.

public class D5hw01 {
	public static void main(String[] args) {
		int count = 0;

		for (int a = 2; a <= 100; a++) {

			for (int b = 2; b <= a; b++) {

				if (a % b == 0) {
					count++;

				}
			}

			if (count == 1) {
				System.out.println(a);
			}
			count = 0;

		}
	}
}
