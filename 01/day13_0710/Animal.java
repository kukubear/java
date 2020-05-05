package day13_0710;
//실습3:동물짖기

//Animal class를 설계한다.
//생성자로 AnimalType을 파라미터로 받는다.
//bark() 메서드를 통해 동물의 짖는소리를 출력한다:Dog는 멍멍, Cat은 야옹
//현재 Dog와 Cat의 클래스만 존재하는데 향후 추가될 수 있다.

interface AnimalType {
	public void bark();

}

class Cat implements AnimalType {

	public void bark() {
		System.out.println("야옹");

	}

}

class Dog implements AnimalType {

	public void bark() {
		System.out.println("멍멍");

	}

}

public class Animal {

	public void bark() {

	}

	public static void main(String[] args) {

		Cat cat1 = new Cat();
		Dog dog2 = new Dog();

		cat1.bark();
		dog2.bark();
	}
}
