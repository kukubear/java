package day10;

import java.util.Scanner;

public class TotalOdd {

	public void totalOdd() {
		int a = 0;
		
		for(int i = 1; i<=100; i++) {
			if(i%2==1) {
				a +=i;
			}
			System.out.println("1~100까지의 홀수의 합 = "+a);
		}
		
		
	}

}
