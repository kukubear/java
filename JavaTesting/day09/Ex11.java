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

	private static String business = "�濵";
	private static String promotion = "ȫ��";
	private static String sales = "����";
	private static String salesSupport = "��������";
	private static String logistics = "����";
	private static String trade = "����";

	protected TotalSalary(String name2, String department7, int salary2, int extra2) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.department =department7;
		this.salary = salary;
		this.extra = extra;
	}

	// getter setter�� �ٲٱ�
	

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

			System.out.println("�߸��� �Է��Դϴ�.");
			System.out.println("�ٽ� �Է����ּ���: ");
			Scanner sc = new Scanner(System.in);
			department = sc.next();
		}
		System.out.println(department + "�μ� ");

	}

	void information(String name, String department, int salary, int extra) {

		department(department);

		total = salary + 12 * extra;
		System.out.println(name + "���� �̹��⵵ ���� ���� ���� �ݾ��� " + total + "���� �Դϴ�.");

	}

}

///////�ڽ�Ŭ����
public class Ex11 extends TotalSalary {

	public Ex11(String name, String department, int salary, int extra) {
		super(name, department, salary, extra);

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

		TotalSalary ts = new TotalSalary(name, department, salary, extra);

		ts.information(name,department, salary, extra);
	}

}
