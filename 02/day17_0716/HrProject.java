package day17_0716;

import java.util.Calendar;

public class HrProject extends Project {
	private String name;
	private String startDt;
	private String endDt;
	private String location;
	private Developer[] dev;

	HrProject(String name, String startDt, String endDt, String location) {
		super(name, startDt, endDt, location);

	}

	@Override
	public void design() {
		System.out.println("HR �����۾� ����");

	}

	@Override
	public void develop() {
		System.out.println("HR �����۾� ����");

	}

}
