package day14_0711;

//�������̽� Hobby <- - - - Tennis, Piano
//              <--------(����)Parent, Child
interface Hobby {
	public String setHobby();

}

class Tennis implements Hobby {

	@Override
	public String setHobby() {
		// TODO Auto-generated method stub
		return "��̴� �״Ͻ�";
	}

}

class Piano implements Hobby {

	@Override
	public String setHobby() {
		// TODO Auto-generated method stub
		return "��̴� �ǾƳ�";
	}

}

class Parent {
	public Hobby hobby;
	private int age;
	String name;
	public Parent(String name) {
		
	}
	
	public Parent(Hobby hobby) {
		setHobby(hobby);
	}

	public void setHobby(Hobby hobby) {
		this.hobby = hobby;
	}

	public void setAge(int age) {
		this.age = age;
		printAge(age);

	}
       
	public void printAge(int i) {
		System.out.println(i);
	}

}

public class Child extends Parent {

	

	
	public void SetName(String string) {
		this.string=name;
		printName(string);
	}

	public String printName(String name) {
		return name;
	}

	public static void main(String[] args) {

		Child c = new Child("ȫ�浿");
		Parent p = c;
		c.setAge(30);

		Tennis t = new Tennis();
		Hobby b = t;
		c.setHobby(t);

		Piano p2 = new Piano();
		Hobby b2 = p2;
		c.setHobby(p2);

		Child c2 = new Child("ȫ�浿");

		System.out.println(c);
		System.out.println(c.equals(c2));
	}
	
	

	
}
