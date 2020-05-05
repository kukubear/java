package day05;
//do~while문
//무조건 실행하고, 조건을 나중에 체크하여 거짓이면 종료.
public class Ex06 {

	public static void main(String[] args) {
		// I like java programming~~!! 문자열 5번 실행하기
		int count=0;
		do {
		System.out.println("I like java programming~~!!");
			count++;
		}while(count<5);
	}

}
