package day09;

public class Ex04 {

	public static void main(String[] args) {
		// 1 4 9 16 25
		// 0 36 49 64 81
		// 0 0 100 121 144
		// 0 0 0 169 196
		// 0 0 0 0 225

		int[][] exam = new int[5][5];
		int num = 0; String temp=" ";

		for (int i = 0; i < exam.length; i++) {
			for (int j = i; j < exam.length; j++) {
				num += 1;

				
				exam[i][j] = num * num;
			}

		}

		for (int i = 0; i < exam.length; i++) {
			for (int j = 0; j < exam.length; j++) {
				
				System.out.print(exam[i][j] + "\t");

			}
			System.out.println();
		}
	}

}
