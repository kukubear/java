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
			
			//InputStrea.available() : �о�ü� �ִ� �������� ũ��
			//ByteArrayOutputStream.toString() : ������ ������ ���
			//ByteArrayOutputStream.size():������ ���� size����
			
			System.out.println("read : ["+(char)ch+" ], write : [ "+out.toString()+" ] "+out.size()+", available : "+in.available());
	
		  System.out.println("String : "+ out.toString());
		  byte arrOut[] = out.toByteArray();
		  for(int i = 0; i<arrOut.length;i++) {
			  System.out.print(arrOut[i]+", ");
		  }
		  //��¹����� ������ ���ڷ� �־��� outputStream(file)�� ����մϴ�.
		  out.writeTo(outFile);
		}
		
	}
}
