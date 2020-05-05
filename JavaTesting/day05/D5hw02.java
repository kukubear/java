package day05;

import java.util.Scanner;

//국어 영어 점수를 입력을 받아서 처리하되. 0점이상 100점 이하로 성적이 입력되도록 하여 합계와 평균을 구합니다.
public class D5hw02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eng,kor,sum,avr;
		
		System.out.println("영어점수를 입력하세요: ");
		eng = sc.nextInt();
		System.out.println("국어점수를 입력하세요: ");
		kor = sc.nextInt();
		
		if((eng>100 && eng<0)||(kor>100&&kor<0)) {
			System.out.println("잘못된 입력입니다.");
			System.out.println("점수를 다시 입력해주세요.");
			eng=sc.nextInt();
		}
		sum=eng+kor;
		avr=sum/2;
		System.out.println("총점은 "+sum+"점 입니다.");
		System.out.println("평균은 "+avr+"점 입니다.");
	}
}
