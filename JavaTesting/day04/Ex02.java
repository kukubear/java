package day04;
//반복문 : 조건문이 처리하고자 하는 내용을 반복
//종류 : for, while, do~while
//for문의 형식
//for(초기값; 조건식; 증감식){
//}

//while(조건식){
//}

//do~while은 적어도 한번은 실행합니다 라는 뜻
//do{
//......;
//while(조건식);
public class Ex02 {
	public static void main(String[] args) {
		//1~100사이의 합계를 구하세요.
		int sum=0;
		for(int x =1; x<=100; x++) {
			sum+=x;
				
		}
		System.out.println(sum);
		
	}
}
