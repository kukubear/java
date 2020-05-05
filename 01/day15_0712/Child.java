package day15_0712;

public class Child  {
	public String name;
	public int age;
	public String hobby;

	Child(String name, int age) {
		this.name=name;
		this.age=age;
	}

	Child(String name, int age, String hobby) {
		this(name,age);
		this.hobby = hobby;
	}

	
	void goToSchool() {
		System.out.println("학교가다");
	}

	void fight(Child c) {
		System.out.println(c.name + "과 싸웠습니다.");
	}

	public static void main(String[] args) {
		Child ch = new Child("고길동", 7);
		Child ch1 = new Child("둘리", 7);
		
		ch.goToSchool();
		ch.fight(ch1);
		
	}
}
