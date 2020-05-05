package day05;
/*문제] 두 수를 입력받아서 덧셈, 뺄셈, 곱셈, 나눗셈(몫), 나머지
 구현하는 프로그램 
 *1. 요구사항 파악 : 덧셈, 뺄셈, 곱셈, 나눗셈(몫), 나머지
 *2. 요구사항 분석 : 생략
 *3. 요구사항 설계 : 데이터타입(데이터형), 변수명(first, second)
 * 메소드명 : 덧셈(Adder), 뺄샘(Subtract), 곱셈(Multiple), 나누기(Divide), 나머지(Remain)
 * 클래스명 : CalAdder, CalSubstract, CalMultiple, CalDivide, CalRemain, main: CalTotal
 * 객체(object) : add, sub, mul, dvd, rm,total
 */
public class Cal {

	private static void main(String[] args) {
		CalAdder add = new CalAdder();
		add.Adder();//객체명.메소드명
		
		CalSubtract sub = new CalSubtract();
		sub.Subtract();
		
		CalMultiple mul = new CalMultiple();
		mul.Multiple();
		
		CalDivide dvd = new CalDivide();
		dvd.Divide();
		
		CalRemain rm = new CalRemain();
		rm.Remain();
	}

}
