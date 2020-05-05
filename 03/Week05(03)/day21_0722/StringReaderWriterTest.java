package day21_0722;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderWriterTest {
	public static void main(String[] args) throws IOException {
		int ch;
		// �Է¹��۷� ����� ���ڿ�
		String s = "Hello, java!";

		// String s�� �Է� Stream���� �ϴ� StringReader��ü ����
		StringReader in = new StringReader(s);

		// �־��� ũ���� ���ڿ� Buffer�� �����ϰ� �ִ�.
		StringWriter out = new StringWriter(s.length() / 2);

		// �־��� ������ŭ �ǳʶڴ�. index�� j�� �̵�
		in.skip(7);
		while ((ch = in.read()) != -1) {
			out.write(ch); // ����Կ����� ��¹����� ������� �þ��

			System.out.println(
					"read : [" + (char) ch + "], write : [ " + out.toString() + " ] " + out.getBuffer().length());
		}
		// Java!
		System.out.println(" out : " + out.toString());

		// StringWriter�� ������¹����� ������ ������Ŵ!avaJ
		out.getBuffer().reverse();
		System.out.println("out : " + out.toString());

		// Char�迭 ��� Stream����
		CharArrayWriter out2 = new CharArrayWriter();
		while ((ch = in.read()) != -1) {
			out2.write(ch);
			System.out.println("read : [ " + (char) ch + " ], write : [ " + out2.toString() + " ] " + out2.size());
		}
		//CharArrayWriter Stream�� ������ ������ StringWriter Stream�� ����
		//������ ������ �κп� append�ȴ�.
		out2.writeTo(out);
		
		//���ڿ�OutPut Stream�� append�� ��� ���
		System.out.println("out : "+out.toString());
		System.out.println("out2 : "+out2.toString());
	}
}