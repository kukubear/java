package day15_0712;

public class Mother {
	String name;
	int age;
	String job;
	private Child[] childs;

	Mother(String name, int age) {
		this.name = name;
		this.age = age;
	}

	Mother(String name, int age, String job, Child[] childs) {
		this.name = name;
		this.age = age;
		this.job = job;
		this.childs = childs;
	}

	void goToShool() {
		System.out.println("아이들과 학교가다");
	}

	void callChild() {

		for (int i = 0; i < childs.length; i++) {
			System.out.println(childs[i].name + "이 지금 갑니다.");
		}

	}

	public void setChilds(Child[] childs) {
		this.childs = childs;
	}

	public Child[] getChilds() {
		return childs;
	}

	public static void main(String[] args) {
		Mother m = new Mother("미선", 36);

		Child[] c = new Child[4];
		
		c[0] = new Child("아이1", 7);
		c[1] = new Child("아이2", 5);
		c[2] = new Child("아이3", 4);
		c[3] = new Child("아이4", 6);

		m.setChilds(c);
		
		m.goToShool();
		m.callChild();
		

	}

}
