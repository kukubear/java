package javaTesting;

import java.util.StringTokenizer;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("개구리=소년; 왕눈이=아로미; 투투=가재","=;");
		System.out.println("문자열의 개수는 = "+st.countTokens()+"개");
		
		while(st.hasMoreTokens()) {
			String data = st.nextToken();
			System.out.println(data);
			//system : class
			// out: object 콘솔프로그램?
			
		}
	}
 
}
