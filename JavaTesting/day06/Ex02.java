package day06;

import java.util.Scanner;

class CalAdder {

	public float Adder(float first, int second) {// parameter=매개변수,실인수

		float sum = 0.0f;
		sum = first + second;
		return sum;
	}

}

class CalDivide {

	public void Divide() {
		int first = 500, second = 200, sum = 0;
		sum = first / second;
		System.out.println("나눗셈의 결과 = " + sum);
	}

}

class CalMultiple {

	public int Multiple() {
		int first = 500, second = 200, sum = 0;
		sum = first * second;
		return sum;
	}
}

class CalRemain {
	public void Remain() {
		int first = 500, second = 200, sum = 0;
		sum = first % second;
		System.out.println("나머지 연산의 결과 = " + sum);
	}
}

class CalSubtract {
	public void Subtract(int first, int second) {

		int sum = 0;
		sum = first - second;
		System.out.println("뺄셈의 결과 = " + sum);
	}
}

public class Ex02 {
	/*덧셈과 전달인자가 두 개있고, 리턴값 있습니다. =>요구사항 파악 시 포함되어야 하는 사항
	 *뺄셈은 전달인자가 두 개있고, 리턴값 없습니다.
	 *곱셈은 전달인자는 없고 리턴값은 있습니다. 
	 *나눗셈은 전달인자와 리턴값 모두 없습니다. 
	 */
	public static void main(String[] args) {
		int a,b;
		
		System.out.println("임의의 두수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt(); 
		b = sc.nextInt();
		
		CalAdder add = new CalAdder();//-> 클래스단위로 넘겨받는다 전달인자(arguments)
		float result1 = add.Adder(a,b);//객체명.메소드명
		
		//메소드 Adder(x,y)라는 값을 전달할 때 add라는 객체(오브제트)는 CalAdder()라는 클래스에서 만들어진
		//객체이므로 CalAdder()라는 클래스 접근하여 Adder(x,y)라는 메소드명을 찾아서
		//값을 전달해줍니다.
		//메인메소드에서 찾고 없으면 필드 그마음엔 위의 클래스영역 없으면 패키지내의 클래스에서 같은 형태의 메소드를 찾음
		//
		
		System.out.println("덧셈의 결과 = "+result1);//가인수를 전달한다.
		
		CalSubtract sub = new CalSubtract();
		sub.Subtract(a,b);
		
		CalMultiple mul = new CalMultiple();
		int result2 = mul.Multiple();
		System.out.println("곱셈의 결과 = "+result2);
		
		CalDivide dvd = new CalDivide();
		dvd.Divide();
		
		CalRemain rm = new CalRemain();
		rm.Remain();
		
		sc.close();
		
		
	}
	
	


}



