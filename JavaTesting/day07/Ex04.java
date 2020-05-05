package day07;

import java.util.Scanner;

//생성자 오버로딩
//인자형과 갯수에 따라서 구분합니다.

//문제] 국어 영어 수학점수, 학점를 입력받아서 처리하는데 오버로딩으로 구현하세요.
class OverLoad {
	 static int kor;//private 삭제 ->클래스변수의 접근에 대한 해제
	static int math;
	 static double eng;
	 static String grade;

	public OverLoad() {
		// TODO Auto-generated constructor stub
	}

	public OverLoad(int kor) {
		// TODO Auto-generated constructor stub
		this.kor=kor;
	}

	public OverLoad(double eng) {
		// TODO Auto-generated constructor stub
		this.eng=eng;
	}

	public OverLoad(int kor, double eng) {
		// TODO Auto-generated constructor stub
		this.kor=kor;
		this.eng=eng;
	}
	
	public OverLoad(int kor, int math) {
		// TODO Auto-generated constructor stub
		this.kor=kor;
		this.math=math;
	}

	public OverLoad(int kor, double eng, int math) {
		// TODO Auto-generated constructor stub
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}

	public OverLoad(int kor, double eng, int math, String grade) {
		// TODO Auto-generated constructor stub
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.grade=grade;
	}

	 

}

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요: ");
		int kor = scan.nextInt();
		System.out.println("영어 점수를 입력하세요: ");
		double eng = scan.nextDouble();
		System.out.println("수학점수를 입력하세요: ");
		int math = scan.nextInt();
		System.out.println("학점을 입력하세요: ");
		String grade = scan.next();
		
		OverLoad over1 = new OverLoad();
		OverLoad over2 = new OverLoad(kor);
		OverLoad over3 = new OverLoad(eng);
		OverLoad over4 = new OverLoad(kor,eng);
		OverLoad over5 = new OverLoad(kor,math);
		OverLoad over6 = new OverLoad(kor, eng, math);
		OverLoad over7 = new OverLoad(kor, eng, math, grade);
		
		System.out.println("=== 생성자 오버로딩 출력 ===");
		System.out.println("1.오브젝트를 이용한 출력");
		System.out.println("over7에 대한 국어 점수 출력: "+over7.kor);
		System.out.println("over7에 대한 영어 점수 출력: "+over7.eng);
		System.out.println("over7에 대한 수학 점수 출력: "+over7.math);
		System.out.println("over7에 대한 학점 출력: "+
		over7.grade);
		System.out.println(OverLoad.kor);
		System.out.println(OverLoad.eng);
		System.out.println(OverLoad.math);
		System.out.println(OverLoad.grade);
	}

}
