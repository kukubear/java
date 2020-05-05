package day03;

import java.util.Scanner;

//제어문 : 조건문, 반복문
public class Ex03 {
	public static void main(String[] args) {
	//조건문 (condition statement): if, if~else, if ~else if, if if ~else
		//수식 조건에 따라서 선택적으로 처리함
		int score = 93;
		
		if(score >=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		
		//문제] 영어점수를 입력하여 학점을 부여하는 프로그램을 작성하세요.
		Scanner scan = new Scanner(System.in);
		System.out.println("영어점수를 입력하세요: ");
		int eng = scan.nextInt();;
	    
		if(eng >=90) {
			System.out.println("등급은 A입니다.");
		}else if(eng>=80 && eng<90) {
			System.out.println("등급은 B입니다.");
		}else if(eng>=60 && eng<80) {
			System.out.println("등급은 C입니다.");
		}else if(eng<60) {
			System.out.println("F등급입니다.");
		}
		
		//문제2] 올해 년도를 입력하여 짝수해인지, 홀수해인지 판단하여 출력하세요.
		
		int year;
		System.out.println("년도를 입력하세요");
		year = scan.nextInt();
		
		if(year%2==0) {
			System.out.println(year+"은 짝수해 입니다.");
		}else if(year%2==1) {
			System.out.println(year+"은 홀수해 입니다.");
		}
		//문제 3] 홍길동의 수학성적이 85점 입니다. 
		//70점 이상이면 합격으로 하고, 아니면 불합격입니다.
		String name;
		System.out.println("이름을 입력하세요: ");
		name=scan.nextLine();
		name=scan.nextLine();
		
		
		System.out.println("수학점수를 입력하세요: ");
		int math = scan.nextInt();
		
		if(math >=70) {
			System.out.println(name+"은 합격입니다.");
		}else if(math<70) {
			System.out.println(name+"은 불합격입니다.");
		
		}
		
		
		
	}
	
}
