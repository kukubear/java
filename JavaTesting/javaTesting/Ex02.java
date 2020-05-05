package javaTesting;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;
public class Ex02 {
	public static void main(String[] args) {
		//���� ] str="ȫ�浿", str2 = "ȫ�浿", str3 ="ȫ����" ����
		String str = "ȫ�浿";
		String str2 = "ȫ�浿";
		String str3 = "ȫ����";
		
		System.out.println(str.equals(str2));
		System.out.println(str2.equals(str3));
		
		str = str3;
		System.out.println(str.equals(str3));
		System.out.println(str == str3);
		
		//Date class
		Date currentDate = new Date();
		System.out.println("���� ��¥�� = "+ currentDate +"�Դϴ�.");//�̱������� ���
		
		//���� ��ǻ�ʹ� 1970�� 1�� 1���� �⺻ �����Ǿ� �ֽ��ϴ�.
		System.out.println("�⵵: "+currentDate.getYear());
		System.out.println("��: "+currentDate.getMonth());
		System.out.println("��: "+ currentDate.getDay());
		System.out.println("��¥: "+currentDate.getDate());
		
		System.out.println(currentDate.toLocaleString());
		//2.Calendar class
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR)+ "��");
		System.out.println(cal.get(Calendar.MONTH)+1+ "��");
		System.out.println(cal.get(Calendar.DATE)+"��");
		System.out.println(cal.get(Calendar.HOUR)+"��");
		System.out.println(cal.get(Calendar.MINUTE)+"��");
		System.out.println(cal.get(Calendar.SECOND)+"��");
		
		//3. Unicode:
		//http://www.unicode.org/charts-���⼭ �����Ͽ� �ѱ��� ���
		String str5 = "\uAc00";
		System.out.println(str5);
		String str6 = "\uB098";
		System.out.println(str6);
		
		//4. StringTokenizer class : ���ڿ� ���� ->�ؿ� �κ� ������ �ϱ��ϸ� ����
		//���ڿ��� �����ڸ� �̿��Ͽ� ����
		StringTokenizer st = new StringTokenizer("������, �ҳ�, �մ���, �Ʒι�, ����", ",");
		System.out.println("���ڿ��� ������ = "+st.countTokens()+"��");
		
		while(st.hasMoreTokens()) {//������ �ܾ �����ϸ� �̶�� ��
			String data = st.nextToken();
			System.out.println(data);
		}
		//���� 
}
}
