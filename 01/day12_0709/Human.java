package day12_0709;

public class Human {
	public void pro() {
	    System.out.println("pro");
	}
	/*
	 * class Students extends Human{ public void info() {
	 * System.out.println("info"); } }
	 */
	
	class Student{
		public void info() {
			System.out.println("info");
		}
	}
	public class FinalTest{
		public static void main(String[] args) {
			Student s = new Student();
			s.info();
		}
	}
}
