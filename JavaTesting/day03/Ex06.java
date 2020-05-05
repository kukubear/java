package day03;

import java.util.Random;

//난수발생 클래스 : Random90, Math()
//1~6사이의 난수를 발생하여 출력해보세요
public class Ex06 {
	public static void main(String[] args) {
		//복권, 게임에 많이 이용
	
	int num = (int)(Math.random()*6+1);
	System.out.println(num);
	
	if(num == 1)
		System.out.println("유명 브랜드 향수 당첨");
	if(num == 2)
		System.out.println("백화점 상품권 50만원 당첨");
	if(num == 3)
		System.out.println("놀이동산 자유이용권 2매 당첨");
	if(num == 4)
		System.out.println("현금 20만원 당첨");
	if(num == 5)
		System.out.println("자전거(30만원 상당) 당첨");
	if(num == 6)
		System.out.println("나이키 한정판 운동화 당첨");
	
	Random rand = new Random();
	int su = rand.nextInt();
	System.out.println(su);
}
}
