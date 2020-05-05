package day15_0712;
class Calculator {
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
		public void sum(){
			System.out.println(this.left+this.right);
		}
		
		public void avg() {
			System.out.println((this.left+this.right)/2);
		}
		
}

class SubstractionableCaculator extends Calculator{
	public void substract() {
		System.out.println(this.left - this.right);
	}
}
public class Main {
public static void main(String[] args) {
	SubstractionableCaculator c1 = new SubstractionableCaculator();
	c1.setOprands(10, 20);
	c1.sum();
	c1.avg();
	c1.substract();
}
}
