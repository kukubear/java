package hw0718;

import java.util.HashSet;
import java.util.Objects;

public class Handler {

	private String name;
	private String strDt;
	private String endDt;
	HashSet<String> HandlerInfo = new HashSet<>();

	// ������
	Handler(String name, String strDt, String endDt) {
		this.name = name;
		this.strDt = strDt;
		this.endDt = endDt;
	}

	// Handler �Ӽ��� ���� get/set�޼ҵ�
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

	// Hashcode ���� ��ü �ν�
	public int hashCode() {
		return Objects.hash(name, strDt, endDt);
	}

	// equals Method ������
	public boolean equals(Object obj) {
		String thisTmp = name +strDt +endDt;
		String tmp = ((Handler)obj).getName()+((Handler)obj).getStrDt()+((Handler)obj).getEndDt();
		
		System.out.println("equls ȣ��");
		if(obj!= null && obj instanceof Handler) {
			boolean b = thisTmp.equals(tmp);
			System.out.println("�� : "+b);
			return b;
		}else {
			return false;
		}
	}

	
}
