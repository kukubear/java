package day09;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//배열에서 원하는 데이터 찾기
		int test[] = new int [10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("10개의 정수형 데이터를 입력해주세요.");
		for(int i=0; i<test.length; i++) {
			test[i] = sc.nextInt();
			
		}
		System.out.println();
		System.out.println("찾을 데이터를 입력하세요.");
		
		int su = sc.nextInt();
		
		for(int i=0; i<test.length; i++) {
			if(test[i]==su)
				break;
			
			if(i!=test.length)
				System.out.println("숫자가 위치한 곳의 배열의 첨자는 = "+i);
			else
				System.out.println("숫자를 찾지 못했습니다.");
		}
	}

}
