package day09;

import java.util.Scanner;

class TotalSalary2 {

	private String name;
	private int department;
	private int salary;
	private int extra;
	private int total;
	private static int department1 = 1592;
	private static int department2 = 2541;
	private static int department3 = 7844;
	private static int department4 = 5547;
	private static int department5 = 8624;
	private static int department6 = 8372;

	static String business = "경영";
	static String promotion = "홍보";
	static String sales = "영업";
	static String salesSupport = "영업지원";
	static String logistics = "물류";
	static String trade = "무역";
	
	
	public String getName() {//값을 반환해준다.
		return name;
	}



	public void setName(String name) {//값을 받아와 넣어준다.
		this.name = name;
	}



	public int getDepartment() {
		return department;
	}



	public void setDepartment(int department) {
		this.department = department;
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



	public static int getDepartment1() {
		return department1;
	}



	public static void setDepartment1(int department1) {
		TotalSalary2.department1 = department1;
	}



	public static int getDepartment2() {
		return department2;
	}



	public static void setDepartment2(int department2) {
		TotalSalary2.department2 = department2;
	}



	public static int getDepartment3() {
		return department3;
	}



	public static void setDepartment3(int department3) {
		TotalSalary2.department3 = department3;
	}



	public static int getDepartment4() {
		return department4;
	}



	public static void setDepartment4(int department4) {
		TotalSalary2.department4 = department4;
	}



	public static int getDepartment5() {
		return department5;
	}



	public static void setDepartment5(int department5) {
		TotalSalary2.department5 = department5;
	}



	public static int getDepartment6() {
		return department6;
	}



	public static void setDepartment6(int department6) {
		TotalSalary2.department6 = department6;
	}



	public static String getBusiness() {
		return business;
	}



	public static void setBusiness(String business) {
		TotalSalary2.business = business;
	}



	public static String getPromotion() {
		return promotion;
	}



	public static void setPromotion(String promotion) {
		TotalSalary2.promotion = promotion;
	}



	public static String getSales() {
		return sales;
	}



	public static void setSales(String sales) {
		TotalSalary2.sales = sales;
	}



	public static String getSalesSupport() {
		return salesSupport;
	}



	public static void setSalesSupport(String salesSupport) {
		TotalSalary2.salesSupport = salesSupport;
	}



	public static String getLogistics() {
		return logistics;
	}



	public static void setLogistics(String logistics) {
		TotalSalary2.logistics = logistics;
	}



	public static String getTrade() {
		return trade;
	}



	public static void setTrade(String trade) {
		TotalSalary2.trade = trade;
	}



	

	

//	void department(int department) {
//			
//		if (department == department1) { //1592
//			//business = Integer.toString(department1);	
//			if())
//
//		} else if (department == department2) {
//			promotion = Integer.toString(department2);
//
//		} else if (department == department3) {
//			sales = Integer.toString(department3);
//
//		} else if (department == department4) {
//			trade = Integer.toString(department4);
//
//		} else if (department == department5) {
//			logistics = Integer.toString(department5);
//
//		}
//		else if (department == department6) {
//			salesSupport = Integer.toString(department6);
//
//		} else{
//
//			System.out.println("잘못된 입력입니다.");
//			System.out.println("다시 입력해주세요: ");
//			Scanner sc = new Scanner(System.in);
//			department = sc.nextInt();
//		}
//		System.out.println(department + "부서 ");

//	}

	void information(String name, int department, int salary, int extra) {

		String temp = null;
		if (department == 1592)
			temp = "경영";
		else if (department == 2541)
			temp = "홍보";
		else if (department == 7844)
			temp = "영업";
		else if (department == 8372)
			temp = "영업지원";
		else if (department == 8624)
			temp = "물류";
		else if (department == 5547)
			temp = "무역";
		else {
			System.out.println("잘못된 입력입니다.");
			System.out.println("다시 입력해주세요: ");
			// Scanner sc = new Scanner(System.in);
			// department = sc.nextInt();
		}
		System.out.println(temp + "부서 ");

		total = salary + 12 * extra;
		System.out.println(name + "님의 이번년도 최종 산정 연봉 금액은 " + total + "만원 입니다.");

	}

}

public class Ex12 extends TotalSalary2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 이름과 부서 그리고 연봉,수당을 입력받아서 연산하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		String name;
		int salary, extra, department;

		System.out.println("이름을 입력하세요: ");
		name = sc.next();

		System.out.println("근무하고 있는 부서코드 4자리를 입력하세요. ");
		System.out.println("==경영(1592)/홍보(2541)/영업(7844)==");
		System.out.println("==무역(5547)/물류(8624)/영업지원(8372)==");
		department = sc.nextInt();

		System.out.println("연봉을 입력해주세요(만원단위): ");
		salary = sc.nextInt();
		System.out.println("받아야 하는 추가 근무 수당을 입력해주세요(한달기준 만원 단위): ");
		extra = sc.nextInt();

		
		// ts.department(department);
		TotalSalary2 ts = new TotalSalary2();
 		ts.information(name,department,salary,extra
 				);

	}

}
