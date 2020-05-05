package day06;
import java.util.Scanner;

//문제2]"Hello"라는 문자열을HelloClass()라는 메소드를 이용하여 출력하세요.
/*Method OverLoading(메소드 오버로딩)
 * 의미: 같은 이름의 메소드명으로 서로 다른 기능을 구현하고자 할 때 사용함
 *조건>
 *1. 이름은 반드시 같아야함
 *2. 자료형의 갯수가 서로 다르거나 인자의 갯수가 서로 달라야 함
 *3. */
class HelloClass{
	 void Hello() {//전달인자 값이 없습니다.
		
		System.out.println("first Hello");
	}
	 void Hello(float x) {
		for(float i=1.0f; i<=5.0f;i++) {
		System.out.println("Hello");
		}
	}

	 void Hello(float x,int y) {//전달인자 2개
		float sum = 0.0f;
		sum= x+y;
		System.out.println("합계는 = "+sum);
	}
	 void Hello(int x) {
		 int i =1;
			for( i=1; i<=9;i++) {
			System.out.println("구구단 "+x+"단은 "+x+" * "+i+" = "+(x*i));
			}
		}
	 void Hello(int start,int end) {//전달인자 2개
		int i,j;
			for(i=start; i<=end; i++) {
				for(j=1; j<=9; j++) {
			System.out.println("2. 구구단 = "+i+" * "+j+" = "+(i*j));
				}
				System.out.println();
			}
		}
	//6.
		void HAP(int x) {
		int sum = 0;
		for(int i =1; i<=100; i++) {
			sum+=i;
		}
		 System.out.println("1~100합계 = "+sum);
	}

	//7. 
		int SUM(int x, int y) {
		int i,sum=0;
		for(i=x; i<=y; i++) {
			sum+=i;
		}
		return sum;
	}
	}

	

public class Ex04 {
	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); 
		 */
		HelloClass x = new HelloClass();
		x.Hello();//전달인자0
		x.Hello(5.0f);//1개
		x.Hello(5f, 2);//2개
		//문제 3단을 가인수로 넘겨서 Hello메소드로 3단출력해보기
		x.Hello(3);
		
		//시작단과 끝단을 가인수로 넘겨서 Hello메소드로 구구단을 출력해보세요.
		x.Hello(3,7);
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		int x1 = sc.nextInt();
		HelloClass hc = new HelloClass();
		hc.HAP(x1);
		
		//Sum()이라는 메소드를 이용하여 시작값(1)과 끝값(100)이 주어지면 합계를 구하여 출력하세요.
		
		int sum = hc.SUM(1,100);
		System.out.println(sum);
}
}
