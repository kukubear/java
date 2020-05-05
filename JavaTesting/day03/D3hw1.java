package day03;
//과제1] 이름과 국어, 영어, 수학 점수를 입력받아서 총점, 평균, 학점을 구하세요. if문이용

import java.util.Scanner;

public class D3hw1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String name, grade;
	int kor, eng, math, total;
	float avr;
	
	System.out.println("이름을 입력하세요: ");
	name = sc.nextLine();
	
	System.out.println("국어점수를 입력하세요: ");
	kor = sc.nextInt();
	
	System.out.println("수학점수를 입력하세요: ");
	math = sc.nextInt();
	
	System.out.println("영어점수를 입력하세요: ");
	eng = sc.nextInt();
	
	total = kor+eng+math;
	avr = total/3;
	
	System.out.println(name+"의 총점은 "+total+"점이고, 평균은"+avr+" 점 입니다.");
	
	if(avr >=90) {
	
	System.out.println(name+"님의 학점은 A입니다.");
	
	}else if(avr<90 && avr>=80) {
		
		System.out.println(name+"님의 학점은 B입니다.");
		
	}else if(avr<80 && avr>=70) {
		System.out.println(name+"님의 학점은 C입니다.");
		
		
	}else if(avr<60) {
		System.out.println(name+"님의 학점은 F입니다.");
		
	}
	
}
}
