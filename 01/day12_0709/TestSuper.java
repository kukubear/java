package day12_0709;
class Employee{
	
	  Employee(){ // 
	  System.out.println("���� �θ� costructor");
	  }
	  
	
	Employee(int a){ // 
		  System.out.println("���� �θ� costructor");
		  }
}

class Manager2 extends Employee{
	Manager2(){
		//super(1);
		super();
		System.out.println("���� �ڽ� costructor");
	}
}
public class TestSuper {
	public static void main(String[] args) {
		Manager2 m = new Manager2();
	}
}
