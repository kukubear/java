package day05;

import java.util.Random;
import java.util.Scanner;

//2개의 난수를 발생하여 합이 50이 되면 프로그램을 중지하고 아니면 계속 실행하기
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
