package day11_0708;

import java.util.Arrays;

//�ǽ� �ִ밪/�ּҰ� ���ϱ�
public class ArrayEx6 {
	public static void main(String[] args) {
		int[] score = { 79, 88, 91, 33, 100, 55, 95 };
		Arrays.sort(score);

		int temp = 0;
		int min = score[0];
		int max = score[0];

		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];

			} else if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.println();
		System.out.println("�ּҰ� = " + min + "�̰�, �ִ밪 = " + max);
		//

	}
}
