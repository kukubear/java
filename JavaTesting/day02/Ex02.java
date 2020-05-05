package day02;
//형변환
//묵시적, 강제적 2가지 있음
//묵시적 형변환(자동형변환) -> 문자+숫자 = 문자, 정수형+실수형 = 실수형, float+double = double
//강제적 형변환 ->원하는 형태로 임의적 변경 
public class Ex02 {
	public static void main(String[] args) {
	//묵시적 형변환
		float f = 3.14159267f;
		System.out.println(f);
		
		int i = 3000;
		System.out.println(i);
		
		float sum = f+i;
		System.out.println(sum);
		
	//강제적형변환 ->상황에 맞게형변환 필요
	//출력할 때 바로 형변환하거나 혹은 값자체를 형변환하여 계산 후 출력하는 방법 2가지
		System.out.println((int)f);
		System.out.println((float)i);
		System.out.println((int)sum);
}
}
