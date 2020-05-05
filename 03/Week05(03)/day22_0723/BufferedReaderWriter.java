package day22_0723;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Date;

public class BufferedReaderWriter {
public static void main(String[] args) {
	FileReader fr =null;
	FileWriter fw = null;
	BufferedReader br = null;
	BufferedWriter bw = null;
	
	Date d =null;
	try {
		//ReadFile.txt파일을 읽는 FileReader 객체 생성
		//BufferedReader 객체 생성
		fr = new FileReader("C:/Temp/Calc.java");
		br = new BufferedReader(fr);
		
		//FileWriter로 파일"CopyFile.txt"에 출력한다. 기존 파일에 덮어쓴다.
		//BufferedWriter 객체생성
		fw = new FileWriter("C:/Temp/CopyFile.txt", false);
		bw = new BufferedWriter (fw);
		
		
		String s = null;
		d= new Date();
		
		//파일 복사 시작 시간
		long start = d.getTime();
		
		//ReadFile.txt 에서 한줄씩 읽어서 BufferedReader에 저장한다. 
		while((s=br.readLine())!=null) {
			//읽은 데이터(한줄)을 BufferedWriter에 쓴다.
			//
		}
	}
}
}
