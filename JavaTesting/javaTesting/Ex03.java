package javaTesting;

import java.util.StringTokenizer;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("������=�ҳ�; �մ���=�Ʒι�; ����=����","=;");
		System.out.println("���ڿ��� ������ = "+st.countTokens()+"��");
		
		while(st.hasMoreTokens()) {
			String data = st.nextToken();
			System.out.println(data);
			//system : class
			// out: object �ܼ����α׷�?
			
		}
	}
 
}
