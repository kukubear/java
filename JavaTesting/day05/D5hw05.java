package day05;
//다음 식을 만족하는 모든 A와 B를 구하는 프로그램을 작성하세요.

public class D5hw05 {
	public static void main(String[] args) {
		int a = 0, b = 0, temp = 0;

		for (a = 1; a < 10; a++) {
			for (b = 1; b <10 ; b++) {
				if (a + b == 9) {

					System.out.println(a + ", " + b);
				}

			}
			
			
		}
		
		
	}
}
