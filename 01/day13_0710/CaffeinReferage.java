package day13_0710;
abstract class CaffeineReferage{
	final void prepareRecipe() {
		//ī���� ����� �̷��������� ��������� 
		//���ٲٵ��� ���������� ���� 
		
		this.boilWater();
		this.brew();
		this.pourInCup();
		this.addcndiments();
	}
	abstract void brew();
	abstract void addcndiments();
	void boilWater() {
		System.out.println("�� ���̴� ��");
	}
	void pourInCup() {
		System.out.println("�ſ� ������ ��");
	}
}

class Tee extends CaffeineReferage{
	void brew() {
		System.out.println("���� ������� ��");
	
	}
	void addcndiments() {
		System.out.println("������ �߰��ϴ� ��");
	}
}
public class CaffeinReferage {
	 void brew() {
		 System.out.println("���͸� ���� Ŀ�Ǹ� ������� ��");
	 }
	 //�߻�޼��� ������ ���ϸ� ������ �ȵ�
	 void addcndiments() {
		 System.out.println("������ ������ �߰��ϴ� ��");
	 }
	 //���������� �ٲ� �� ���� �θ𿡼� final�� fix�س���
}
