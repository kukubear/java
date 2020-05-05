package day08;

import java.util.Random;

//과제5> boolean형 난수를 100개 생성하여 출력하세요.
public class D8hw5 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			Random rand = new Random();
			boolean x = rand.nextBoolean();
			System.out.println(x);
		}
	}
}
