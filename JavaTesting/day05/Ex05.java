package day05;

import java.util.Random;
import java.util.Scanner;

//2���� ������ �߻��Ͽ� ���� 50�� �Ǹ� ���α׷��� �����ϰ� �ƴϸ� ��� �����ϱ�
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		
		int num1, num2, count=0;
		 
		while(true) {
		num1 =(int) (Math.random()*50);
		num2 =(int) (Math.random()*50);
		count++;

		System.out.println("count = "+count+" num1 = "+num1+" num2 = "+num2);
		if((num1+num2) == 50) {
						break;
		}
		
	}
	}
}
