package day12_0709;
class Employee{
	
	  Employee(){ // 
	  System.out.println("나는 부모 costructor");
	  }
	  
	
	Employee(int a){ // 
		  System.out.println("나는 부모 costructor");
		  }
}

class Manager2 extends Employee{
	Manager2(){
		//super(1);
		super();
		System.out.println("나는 자식 costructor");
	}
}
public class TestSuper {
	public static void main(String[] args) {
		Manager2 m = new Manager2();
	}
}
