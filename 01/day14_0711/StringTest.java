package day14_0711;

public class StringTest {
	public static void main(String[] args) {
		//1. String(char[] value) method
		char[] c = {'H','e','l','l','o'};
		String s = new String(c);
		System.out.println("c = "+c); // �ּҰ�
		for(int i=0; i<c.length; i++) {
			System.out.println("c�� ���� = "+c[i]);
		}
		System.out.println();
		
		//2. String(StringBuffer buf) method
		StringBufferTest sb = new StringBufferTest("Hello");
		String s1 = new String(sb);
		
		System.out.println("sb = "+sb);
		System.out.println("s1 = "+s1);
		System.out.println();
		
		//char charAt(int index) method
		String s2 = "Hello";
		char c1 = s2.charAt(0);
		
		System.out.println("s2 = "+s2);
		System.out.println("c1 = "+c1);
		System.out.println();
		
		//int compareTo(String str) method -1/0/1������ ���� ���������� ��
		int l = "aaa".compareTo("aaa");
		int l2 = "aaa".compareTo("aaaaaaaaa");
		System.out.println("l = "+l);
		System.out.println("l2 = "+l2);
		System.out.println();
		
		//String concat(String str) method ->���ڿ��� ����
		String s3 = "Hello";
		String s4 = s3.concat(" World"); 
		
		System.out.println("s3 = "+s3);
		System.out.println("s4 = "+s4);
		System.out.println();
		
		//boolean contains(CharSequence s) method ->������ ���ڿ��� ���ԵǾ� �ִ��� �˻�
		String s5 = "abcdefg";
		boolean b = s5.contains("bc");
		System.out.println("s5 = "+s5);
		System.out.println("b = "+b);
		System.out.println();
		
		//boolean endsWith(String suffix) method -> ������ ���ڿ��� �������� �˻�
		String file = "Hello.txt";
		boolean b1 = file.endsWith("txt");
		System.out.println();
		
		//int indexOf
		String s6 = "Hello";
		//indexOf(int ch) -> ch�� �����ϴ� ��ġ(0���� ����)
		int idx1 = s6.indexOf('o');
		//indexOf(int ch, int pos) -> ch�� �����ϴ� ��ġ�� pos���� Ȯ���Ͽ� index �˷���
		int idx2 = s6.indexOf("e", 0);
		int idx3 = s6.indexOf('e', 2);
		System.out.println("idx1 = "+idx1);
		System.out.println("idx2 = "+idx2);
		System.out.println("idx3 = "+idx3);
		System.out.println();
		
		//indexOf(String str) -> ���ڿ� ������ġ
		String s7 = "ABCDEFG";
		int idx4 =s7.indexOf("CD");
		System.out.println("idx4 = "+idx4);
		
		//
		String s8 = "java.lang.Object";
		int idx5 = s8.lastIndexOf('.');
		
		
		
		
	}
}
