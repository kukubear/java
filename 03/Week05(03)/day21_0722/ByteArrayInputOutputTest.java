package day21_0722;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayInputOutputTest {
	public static void main(String[] args) throws IOException {
		int ch;
		byte arr[] = {(byte)'J',(byte)'a',(byte)'v',(byte)'a',(byte)'!'};
		
		ByteArrayInputStream in = new ByteArrayInputStream(arr);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		FileOutputStream outFile = new FileOutputStream("fileStreamTest.txt");
		
		while((ch = in.read())!=-1) {
			out.write(ch);
			
			//InputStrea.available() : 읽어올수 있는 데이터의 크기
			//ByteArrayOutputStream.toString() : 버퍼의 내용을 출력
			//ByteArrayOutputStream.size():버퍼의 현재 size리턴
			
			System.out.println("read : ["+(char)ch+" ], write : [ "+out.toString()+" ] "+out.size()+", available : "+in.available());
	
		  System.out.println("String : "+ out.toString());
		  byte arrOut[] = out.toByteArray();
		  for(int i = 0; i<arrOut.length;i++) {
			  System.out.print(arrOut[i]+", ");
		  }
		  //출력버퍼의 내용을 인자로 주어진 outputStream(file)에 출력합니다.
		  out.writeTo(outFile);
		}
		
	}
}
