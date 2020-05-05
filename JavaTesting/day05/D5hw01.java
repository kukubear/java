package day05;
//1~100사이의 소수를 구하여 출력하세요

//소수는 1과 자기 자신을 약수로 갖는다.

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
