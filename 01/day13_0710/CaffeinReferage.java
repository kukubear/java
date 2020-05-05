package day13_0710;
abstract class CaffeineReferage{
	final void prepareRecipe() {
		//카페인 음료는 이런과정으로 만들어진다 
		//못바꾸도록 제조과정을 정의 
		
		this.boilWater();
		this.brew();
		this.pourInCup();
		this.addcndiments();
	}
	abstract void brew();
	abstract void addcndiments();
	void boilWater() {
		System.out.println("물 끓이는 중");
	}
	void pourInCup() {
		System.out.println("컵에 따르는 중");
	}
}

class Tee extends CaffeineReferage{
	void brew() {
		System.out.println("차를 우려내는 중");
	
	}
	void addcndiments() {
		System.out.println("레몬을 추가하는 중");
	}
}
public class CaffeinReferage {
	 void brew() {
		 System.out.println("필터를 통해 커피를 우려내는 중");
	 }
	 //추상메서드 재정의 안하면 컴파일 안됨
	 void addcndiments() {
		 System.out.println("설탕과 우유를 추가하는 중");
	 }
	 //제조과정을 바꿀 수 없음 부모에서 final로 fix해놔서
}
