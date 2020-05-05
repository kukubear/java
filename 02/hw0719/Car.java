package hw0719;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class Car {

	private String model;
	private int efficiency;// ����??CC
	private int distance;// �޸��Ÿ�
	private String nowOwner;
	private ArrayList carInfo;

	// �Ѱ��� Ű�� ������ ��
	private HashMap fixHis = new HashMap<>();// �����̷�
	private ArrayList information = new ArrayList();
	private HashSet accidentHis = new HashSet();// ����̷�

	// ������
	Car(String model, int efficiency, int distance, String nowOwner) {
		this.model = model;
		this.efficiency = efficiency;
		this.distance = distance;
		this.nowOwner = nowOwner;
	}

	// car�� ���� ����
	public void checkMatchInfo() {

	}

	// ����̷��߰�
	// ->ArrayList �̿� + InfoŬ������ ��ü�� ������ �� ��ü�� ������ ����
	public void addAccidentHis(AccidentInfo info1) throws Exception {

		AccidentInfo info = new AccidentInfo(info1.getLocation(), info1.getDate());
		ArrayList information = new ArrayList(info);
		information.add(info);
		HashSet accidnetHis = new HashSet(info);
		
	

	}

	// �߸��� ��¥ �ð� �߰��� ����ó���ϱ�

	// ����̷� ���
	public void printAccidentHis() {

		ListIterator list = information.listIterator();

		while (list.hasNext()) {
			System.out.println(list);
		}

	}

	// ���� �̷� �߰�
	public void addFixHis() {
		Map<Car, ArrayList<FixInfo>> fixHis = new HashMap<>();

	}

	// Car�� get/set
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(int efficiency) {
		this.efficiency = efficiency;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public HashMap getFixHis() {
		return fixHis;
	}

	public void setFixHis(HashMap fixHis) {
		this.fixHis = fixHis;
	}

	public String getNowOwner() {
		return nowOwner;
	}

	public void setNowOwner(String nowOwner) {
		this.nowOwner = nowOwner;
	}

	public HashSet getAccidentHis() {
		return accidentHis;
	}

	public void setAccidentHis(HashSet accidentHis) {
		this.accidentHis = accidentHis;
	}

	public ArrayList getCarInfo() {
		return carInfo;
	}

	public void setCarInfo(ArrayList carInfo) {
		this.carInfo = carInfo;
	}

	public ArrayList getInformation() {
		return information;
	}

	public void setInformation(ArrayList information) {
		this.information = information;
	}
}
