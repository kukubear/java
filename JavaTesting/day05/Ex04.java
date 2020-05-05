package day05;
//1~200사이의 7의 배수의 합과 개수를 구하여 출력합니다. while문 이용
public class Ex04 {

	public static void main(String[] args) {
		int a=7,sum=0, count=1
				;
		/*
		 * while(a<=200) { sum+=a; //7 count++; a+=7;
		 * 
		 * } System.out.println(count); System.out.println(sum);
		 */
		while(a<=196) {
			if(a%7==0) {
			sum+=a;
			count++;
			
			System.out.println("a = "+a+" count = "+count+" sum = "+sum);
			}
		}
		}
	}


