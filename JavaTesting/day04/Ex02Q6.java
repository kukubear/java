package day04;
//구구단중에서 홀수단을 출력하되, 단의 수만큼 출력되도록 한다.
public class Ex02Q6 {
	public static void main(String[] args) {
		
		
	for(int a=1; a<=19; a+=2) {
		if(a%1==1) continue;
		for(int b=1; b<=19;b++) {
			System.out.println(a+" * "+b+" = "+(a*b));
		}
		
	}
}
}
