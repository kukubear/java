package day21_0722;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterTest {
	public static void main(String[] args) throws IOException {
		boolean append = false;
		int i, len = 0;
		String strFile01 = "C:/MyProject/workspace/pro01/FruitEx3.java";
		String strFile02 = "C:/MyProject/workspace/pro01/hw0719/Car.java";

		FileReader in = null;
		FileWriter out = null;

		try {
			in = new FileReader(new File(strFile01));
			out = new FileWriter(strFile02, append);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

		try {
			while ((i = in.read()) != -1) {// 1byte�о
				System.out.println(i);
				out.write(i);
				len++;
			}
			in.close();
			out.close();
			System.out.println(len + "chars are copied...");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
