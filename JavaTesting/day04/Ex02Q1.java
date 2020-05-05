package day04;
//1~100사이의 숫자 중 짝수의 합을 구하기
public class Ex02Q1 {
	public static void main(String[] args) {
		int a=1; int sum=0;
		for(a=1; a<=100; a++) {
			if(a%2 == 0)
				sum +=a;
			
		}
		a++;
	System.out.println(sum);
	//문제] 1~100사이의 5의 배수의 합을 구하고 카운트 하여 출력하시오.
}
}

