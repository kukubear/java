package day22_0723;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class FilterStreamTest {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:/Temp/Record.txt");
			CustomerFilterWriter filterWriter = new CustomerFilterWriter(fw);
			filterWriter.write ("I LOVE MY COUNTRY");
			filterWriter.close();
			FileReader fr = new FileReader("C:/Temp/Record.txt");
			BufferedReader bufferedReader = new BufferedReader(fr);
			
			int k = 0;
			while((k = bufferedReader.read())!= -1) {
				System.out.print((char)k);
			}
			bufferedReader.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
class CustomerFilterWriter extends FilterWriter{
	CustomerFilterWriter(Writer out){
		super(out);
	}
	
	public void write(String str) throws IOException{
		super.write(str.toLowerCase());
	}
}