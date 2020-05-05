package day03;
//연산자 
public class Ex02 {
private static String userInput;

// operand
	public static void main(String[] args) {
		int x = 300, y = 500, sum = x+y;
		/*int : 정수형 데이터
		 *sum = 
		 *x : 연산의 대상(operand) 
		 *+ ->연산자(operator)
		 *y : 연산의 대상(operand)
		 * =연산자는 예외적으로 오른쪽에서 왼쪽으로 연산됨
		 * ^= exclusive or로 인식함*/
		System.out.println(sum);
		
		//char : -128~127
		
		double currentBalance = 10000.0;
		double val = Double.valueOf(userInput);
		if(Double.isNaN(val)) {
			System.out.println("Nan이 입력되어 처리할 수 없음");
			val = 10.0;
		}
		currentBalance += val;
		System.out.println(currentBalance);
	}
}
