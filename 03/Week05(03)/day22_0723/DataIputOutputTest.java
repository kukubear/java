package day22_0723;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIputOutputTest {
	final static int BUFFER_SIZE = 256;
	public static void main(String[] args) {
		char c = 'A';
		byte b = 10;
		short s = 10;
		int i = 10;
		float f = 3.141592f;
		double d = 3.141592;
		String str = "Hi!!JAVA", str2;
		DataInputStream in= null;
		DataOutputStream out = null;
		
		try {
			FileOutputStream fout = new FileOutputStream("fileStreamTest.txt");
			out = new DataOutputStream(fout);
		}catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		try {
			out.writeByte(b);
			out.writeShort(s);
			out.writeChar(c);
			out.writeInt(i);
			out.writeFloat(f);
			out.writeDouble(d);
			out.writeUTF(str);
			out.close();
		}catch(IOException e ) {
			System.out.println(e);
		}
		
		try {
			FileInputStream fin = new FileInputStream(new File("fileStreamTest.txt"));
			in = new DataInputStream(fin);
			
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
		
		try {
			b = in.readByte();
			s = in.readShort();
			c = in.readChar();
			i = in.readInt();
			f = in.readFloat();
			d = in.readDouble();
			str2 = in.readUTF();
		}catch (IOException e) {
			System.out.println(e);
		}
		System.out.println(c);
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		System.out.println(str);
	}
}
