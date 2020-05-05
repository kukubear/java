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
	private String kind;// ǰ��
	private ArrayList inoculate = new ArrayList();
	private HashSet Handler = new HashSet();
	private HashMap family = new HashMap();

	// ������
	Dog(String name, int age, String kind) {
		this.name = name;
		this.age = age;
		this.kind = kind;
	}

	// �Ӽ��� ���� get/set Method
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

	// ���������� �ϴ�
	// inoculate �Ӽ��� �̸��� ��¥�� �ش��ϴ� �������� ���� ����
	// ������ ��¥�� ���� ���������ϸ� �ȵ�
	// ǰ���� �������� ���� �Ⱓ �ƴϸ� �����߻� -> "���������Ⱓ�� �ƴմϴ�."
	// ���۵� 7���̻�, ������ 10�� �̻� / �����ݸ� 15�� �̻�
	public void shotInoculate(String name, Date date) throws Exception {
		Inoculate in = new Inoculate(name, date);

		if (inoculate.contains(in)) {
			throw new Exception("�ߺ��� ���������Դϴ�.");
		}

		Collections.sort(inoculate);
		
		Inoculate max = null;
		if(inoculate.size()>0) {
				max = (Inoculate) inoculate.get(inoculate.size() - 1);}

		long day = 0;
		if ("���۵�".equals(this.kind)) {
			day = diffOfDate(max.getDate().toString(), date.toString());
			if (day < 7) {
				throw new Exception("�������� ���ɱⰣ�� �ƴմϴ�.");
			}
		} else if ("������".equals(this.kind)) {
			day = diffOfDate(max.getDate().toString(), date.toString());
			if (day < 10) {
				throw new Exception("�������� ���ɱⰣ�� �ƴմϴ�.");
			}
		} else if ("�����ݸ�".equals(this.kind)) {
			day = diffOfDate(max.getDate().toString(), date.toString());
			if (day < 15) {
				throw new Exception("�������� ���ɱⰣ�� �ƴմϴ�.");
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

	// Handler�߰� (�Ķ���� ���� ������ ���� �߰��� �� ����)
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
	

	// ������ �߰� info�� type�� name���� �����Ǹ� /�� ���� -> ��)�ΰ�/����
	// type : �ΰ�/���/����/�ڸ� /name�̸�:
	// �̸� �ߺ� �Ұ� ǰ���� 3����
	

}
