package day05;
//1~200������ 7�� ����� �հ� ������ ���Ͽ� ����մϴ�. while�� �̿�
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


