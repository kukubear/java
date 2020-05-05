package hw0718;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Dog {
	private String name;
	private int age;
	private String kind;// 품종
	private ArrayList inoculate = new ArrayList();
	private HashSet Handler = new HashSet();
	private HashMap family = new HashMap();

	// 생성자
	Dog(String name, int age, String kind) {
		this.name = name;
		this.age = age;
		this.kind = kind;
	}

	// 속성에 대한 get/set Method
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

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public ArrayList getInoculate() {
		return inoculate;
	}

	public void setInoculate(ArrayList inoculate) {
		this.inoculate = inoculate;
	}

	public HashSet getHandler() {
		return Handler;
	}

	public void setHandler(HashSet handler) {
		Handler = handler;
	}

	public HashMap getFamily() {
		return family;
	}

	public void setFamily(HashMap family) {
		this.family = family;
	}

	// 예방접종을 하다
	// inoculate 속성에 이름과 날짜에 해당하는 예방접종 정보 저장
	// 동일한 날짜에 같은 예방접종하면 안됨
	// 품종별 예방접종 가능 기간 아니면 오류발생 -> "예방접종기간이 아닙니다."
	// 세퍼드 7일이상, 진도견 10일 이상 / 보더콜리 15일 이상
	public void shotInoculate(String name, Date date) throws Exception {
		Inoculate in = new Inoculate(name, date);

		if (inoculate.contains(in)) {
			throw new Exception("중복된 예방접종입니다.");
		}

		Collections.sort(inoculate);
		
		Inoculate max = null;
		if(inoculate.size()>0) {
				max = (Inoculate) inoculate.get(inoculate.size() - 1);}

		long day = 0;
		if ("셰퍼드".equals(this.kind)) {
			day = diffOfDate(max.getDate().toString(), date.toString());
			if (day < 7) {
				throw new Exception("예방접종 가능기간이 아닙니다.");
			}
		} else if ("진도견".equals(this.kind)) {
			day = diffOfDate(max.getDate().toString(), date.toString());
			if (day < 10) {
				throw new Exception("예방접종 가능기간이 아닙니다.");
			}
		} else if ("보더콜리".equals(this.kind)) {
			day = diffOfDate(max.getDate().toString(), date.toString());
			if (day < 15) {
				throw new Exception("예방접종 가능기간이 아닙니다.");
			}
		}
		inoculate.add(in);
	}

	public void printInoculateHistory() {
		Iterator it = inoculate.iterator();
		while(it.hasNext()) {
			System.out.println(((Inoculate)it.next()).getName());
		}
	}

	// Handler추가 (파라미터 값이 동일한 것을 추가할 수 없음)
	public void addHandler(String name, String strDt, String endDt) {
		Handler h = new Handler(name, strDt, endDt);
		Handler.add(h);
	}
	

	private long diffOfDate(String begin, String end) throws Exception {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

		java.util.Date beginDate = formatter.parse(begin);
		java.util.Date endDate = formatter.parse(end);

		long diff = endDate.getTime() - beginDate.getTime();
		long diffDays = diff / (24 * 60 * 60 * 1000);

		return diffDays;
	}

	public int getTotalHandlerPeriod() throws Exception{
		Iterator it = handler.iterator();
		int sum =0;
		
		while(it.hasNext()) {
			Handler h = (Handler) it.next();
			
		}
	}
	

	// 가족을 추가 info는 type과 name으로 구성되며 /로 구분 -> 예)부견/낙동
	// type : 부견/모견/형제/자매 /name이름:
	// 이름 중복 불가 품종은 3가지
	

}
