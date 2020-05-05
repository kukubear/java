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
		//ReadFile.txt������ �д� FileReader ��ü ����
		//BufferedReader ��ü ����
		fr = new FileReader("C:/Temp/Calc.java");
		br = new BufferedReader(fr);
		
		//FileWriter�� ����"CopyFile.txt"�� ����Ѵ�. ���� ���Ͽ� �����.
		//BufferedWriter ��ü����
		fw = new FileWriter("C:/Temp/CopyFile.txt", false);
		bw = new BufferedWriter (fw);
		
		
		String s = null;
		d= new Date();
		
		//���� ���� ���� �ð�
		long start = d.getTime();
		
		//ReadFile.txt ���� ���پ� �о BufferedReader�� �����Ѵ�. 
		while((s=br.readLine())!=null) {
			//���� ������(����)�� BufferedWriter�� ����.
			//
		}
	}
}
}
