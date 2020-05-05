package day05;
//dowhile
//7의 배수의 합과 갯수를 구하여 출력하기
public class Ex07 {

	public static void main(String[] args) {
		int a=0, sum = 0, count=0;
		do{
			a+=7;
			sum+=a;
			count++;
			System.out.println("count = "+count+" sum = "+sum);
		}while(a<=100);
	}

}
