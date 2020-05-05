package day03;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class printTest {
	public static void main(String[] args) throws IOException {
	int su = 12345;
	
	System.out.printf("\n %8d \n",su);
	System.out.printf("\n %-8d \n",su);
	System.out.printf("\n %08d \n",su);
	
	//한글자 입력연습
	Scanner sc = new Scanner(System.in);
	
	int ken = 0;
	System.out.println("키보드로부터 문자입력 요망: ");
	 char art = (char)System.in.read();
	 System.in.read();
	 System.in.read();
	 System.out.println("입력한 문자: "+art);
	 
	 System.out.println("키보드로부터 입력요망: ");
	 ken = System.in.read();
	 System.out.println("입력한 문자의 10진수는: "+ken);
	 //0~9사이의 숫자 3개를 이용하여 합계를 구하는 프로그램을 작성하세요.
	 int x,y,z,sum;
	 System.out.println("X의 값을 한자리로 입력해주세요.");
	 x = System.in.read() - 48;
	 System.in.read();
	 System.in.read();
	 
	 System.out.println("Y의 값을 한자리로 입력해주세요.");
	 y = System.in.read() - '0';
	 System.in.read();
	 System.in.read();
	 
	 System.out.println("z의 값을 한자리로 입력해주세요.");
	 z = System.in.read() - 48;
	 System.in.read();
	 System.in.read();
	 
	 sum = x+y+z;
	 System.out.println("합계는"+sum);
}
}
