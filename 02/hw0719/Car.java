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
	private int efficiency;// 연비??CC
	private int distance;// 달린거리
	private String nowOwner;
	private ArrayList carInfo;

	// 한개의 키에 여러개 값
	private HashMap fixHis = new HashMap<>();// 수리이력
	private ArrayList information = new ArrayList();
	private HashSet accidentHis = new HashSet();// 사고이력

	// 생성자
	Car(String model, int efficiency, int distance, String nowOwner) {
		this.model = model;
		this.efficiency = efficiency;
		this.distance = distance;
		this.nowOwner = nowOwner;
	}

	// car에 대한 정보
	public void checkMatchInfo() {

	}

	// 사고이력추가
	// ->ArrayList 이용 + Info클래스의 객체를 생성한 후 객체의 데이터 저장
	public void addAccidentHis(AccidentInfo info1) throws Exception {

		AccidentInfo info = new AccidentInfo(info1.getLocation(), info1.getDate());
		ArrayList information = new ArrayList(info);
		information.add(info);
		HashSet accidnetHis = new HashSet(info);
		
	

	}

	// 잘못된 날짜 시간 추가시 예외처리하기

	// 사고이력 출력
	public void printAccidentHis() {

		ListIterator list = information.listIterator();

		while (list.hasNext()) {
			System.out.println(list);
		}

	}

	// 수리 이력 추가
	public void addFixHis() {
		Map<Car, ArrayList<FixInfo>> fixHis = new HashMap<>();

	}

	// Car의 get/set
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
