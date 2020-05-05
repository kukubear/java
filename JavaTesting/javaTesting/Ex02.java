package javaTesting;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;
public class Ex02 {
	public static void main(String[] args) {
		//문제 ] str="홍길동", str2 = "홍길동", str3 ="홍마차" 존재
		String str = "홍길동";
		String str2 = "홍길동";
		String str3 = "홍마차";
		
		System.out.println(str.equals(str2));
		System.out.println(str2.equals(str3));
		
		str = str3;
		System.out.println(str.equals(str3));
		System.out.println(str == str3);
		
		//Date class
		Date currentDate = new Date();
		System.out.println("현재 날짜는 = "+ currentDate +"입니다.");//미국식으로 출력
		
		//보통 컴퓨터는 1970년 1월 1일이 기본 설정되어 있습니다.
		System.out.println("년도: "+currentDate.getYear());
		System.out.println("월: "+currentDate.getMonth());
		System.out.println("일: "+ currentDate.getDay());
		System.out.println("날짜: "+currentDate.getDate());
		
		System.out.println(currentDate.toLocaleString());
		//2.Calendar class
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR)+ "년");
		System.out.println(cal.get(Calendar.MONTH)+1+ "월");
		System.out.println(cal.get(Calendar.DATE)+"일");
		System.out.println(cal.get(Calendar.HOUR)+"시");
		System.out.println(cal.get(Calendar.MINUTE)+"분");
		System.out.println(cal.get(Calendar.SECOND)+"초");
		
		//3. Unicode:
		//http://www.unicode.org/charts-여기서 참고하여 한글을 사용
		String str5 = "\uAc00";
		System.out.println(str5);
		String str6 = "\uB098";
		System.out.println(str6);
		
		//4. StringTokenizer class : 문자열 구분 ->밑에 부분 통으로 암기하면 편함
		//문자열을 구분자를 이용하여 구분
		StringTokenizer st = new StringTokenizer("개구리, 소년, 왕눈이, 아로미, 투투", ",");
		System.out.println("문자열의 갯수는 = "+st.countTokens()+"개");
		
		while(st.hasMoreTokens()) {//추출할 단어가 존재하면 이라는 뜻
			String data = st.nextToken();
			System.out.println(data);
		}
		//문제 
}
}
