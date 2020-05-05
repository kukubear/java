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

	// Army의 생성자
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
		//ArmyTest의 sub가 sub다! 
		//->이렇게 안하면 같은 sub으로 인식하지 못해서 배열 안에 아무런 값이 안들어가서
		//nullpointException 일어남
	}

	// Army 속성에 대한 get/set method
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

	// grade 별 야근 수당 리턴 - 일병:100,000/ 상병:200,000 / 병장 300,000
	public String getOverTimePayByGrade() {
		//값을 담을 변수pay를 선언해주고 pay에 변환한 extrapay의 값을 넣어줘야 값을 가져올수 있음
		String pay = null;
		DecimalFormat df = new DecimalFormat("#,###");

		if (grade.equals("일병")) {
			extraPay = 100000;
			pay = df.format(extraPay);
		} else if (grade.equals("상병")) {
			extraPay = 200000;
			pay = df.format(extraPay);
		} else if (grade.equals("병장")) {
			extraPay = 300000;
			pay = df.format(extraPay);
		}

		return pay;

	}

	// 부하별 야근 수당 출력/ 형식>> name의 야근수당은 ()입니다. 금액 3자리마다 찍어서 표시
	public void printSubOverTimePay() {

		for (int i = 0; i < sub.length; i++) {
			if (sub[i] == null) {
				break;
			} else if (sub[i] instanceof SpecialArmy) {
				System.out.println(
						sub[i].name + "님은 우수병사로 특별 보너스 " + ((SpecialArmy) sub[i]).getBonus() + "만원을 추가로 지급해드립니다.");
			} else {
				//메소드를 호출해야 값을 가져올수 있음 ->다른 클래스의 속성이 private기 때문에
				System.out.println(sub[i].name + "의 야근수당은 " + sub[i].getOverTimePayByGrade() + "원 입니다.");
			}
		}
	}

	// 이번달 남은 근무기간 리턴
	public long getThisMMPeriod() {

		Calendar today = Calendar.getInstance();
		Calendar lastDayofMonth = Calendar.getInstance();
		lastDayofMonth.getMaximum(Calendar.DAY_OF_MONTH);

		long mmPeriod = (lastDayofMonth.getTimeInMillis() - today.getTimeInMillis());
		return mmPeriod;

	}

	// 부하 출력
	// 병장 홍길동 2019-01-01 ~2020-12-31
	// 우수 상병 김길동 2018-01-01 ~2021-05-31
	public void printSub() throws ParseException {
		System.out.println("==========병사 목록==========");
		for (int i = 0; i < sub.length; i++) {
			if (sub[i] == null) {
				break;
			} else {
				System.out.println("이름 : " + sub[i].getName() + ", 나이 : " + sub[i].getAge() + "세, 계급 : "
						+ sub[i].getGrade() + ", 입영날짜 : " + sub[i].getStrDt() + ", 퇴소예정일 : " + sub[i].getEndDt());
			}
		}
		System.out.println();
		System.out.println("==========병사 정보==========");
		for (int i = 0; i < sub.length; i++) {
			if (sub[i] == null) {
				break;
			}
			if (sub[i] instanceof SpecialArmy) {
				System.out.println("우수 " + grade + " " + name + " " + strDt + " " + endDt);
			} else {
				System.out.println(grade + " " + name + " " + strDt + " " + endDt);
			}

		}
	}

	public void returnSub() {
		this.sub = sub;

	}
}
