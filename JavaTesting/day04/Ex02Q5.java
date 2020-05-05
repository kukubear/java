package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02Q5 {
public static void main(String[] args) throws NumberFormatException, IOException {
	//문제 출력을 원하는 단을 출력하도록 프로그래밍을 하세요.
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		    
			System.out.println("원하는 단을 입력하세요: ");
			int c = Integer.parseInt((br.readLine()));
			
			System.out.println("****"+c+"단****");
			for(int d=1;d<=9;d++) {
				System.out.println(c +" * "+d+" = "+(c*d));
				}
}
}
