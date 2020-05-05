package hw0718;

import java.util.HashSet;
import java.util.Objects;

public class Handler {

	private String name;
	private String strDt;
	private String endDt;
	HashSet<String> HandlerInfo = new HashSet<>();

	// 생성자
	Handler(String name, String strDt, String endDt) {
		this.name = name;
		this.strDt = strDt;
		this.endDt = endDt;
	}

	// Handler 속성에 대한 get/set메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStrDt() {
		return strDt;
	}

	public void setStrDt(String strDt) {
		this.strDt = strDt;
	}

	public String getEndDt() {
		return endDt;
	}

	public void setEndDt(String endDt) {
		this.endDt = endDt;
	}

	// Hashcode 같은 객체 인식
	public int hashCode() {
		return Objects.hash(name, strDt, endDt);
	}

	// equals Method 재정의
	public boolean equals(Object obj) {
		String thisTmp = name +strDt +endDt;
		String tmp = ((Handler)obj).getName()+((Handler)obj).getStrDt()+((Handler)obj).getEndDt();
		
		System.out.println("equls 호출");
		if(obj!= null && obj instanceof Handler) {
			boolean b = thisTmp.equals(tmp);
			System.out.println("비교 : "+b);
			return b;
		}else {
			return false;
		}
	}

	
}
