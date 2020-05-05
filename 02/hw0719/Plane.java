package hw0719;

import java.util.HashSet;
import java.util.Iterator;

public class Plane {
	private String model;
	private String airline;
	private HashSet fixHis;

	Plane(String model, String airLine) {
		this.model = model;
		this.airline = airline;
	}

	// �����̷� �߰�
	// ���� �����̷� �߰� �Ұ�
	public void addFixHis(FixHis fh) throws Exception {

		fixHis.add(fh);

		if (fixHis.contains(fh)) {
			throw new Exception("�ߺ��� �����̷��Դϴ�.");
		}

	}

	// �����̷� ���
	// ���� - ���¥ - �����
	public void printFixHis() {
		Iterator it = fixHis.iterator();

		while (it.hasNext()) {
			System.out.println(fixHis);
		}

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public HashSet getFixHis() {
		return fixHis;
	}

	public void setFixHis(HashSet fixHis) {
		this.fixHis = fixHis;
	}

	// Plane�� get/set

}
