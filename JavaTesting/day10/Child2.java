package day10;

public class Child2 extends Parent2{
	
	public void discount(int price) {
		sum = price - 3500;
		if(3500>price) {
			System.out.println("�߸��� �ݾ��� �Է��ϼ̰ų� ������ ����Ͻ� �� ���� �ݾ��Դϴ�.");
		}
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		
	}

}
