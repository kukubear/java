package day07;

import java.util.Scanner;

//생성자 오버로딩
//과제1] 기섭이라는 이름의 친구
// 국어, 영어, 수학점수가 입력이 됩니다.
//이 세과목의 입력 데이터를 생성자를 이용하여 입력을 받고 저장
//총점, 평균 구하기
public class D7hw1 {
	static int kor,eng,math;
	String name = "기섭";

	public D7hw1(int kor, int eng, int math) {
		// TODO Auto-generated constructor stub
		
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		
		int sum = kor+eng+math;
		int avr = sum/3;
		
		System.out.println(name+"님의 세 과목의 총점은 "+sum+"점이고, 평균은 "+avr+"점 입니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요: ");
		int kor = scan.nextInt();
		System.out.println("영어 점수를 입력하세요: ");
		int eng = scan.nextInt();
		System.out.println("수학 점수를 입력하세요: ");
		int math = scan.nextInt();
		
		
		
		D7hw1 input = new D7hw1(kor, eng, math);
		;
		
		
	}

}
