package day04;
//문제 1부터 1씩 증가하여 최초로 합이 3000이 넘는 정수의 값은 얼마?
public class Ex02Q3 {
public static void main(String[] args) {
	int i = 1; int sum=0;
	for(i=1;true;i++) {
		
		sum +=i;
		if(sum>=3000) {
			System.out.println(i);
			System.out.println(sum);
			break;
		}
		
		
	}
}
}
