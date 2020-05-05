package day18_0717;

import java.util.Date;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;

public class Army {
	private String name;
	private int age;
	private String grade;
	private String strDt;
	private String endDt;
	private Date nextHoliday;
	private Army[] sub;
	private int extraPay;

	// Army�� ������
	Army(String name, int age, String grade, String strDt, String endDt) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.strDt = strDt;
		this.endDt = endDt;
	}

	
	Army(String name, int age, String grade, String strDt, String endDt, Army[] sub) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.strDt = strDt;
		this.endDt = endDt;
		this.sub = sub; 
		//ArmyTest�� sub�� sub��! 
		//->�̷��� ���ϸ� ���� sub���� �ν����� ���ؼ� �迭 �ȿ� �ƹ��� ���� �ȵ���
		//nullpointException �Ͼ
	}

	// Army �Ӽ��� ���� get/set method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	//
	public String getStrDt() throws ParseException {

		Date strDt1=null;
		strDt1 = new SimpleDateFormat("yyyyMMdd").parse(strDt);
		String strDt2 = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		strDt2 = sdf.format(strDt1);
		
		
		return strDt2;
	}

	public void setStrDt(String strDt) {
		this.strDt = strDt;
	}

	public String getEndDt() throws ParseException {
		Date endDt1=null;
		endDt1 = new SimpleDateFormat("yyyyMMdd").parse(endDt);
		String endDt2 = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		endDt2 = sdf.format(endDt1);
		return endDt2;
	} 

	public void setEndDt(String endDt) {

		this.endDt = endDt;
	}

	public Date getNextHoliday() {
		return nextHoliday;
	}

	public void setNextHoliday(Date nextHoliday) {
		this.nextHoliday = nextHoliday;
	}

	public Army[] getSub() {
		return sub;
	}

	public void setSub(Army[] sub) {
		this.sub = sub;
	}

	// grade �� �߱� ���� ���� - �Ϻ�:100,000/ ��:200,000 / ���� 300,000
	public String getOverTimePayByGrade() {
		//���� ���� ����pay�� �������ְ� pay�� ��ȯ�� extrapay�� ���� �־���� ���� �����ü� ����
		String pay = null;
		DecimalFormat df = new DecimalFormat("#,###");

		if (grade.equals("�Ϻ�")) {
			extraPay = 100000;
			pay = df.format(extraPay);
		} else if (grade.equals("��")) {
			extraPay = 200000;
			pay = df.format(extraPay);
		} else if (grade.equals("����")) {
			extraPay = 300000;
			pay = df.format(extraPay);
		}

		return pay;

	}

	// ���Ϻ� �߱� ���� ���/ ����>> name�� �߱ټ����� ()�Դϴ�. �ݾ� 3�ڸ����� �� ǥ��
	public void printSubOverTimePay() {

		for (int i = 0; i < sub.length; i++) {
			if (sub[i] == null) {
				break;
			} else if (sub[i] instanceof SpecialArmy) {
				System.out.println(
						sub[i].name + "���� �������� Ư�� ���ʽ� " + ((SpecialArmy) sub[i]).getBonus() + "������ �߰��� �����ص帳�ϴ�.");
			} else {
				//�޼ҵ带 ȣ���ؾ� ���� �����ü� ���� ->�ٸ� Ŭ������ �Ӽ��� private�� ������
				System.out.println(sub[i].name + "�� �߱ټ����� " + sub[i].getOverTimePayByGrade() + "�� �Դϴ�.");
			}
		}
	}

	// �̹��� ���� �ٹ��Ⱓ ����
	public long getThisMMPeriod() {

		Calendar today = Calendar.getInstance();
		Calendar lastDayofMonth = Calendar.getInstance();
		lastDayofMonth.getMaximum(Calendar.DAY_OF_MONTH);

		long mmPeriod = (lastDayofMonth.getTimeInMillis() - today.getTimeInMillis());
		return mmPeriod;

	}

	// ���� ���
	// ���� ȫ�浿 2019-01-01 ~2020-12-31
	// ��� �� ��浿 2018-01-01 ~2021-05-31
	public void printSub() throws ParseException {
		System.out.println("==========���� ���==========");
		for (int i = 0; i < sub.length; i++) {
			if (sub[i] == null) {
				break;
			} else {
				System.out.println("�̸� : " + sub[i].getName() + ", ���� : " + sub[i].getAge() + "��, ��� : "
						+ sub[i].getGrade() + ", �Կ���¥ : " + sub[i].getStrDt() + ", ��ҿ����� : " + sub[i].getEndDt());
			}
		}
		System.out.println();
		System.out.println("==========���� ����==========");
		for (int i = 0; i < sub.length; i++) {
			if (sub[i] == null) {
				break;
			}
			if (sub[i] instanceof SpecialArmy) {
				System.out.println("��� " + grade + " " + name + " " + strDt + " " + endDt);
			} else {
				System.out.println(grade + " " + name + " " + strDt + " " + endDt);
			}

		}
	}

	public void returnSub() {
		this.sub = sub;

	}
}
