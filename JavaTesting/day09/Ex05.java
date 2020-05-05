package day09;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// bitcamp Hotel을 증축하여 5층이고 각층의 호실은 7개씩
		// 투숙객이 다음과 같이 있음
		// 전체 인원수와 각 층의 평균 인원수는 얼마?
		// [data]
		// 1층 10, 90, 70, 60, 80, 65, 55
		// 2층 10, 90, 70, 60, 80, 65, 55
		// 3층 10, 90, 70, 60, 80, 65, 55
		// 4층 10, 90, 70, 60, 80, 65, 55
		// 5층 10, 90, 70, 60, 80, 65, 55

		int[][] bitcamp = new int[5][7];

		Scanner sc = new Scanner(System.in);
		System.out.println("1층~5층까지 머무는 투숙객의 인원 수를 1호부터 7호 순서대로 입력하세요.");
		int sum = 0, flAvr = 0;
		for (int i = 0; i < bitcamp.length; i++) {
			for (int j = 0; j < bitcamp[i].length; j++) {
				bitcamp[i][j] = sc.nextInt();
				sum += bitcamp[i][j];
				System.out.print(bitcamp[i][j] + "\t");
				System.out.println("호텔 투숙객 인원 수 = " + sum);

			}
			System.out.println();
		}
		//for(int row=0; row<bitcamp[row].length; col++)
		
	}

}
