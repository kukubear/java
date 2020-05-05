package day07;

//
//
public class D7hw2 {

	public static void main(String[] args) {

		int score[] = { 100, 90, 90, 100, 100, 95, 56 };
		int sum = 0, count = 0;

		for (int i = 0; i < score.length; i++) {

			if (score[i] % 3 == 0) {

				sum += score[i];
				count++;

			}

		}

		System.out.println("3의 배수들의 합은 " + sum);
		System.out.println("평균은 " + sum / count);

	}

}
