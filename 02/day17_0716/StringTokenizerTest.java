package day17_0716;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("This \t is a \n String");
		while(st.hasMoreTokens()) System.out.println(st.nextToken());
		System.out.println("==========================================");
		
		//인자로 주어진 문자열을 ':' 구분한다
		String str = "80::95:70";
		StringTokenizer st2 = new StringTokenizer(str,":",false);
		
		int i =0;
		while(st2.hasMoreTokens()) {
			System.out.println(i+":"+st2.nextToken());
			i++;
		}
		System.out.println("==========================================");
		
		//StringTokenizer는 구분자끼리 붙어있는 경우 위와 같이 구분하지 못하는 문제가 있다.
		String [] result = str.split(":");
		
		for(int x =0; x< result.length; x++) {
			System.out.println(x+":"+result[x]);
		}
		System.out.println("==========================================");
		//하지만 split도 마지막에 구분자가 있을땐 이를 처리핮 ㅣ못함 -> 2개의 인자를 받는 split을 사용
		String str2 = "80.95.70.";
		String[]result2 = str2.split(".", 5);
		
		for(int x =0; x< result2.length;x++) {
			System.out.println(x+":"+result2[x]);
		}
		
	}
}
