package day03;

import java.util.Random;

//�����߻� Ŭ���� : Random90, Math()
//1~6������ ������ �߻��Ͽ� ����غ�����
public class Ex06 {
	public static void main(String[] args) {
		//����, ���ӿ� ���� �̿�
	
	int num = (int)(Math.random()*6+1);
	System.out.println(num);
	
	if(num == 1)
		System.out.println("���� �귣�� ��� ��÷");
	if(num == 2)
		System.out.println("��ȭ�� ��ǰ�� 50���� ��÷");
	if(num == 3)
		System.out.println("���̵��� �����̿�� 2�� ��÷");
	if(num == 4)
		System.out.println("���� 20���� ��÷");
	if(num == 5)
		System.out.println("������(30���� ���) ��÷");
	if(num == 6)
		System.out.println("����Ű ������ �ȭ ��÷");
	
	Random rand = new Random();
	int su = rand.nextInt();
	System.out.println(su);
}
}
