package day08;

import java.util.Random;

//����5> boolean�� ������ 100�� �����Ͽ� ����ϼ���.
public class D8hw5 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			Random rand = new Random();
			boolean x = rand.nextBoolean();
			System.out.println(x);
		}
	}
}
