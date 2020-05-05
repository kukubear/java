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
		System.out.println("�б�����");
	}

	void fight(Child c) {
		System.out.println(c.name + "�� �ο����ϴ�.");
	}

	public static void main(String[] args) {
		Child ch = new Child("��浿", 7);
		Child ch1 = new Child("�Ѹ�", 7);
		
		ch.goToSchool();
		ch.fight(ch1);
		
	}
}
