package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02Q5 {
public static void main(String[] args) throws NumberFormatException, IOException {
	//���� ����� ���ϴ� ���� ����ϵ��� ���α׷����� �ϼ���.
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		    
			System.out.println("���ϴ� ���� �Է��ϼ���: ");
			int c = Integer.parseInt((br.readLine()));
			
			System.out.println("****"+c+"��****");
			for(int d=1;d<=9;d++) {
				System.out.println(c +" * "+d+" = "+(c*d));
				}
}
}
