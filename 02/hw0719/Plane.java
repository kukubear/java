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

	// 수리이력 추가
	// 같은 수리이력 추가 불가
	public void addFixHis(FixHis fh) throws Exception {

		fixHis.add(fh);

		if (fixHis.contains(fh)) {
			throw new Exception("중복된 수리이력입니다.");
		}

	}

	// 수리이력 출력
	// 공항 - 사고날짜 - 사고내용
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

	// Plane의 get/set

}
