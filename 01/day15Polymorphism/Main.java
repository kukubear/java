package day15Polymorphism;
abstract class Calculator{
	int left, right;
	public void setOperands(int left, int right) {
		this.left = left;
		this.right= right;
	}
	int sum() {
		return this.left+this.right;
	}
	public abstract void sum2();
	public abstract void avg();
	public void run() {
		sum();
		avg();
	}
}

class CalculatorDecoPlus extends Calculator{
	public void sum2() {
		System.out.println("+ sum : "+sum());
	}
	
	public void avg() {
		System.out.println("+ avg : "+(this));
	}
}
public class Main {

}
