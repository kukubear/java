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

	private static String business = "�濵";
	private static String promotion = "ȫ��";
	private static String sales = "����";
	private static String salesSupport = "��������";
	private static String logistics = "����";
	private static String trade = "����";


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
		System.out.println(name + "���� �̹��⵵ ���� ���� ���� �ݾ��� " + total + "���� �Դϴ�.");

	}

	public void setDepartment(String department7) {
		// TODO Auto-generated method stub
		
	}
	
	abstract void department();

}

///////�ڽ�Ŭ����
public class Ex13 extends TotalSalary4 {



public Ex13(String name, String department, int salary, int extra) {
		this.name=name;
		this.department=department;
		this. salary = salary;
		this. extra = extra;
	}

//////////////////////////////////////////////////////���θ޼ҵ�
	
	public static void main(String[] args) {
		// �̸��� �μ� �׸��� ����,������ �Է¹޾Ƽ� �����ϴ� ���α׷� �ۼ�
		Scanner sc = new Scanner(System.in);
		String name,department;
		int salary, extra;

		System.out.println("�̸��� �Է��ϼ���: ");
		name = sc.next();

		System.out.println("�ٹ��ϰ� �ִ� �μ��ڵ� 4�ڸ��� �Է��ϼ���. ");
		System.out.println("==�濵(1592)/ȫ��(2541)/����(7844)==");
		System.out.println("==����(5547)/����(8624)/��������(8372)==");
		department = sc.next();

		System.out.println("������ �Է����ּ���(��������): ");
		salary = sc.nextInt();
		System.out.println("�޾ƾ� �ϴ� �߰� �ٹ� ������ �Է����ּ���(�Ѵޱ��� ���� ����): ");
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
