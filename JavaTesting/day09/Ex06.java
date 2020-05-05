package day09;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 1차원과 2차원의 혼합방식
		//다음과 같이 성적이 있습니다. 이름은 1차원 배열로 하고, 데이터는 2차원 배열로 
		//총점과 평균을 구하려 출력하세요.
		//datan
		//기섭 은지 흥수
		//국어 90  90  90
		//영어 80  85  75
		//수학 70  60  90
		String name[]= new String[]{"기섭","흥수","은지"};
		int score[][] = new int[3][3];
		int sum = 0,avr=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("아래 세명의 점수를 입력하는데 세명의 국어점수, 영어점수, 수학점수 순서대로 입력하세요.");
		System.out.print(name[0]+"\t"+name[1]+"\t"+name[2]+"\t");
		
		for(int i=0; i<score.length;i++) {
			for(int j=0; j<score.length; j++) {
				score[i][j] = sc.nextInt();
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i =0; i<score.length; i++) {
			sum=0;
			
			for(int j = 0; j<score[i].length; j++) {
				sum+=score[j][i];
				
			}System.out.print(sum+"\t");
			
			
		}
	}

}
