package day04;

public class Ex02Q4 {
public static void main(String[] args) {
	//문제] 구구단을 출력합니다.2~19단
			//1.다중 for문
			for(int i = 1; i<=19; i++) {
				
				for(int j = 1; j<=9; j++) {
					System.out.println(i+" * "+j+" = "+(i*j));
				}
			}
}
}
