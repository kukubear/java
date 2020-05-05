package day04;
//과제1]구구단을 출력하되, 단이 곱하는 수보다 커지면 중지합니다. 9단까지
		//1
		//2 4
		//3 6 9
public class D4hw1 {
	public static void main(String[] args) {

		for(int a=1;a<=9;a++) {
			
			for(int b=1; b<=a; b++) {
				System.out.print(" "+(a*b));
					
				}
			System.out.println(" ");
		}
}
}
