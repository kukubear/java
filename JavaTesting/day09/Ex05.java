package day09;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// bitcamp Hotel�� �����Ͽ� 5���̰� ������ ȣ���� 7����
		// �������� ������ ���� ����
		// ��ü �ο����� �� ���� ��� �ο����� ��?
		// [data]
		// 1�� 10, 90, 70, 60, 80, 65, 55
		// 2�� 10, 90, 70, 60, 80, 65, 55
		// 3�� 10, 90, 70, 60, 80, 65, 55
		// 4�� 10, 90, 70, 60, 80, 65, 55
		// 5�� 10, 90, 70, 60, 80, 65, 55

		int[][] bitcamp = new int[5][7];

		Scanner sc = new Scanner(System.in);
		System.out.println("1��~5������ �ӹ��� �������� �ο� ���� 1ȣ���� 7ȣ ������� �Է��ϼ���.");
		int sum = 0, flAvr = 0;
		for (int i = 0; i < bitcamp.length; i++) {
			for (int j = 0; j < bitcamp[i].length; j++) {
				bitcamp[i][j] = sc.nextInt();
				sum += bitcamp[i][j];
				System.out.print(bitcamp[i][j] + "\t");
				System.out.println("ȣ�� ������ �ο� �� = " + sum);

			}
			System.out.println();
		}
		//for(int row=0; row<bitcamp[row].length; col++)
		
	}

}
