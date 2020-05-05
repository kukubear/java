package day13_0710;

import java.util.Scanner;

//입력 :1~10
//출력 : [2,3,4,5,6,7,1]

//int []irr ={1,2,3,4,5,6,7};
//ArrayMove am = new ArrayMove();
//실습2: 배열원소 이동
//-입력: 1~10
//-출력:[2,3,4,5,6,7,1]

//class -> 실체화 대상을 실체화하기 위한 것
public class ArrayMove {
	int[] irr = { 1, 2, 3, 4, 5, 6, 7 };

	public ArrayMove() {

	}

	public void move(int n) {
		//로직 수정필요

		

	}

	public void print() {

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayMove am = new ArrayMove();
		System.out.println("숫자를 입력하세요.");
		am.move(scan.nextInt());
	}
}
