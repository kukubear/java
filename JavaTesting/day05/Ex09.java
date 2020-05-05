package day05;
//5!구하기 do~while문 이용
public class Ex09 {

	public static void main(String[] args) {
		int a=1, sum=1;
		do {
		    sum=sum*a;
		    System.out.println(sum);
			a++;
		}while(a<=5);

		
	}

}
