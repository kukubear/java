package day05;
//dowhile
//7�� ����� �հ� ������ ���Ͽ� ����ϱ�
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
