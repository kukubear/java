package day13_0710;
//�ǽ�3:����¢��

//Animal class�� �����Ѵ�.
//�����ڷ� AnimalType�� �Ķ���ͷ� �޴´�.
//bark() �޼��带 ���� ������ ¢�¼Ҹ��� ����Ѵ�:Dog�� �۸�, Cat�� �߿�
//���� Dog�� Cat�� Ŭ������ �����ϴµ� ���� �߰��� �� �ִ�.

interface AnimalType {
	public void bark();

}

class Cat implements AnimalType {

	public void bark() {
		System.out.println("�߿�");

	}

}

class Dog implements AnimalType {

	public void bark() {
		System.out.println("�۸�");

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
