package day17_0716;

public class Project {

	// 속성
	private String name;
	private String startDt;
	private String endDt;
	private String location;
	private int period;
	private Developer[] dev;

	// 생성자
	Project(String name, String startDt, String endDt, String location) {
		this.name = name;
		this.startDt = startDt;
		this.endDt = endDt;
		this.location = location;
	}

	Project(String name, String startDt, String endDt, String location, Developer[] dev) {
		this(name, startDt, endDt, location);
		this.dev = dev;
	}

	// 모든 프로젝트는 다음의 4가지 과정을 거친다.
	public void process() {

		plan();
		design();
		develop();
	}

	// "Project 준비 출력"
	public void plan() {
		System.out.println("Project 준비");
	}

	// Project에 개발자 추가
	public void join(Developer[] d) {
		this.dev = d;
	}

	// "설계작업수행 출력
	public void design() {
		System.out.println("설계 작업수행");
	}

	// 개발작업수행 출력
	public void develop() {
		System.out.println("개발작업수행");
	}

	// project에 참여한 개발자의 총 월간 개월수
	public int getMMByDeveloper() {
		
		int sum =0;
		for(int i =0; i<dev.length; i++) {
			sum+=dev[i].getPeriod();
		}

		return sum;
	}

	public void printDeveloper(Object obj) {
		//else if를 쓰려면 if에 작은 범위먼저 
		if (obj instanceof HighDeveloper) {
			System.out.println(
					"고급개발자 " + ((HighDeveloper) obj).getName() + " /특기 : " + ((HighDeveloper) obj).getSpecialSkill());
		} else {
			System.out.println("일반개발자 " + ((Developer) obj).getName());
		}
	}

}
