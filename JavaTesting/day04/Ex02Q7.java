package day04;
//문제7] 다음과 같이 출력되도록 합니다.
//28  27  26
//25  24  23
//22  21  20
public class Ex02Q7 {
	public static void main(String[] args) {
		int num=30;
		
		for(int i=29; i<=20;i--) {
			for(int j=31;j<=22;j-=3) {
				System.out.print(29-i);
			}
			System.out.println();
		}
	}

}
