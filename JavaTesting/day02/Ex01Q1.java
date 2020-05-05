package day02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//BufferedReader클래스는 활용 많이함
//문제2] first=250, second= 450, third =550.0f 합계르 구하여 출력해봅시다.
public class Ex01Q1 {
	public static void main(String[] args)throws Exception {
	/*7.BufferedReader = 클래스:버퍼에 들어오는 데이터를 모음(4~8byte)
	 *6.bufRd : 객체(object)
	 *5.= : 대입연산자
	 *4.new : 메모리 할당 연산자
	 *3. BufferedReader 클래스: 객체의 생성, 성능의 향상-> bufRd라는 새로운 BufferedReader를 생성해라
	 *2. (new InputStreamReader : 1byte씩 입력받아라
	 *1. (System.in)) : 키보드로부터 데이터를 입력합니다.
	 *;
	 ****bufRd.readLine(): 
	 ***new 뒤에 오는것은 클래스(공식임)
	 *parse
	 *객체명.메소드명 or클래스명.클래스메소드명 공식
	 */
		//메모리 적게쓰거나 시간을 적게쓰는것 ->잘짠 프로그램
		
	//String z = bufRd.readLine(); float third = Float.parseFloat(z);
	//float z = Integer.parseInt(br.readLine()); ->이렇게 한줄로 쓸 수 있음
		
	BufferedReader bufRd = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("첫번째 숫자 입력: ");
	String x = bufRd.readLine();
	int first = Integer.parseInt(x);
	
	System.out.println("두번째 숫자 입력: ");
	String y = bufRd.readLine();
	int second = Integer.parseInt(y);
	
	System.out.println("세번째 숫자 입력: ");
	String z = bufRd.readLine();
	float third = Float.parseFloat(z);
	
	float xyz = first + second +third;
	System.out.println("합계는 : "+ xyz);
	
}
}
