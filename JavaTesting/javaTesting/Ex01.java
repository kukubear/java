package javaTesting;
//문제 3
public class Ex01 {
	public static void main(String[] args) {
		//Q.3 키가 172.56cm 키가 몇피트 몇인치?
		//1inch = 2.54cm, 1feet=3048cm=12inch
		double cm, inch, feet, feetsum, inchsum;
		
		cm=172.56;
		inch=2.54;
		feet=inch*12;
		
		feet = inch*12;
		feetsum = cm / feet;
		
		inchsum=(cm%feet)/inch;
		System.out.println(feetsum+"피트, " + inchsum + "인치 입니다.");
		System.out.printf("cm는 %3.2f 피트이고, %3.2f인치 입니다.\n", feetsum, inchsum);
		
		
		//문자 데이터 : char(문자), String(문자열)
		
		char name = 'h';
		char x = 'y';
		
		String sign = "yes"; // call by reference(참조형)
		
		System.out.println(name+", "+sign);
		System.out.printf("name = %c, sign = %s\n", name, sign);
		
		//한글 변수 사용 가능 
		String 이름1 ="홍길동";
		String 이름2 = "임걱정";
		String 이름3 = 이름1 + 이름2;
		//+는 연결자기능과 덧셈기능 2가지를 가지고 있음
		//-도 부호변환 및 뺄셈기능 2가지 기능
		System.out.println(이름3);
		
		//문자와 숫자의 연산
		String value = "홍길동";
		String value2 = value + 300;
		System.out.println(value2);
		
		//대문자와 소문자로 변환
		String str = "Java progamming";
		String ss = str.toUpperCase();//대문자로 변환 시켜라
		System.out.println(ss);
		
		String sss = ss.toLowerCase();
		System.out.println(sss);
		
		//문제"It is not the time but the will that is wanting"이라는 문자열이 존재
		//내용 중에서 w라는 문자의 위치를 찾아서 출력하고, 문자열의 전체길이가 얼마인지 확인
		//charAt(숫자); -> 문장 중 인수번째 문자 추출하는 역할
		
		//index : 012345678.....
		String msg = "It is not the time but the will that is wanting";//참조변수
		int len = msg.length();
		System.out.println(len);
		
		for(int idx = 0; idx < len; idx+=1) {
			//+= 복합대입연산자
			// idx+=1 -> idx = idx+1
			char ch = msg.charAt(idx);
			
			if(ch == 't') {
				System.out.println("찾는 인덱스 위치는= "+idx);
			}
			
		}
		
		//index0f(문자):문자의 위치 찾기
		String msg2 = "J a v a Program is Create Many Objects";
		int len2 = msg.length();
		
		int idx1 = msg2.indexOf('a');
		int idx2 = msg2.indexOf('a',12);//12번째 이후의 a의 위치를 찾아라
		System.out.println(idx1);
		System.out.println(idx2);
		
		//substring : 부분문자열 출력 ->charAt은 문자하나지만 substring(숫자,숫자)은 문자열 
		
		String str2 = msg2.substring(8,20);//결과 -> program is C 
		System.out.println(str2);
		
		
		String str3 = msg2.substring(12);//결과 ->12번째 이후부터만 출력
		System.out.println(str3);
		
		//String 클래스:reference type, 무한대 저장 가능, 
		
		String str4 = new String("홍길동");
		/*String 클래스
		 *str4 : 객체(오브젝트)
		 *= : 대입연산자
		 *new : 메모리 할당 연산자
		 *String : 클래스
		 *("홍길동"):매개변수데이터 값
		 *; : 문장의 끝*/
		
		
		//equals() = 비교하고자 하는 대상의 내용 자체를 비교 
		//내용이 동일하면 같은 주소번지를 부여
		String str5 = "홍길동";
		//위에 2가지 결과가 같음 
		String str6 = "김길동"
				+ "";
		System.out.println(str4.equals(str5));
		System.out.println(str5.equals(str6));
		System.out.println(str5==str4);
		
		//Date class
		
		
		
		
	}
}
