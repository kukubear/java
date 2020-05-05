package day02;
//키보드로 데이터 입력하는 방법들
import java.io.BufferedReader;
import java.io.InputStreamReader;

//키보드로부터 데이터 입력방법 2
public class Ex01 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("첫 번째 숫자 입력: ");
		String x = br.readLine();
		float xx = Integer.parseInt(x);
		System.out.println("두 번째 숫자 입력: ");
		String y = br.readLine();
		float yy = Float.parseFloat(y);
		float zz = xx + yy;
		System.out.println(zz);
		
		
	}
}
