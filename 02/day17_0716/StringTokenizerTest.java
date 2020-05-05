package day17_0716;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("This \t is a \n String");
		while(st.hasMoreTokens()) System.out.println(st.nextToken());
		System.out.println("==========================================");
		
		//���ڷ� �־��� ���ڿ��� ':' �����Ѵ�
		String str = "80::95:70";
		StringTokenizer st2 = new StringTokenizer(str,":",false);
		
		int i =0;
		while(st2.hasMoreTokens()) {
			System.out.println(i+":"+st2.nextToken());
			i++;
		}
		System.out.println("==========================================");
		
		//StringTokenizer�� �����ڳ��� �پ��ִ� ��� ���� ���� �������� ���ϴ� ������ �ִ�.
		String [] result = str.split(":");
		
		for(int x =0; x< result.length; x++) {
			System.out.println(x+":"+result[x]);
		}
		System.out.println("==========================================");
		//������ split�� �������� �����ڰ� ������ �̸� ó���F �Ӹ��� -> 2���� ���ڸ� �޴� split�� ���
		String str2 = "80.95.70.";
		String[]result2 = str2.split(".", 5);
		
		for(int x =0; x< result2.length;x++) {
			System.out.println(x+":"+result2[x]);
		}
		
	}
}
