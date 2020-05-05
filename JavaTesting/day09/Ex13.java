package day09;

import java.util.Scanner;

abstract class TotalSalary4 {

	protected String name;
	protected String department;
	protected int salary;
	protected int extra;
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


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getExtra() {
		return extra;
	}

	public void setExtra(int extra) {
		this.extra = extra;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public static String getDepartment1() {
		return business;
	}

	

	public static String getDepartment2() {
		return promotion;
	}

	
	public static String getDepartment3() {
		return sales;
	}

	

	public static String getDepartment4() {
		return trade;
	}

	

	public static String getDepartment5() {
		return logistics;
	}

	

	public static String getDepartment6() {
		return salesSupport;
	}
	

	public static void setBusiness(String business) {
		TotalSalary4.department1 = business;
	}


	public static void setPromotion(String promotion) {
		TotalSalary4.department2 = promotion;
	}

	

	public static void setSales(String sales) {
		TotalSalary4.department3 = sales;
	}


	public static void setSalesSupport(String salesSupport) {
		TotalSalary4.department6 = salesSupport;
	}


	public static void setLogistics(String logistics) {
		TotalSalary4.department5 = logistics;
	}


	public static void setTrade(String trade) {
		TotalSalary4.department4 = trade;
	}

	void information(String name, int salary, int extra) {

	

		total = salary + 12 * extra;
		System.out.println(name + "님의 이번년도 최종 산정 연봉 금액은 " + total + "만원 입니다.");

	}

	public void setDepartment(String department7) {
		// TODO Auto-generated method stub
		
	}
	
	abstract void department();

}

///////자식클래스
public class Ex13 extends TotalSalary4 {



public Ex13(String name, String department, int salary, int extra) {
		this.name=name;
		this.department=department;
		this. salary = salary;
		this. extra = extra;
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

		Ex13 ts = new Ex13(name, department,  salary, extra);
		ts.setDepartment(department);
		ts.information(name, salary, extra);
	}

	@Override
	void department() {
		// 
		
	}

}
