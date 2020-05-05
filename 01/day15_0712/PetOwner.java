package day15_0712;

abstract class Animal {
	public abstract void makeNoise();

}

class Cat extends Animal {

	@Override
	public void makeNoise() {
		System.out.println("�߿��ϰ� �Ҹ�����.");

	}

}

class Dog extends Animal {

	@Override
	public void makeNoise() {
		System.out.println("�۸��ϰ� �Ҹ�����.");

	}

}

class Vet {
	public void giveShot(Animal a) {
		a.makeNoise();
	}
}

public class PetOwner {
	public void statr() {
		Vet v = new Vet();
		Dog d = new Dog();
		Cat c = new Cat();
		v.giveShot(d);
		v.giveShot(c);
	}
}
