package day14_0711;

public class Father {
	String name;
	int age;
	String job;
	//�׻� �Ӽ��� �ʱ�ȭ ���ִ� �����ڰ� �־�� �� ++(�����ϸ� ����) ��������
	
	void goToWork(int time) {
		System.out.printf("%d�ÿ� ����ϴ�",time);
		
	}
	void goOffWork(int time) {
		System.out.printf("%d�ÿ� ����ϴ�",time);
	}
	
	public static void main(String[] args) {
		Father ft = new Father();
		ft.goToWork(8);
		System.out.println();
		ft.goOffWork(6);
	}
}
