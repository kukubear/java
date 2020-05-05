package day02;

import java.util.Scanner;

public class Ex05Q12 {
public static void main(String[] args) {
	//Q1. 국어 영어 수학 점수를 입력받아서, 합계와 평균을 구하세요.
	int eng, math, kor, Sum;
	Scanner sc = new Scanner(System.in);
	System.out.println("국어점수를 입력하세요: ");
	kor = sc.nextInt();
	
	System.out.println("영어점수를 입력하세요: ");
	eng = sc.nextInt();
	
	System.out.println("수학점수를 입력하세요: ");
	math = sc.nextInt();
	
	Sum = eng + math + kor;
	double avr = Sum/3.0;
	
	System.out.println("세 과목의 점수의 합계는 "+Sum+"점 입니다.");
	System.out.println("세과목의 평균은 "+avr+"점 입니다.");
	
	/*Q1. args[]를 이용해서 만드는 답변
	*kor = Integer.parseInt(args[0]);
	*eng = Integer.parseInt(args[1]);
	*math = Integer.parseInt(args[2]);
	*Sum = eng + math + kor;
	*double avr = Sum/3.0;
	*System.out.println("세 과목의 점수의 합계는 "+Sum+"점 입니다.");
	*System.out.println("세과목의 평균은 "+avr+"점 입니다.");
	*실행 방법 커서 오른쪽 클릭하고 오른쪽 run as 클릭후 3번째 클릭/ 위에 class 확인 후 점수 입력하면 결과 나옴*/
	
	//Q2. a=0, b=10, c=20, d= 30, e=40, sum1=0, sum2=0;
	int a=0, b=10, c=20, d= 30, e=40, sum1=0, sum2=0;
	
	System.out.println("----Answers for Q2----");
	b++;
	System.out.println(b++);
	System.out.println(b);
	
	sum1 = c-- + --e - a++;
	System.out.println(sum1);
	
	sum2 = sum1 - c + a;
	System.out.println(sum2);
	System.out.println(a);
	System.out.println(c);
	System.out.println(b);
	System.out.println(d);
	
	sum1 = c++ - a-- + b - --d;
	System.out.println(sum1);
	
	sum2 = --c + e++;
	System.out.println(sum2);
	
	sum2 = c +e;
	System.out.println(sum2);
}
}
