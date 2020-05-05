package day09;

import java.util.Scanner;

class TotalSalary {

	private String name;
	private String department;
	private int salary;
	private int extra;
	private int total;

	private static String department1 = "1592";
	private static String department2 = "2541";
	private static String department3 = "7844";
	private static String department4 = "5547";
	private static String department5 = "8624";
	private static String department6 = "8372";

	private static String business = "경영";
	private static String promotion = "홍보";
	private static String sales = "영업";
	private static String salesSupport = "영업지원";
	private static String logistics = "물류";
	private static String trade = "무역";

	protected TotalSalary(String name2, String department7, int salary2, int extra2) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.department =department7;
		this.salary = salary;
		this.extra = extra;
	}

	// getter setter로 바꾸기
	

	void department(String department) {

		if (department == department1) {
			department1 = department1.replaceAll(department1, business);

		} else if (department == department2) {
			department2 = department2.replaceAll(department2, business);

		} else if (department == department3) {
			department3 = department3.replaceAll(department3, business);

		} else if (department == department4) {
			department4 = department4.replaceAll(department4, business);

		} else if (department == department5) {
			department5 = department5.replaceAll(department5, business);

		} else if (department == department6) {
			department6 = department6.replaceAll(department6, business);

		} else {

			System.out.println("잘못된 입력입니다.");
			System.out.println("다시 입력해주세요: ");
			Scanner sc = new Scanner(System.in);
			department = sc.next();
		}
		System.out.println(department + "부서 ");

	}

	void information(String name, String department, int salary, int extra) {

		department(department);

		total = salary + 12 * extra;
		System.out.println(name + "님의 이번년도 최종 산정 연봉 금액은 " + total + "만원 입니다.");

	}

}

///////자식클래스
public class Ex11 extends TotalSalary {

	public Ex11(String name, String department, int salary, int extra) {
		super(name, department, salary, extra);

	}

//////////////////////////////////////////////////////메인메소드
	public static void main(String[] args) {
		// 이름과 부서 그리고 연봉,수당을 입력받아서 연산하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		String name,department;
		int salary, extra;

		System.out.println("이름을 입력하세요: ");
		name = sc.next();

		System.out.println("근무하고 있는 부서코드 4자리를 입력하세요. ");
		System.out.println("==경영(1592)/홍보(2541)/영업(7844)==");
		System.out.println("==무역(5547)/물류(8624)/영업지원(8372)==");
		department = sc.next();

		System.out.println("연봉을 입력해주세요(만원단위): ");
		salary = sc.nextInt();
		System.out.println("받아야 하는 추가 근무 수당을 입력해주세요(한달기준 만원 단위): ");
		extra = sc.nextInt();

		TotalSalary ts = new TotalSalary(name, department, salary, extra);

		ts.information(name,department, salary, extra);
	}

}
