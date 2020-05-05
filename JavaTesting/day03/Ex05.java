package day03;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		//조건식 : 수학점수가 70점보다 크거나 같으면 합격 아니면 불합격
		//조건연산자 : 조건식 ? 참:거짓;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요: ");
		int eng;
		eng = scan.nextInt();
		int grade = (eng>=90)? 'A' : (eng<90 && eng>=80)? 'B' :(eng < 80 && eng >=60) ? 'C':'F' 
					;
	   System.out.println(grade);
}
}
