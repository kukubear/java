package javaTesting;
//���� 3
public class Ex01 {
	public static void main(String[] args) {
		//Q.3 Ű�� 172.56cm Ű�� ����Ʈ ����ġ?
		//1inch = 2.54cm, 1feet=3048cm=12inch
		double cm, inch, feet, feetsum, inchsum;
		
		cm=172.56;
		inch=2.54;
		feet=inch*12;
		
		feet = inch*12;
		feetsum = cm / feet;
		
		inchsum=(cm%feet)/inch;
		System.out.println(feetsum+"��Ʈ, " + inchsum + "��ġ �Դϴ�.");
		System.out.printf("cm�� %3.2f ��Ʈ�̰�, %3.2f��ġ �Դϴ�.\n", feetsum, inchsum);
		
		
		//���� ������ : char(����), String(���ڿ�)
		
		char name = 'h';
		char x = 'y';
		
		String sign = "yes"; // call by reference(������)
		
		System.out.println(name+", "+sign);
		System.out.printf("name = %c, sign = %s\n", name, sign);
		
		//�ѱ� ���� ��� ���� 
		String �̸�1 ="ȫ�浿";
		String �̸�2 = "�Ӱ���";
		String �̸�3 = �̸�1 + �̸�2;
		//+�� �����ڱ�ɰ� ������� 2������ ������ ����
		//-�� ��ȣ��ȯ �� ������� 2���� ���
		System.out.println(�̸�3);
		
		//���ڿ� ������ ����
		String value = "ȫ�浿";
		String value2 = value + 300;
		System.out.println(value2);
		
		//�빮�ڿ� �ҹ��ڷ� ��ȯ
		String str = "Java progamming";
		String ss = str.toUpperCase();//�빮�ڷ� ��ȯ ���Ѷ�
		System.out.println(ss);
		
		String sss = ss.toLowerCase();
		System.out.println(sss);
		
		//����"It is not the time but the will that is wanting"�̶�� ���ڿ��� ����
		//���� �߿��� w��� ������ ��ġ�� ã�Ƽ� ����ϰ�, ���ڿ��� ��ü���̰� ������ Ȯ��
		//charAt(����); -> ���� �� �μ���° ���� �����ϴ� ����
		
		//index : 012345678.....
		String msg = "It is not the time but the will that is wanting";//��������
		int len = msg.length();
		System.out.println(len);
		
		for(int idx = 0; idx < len; idx+=1) {
			//+= ���մ��Կ�����
			// idx+=1 -> idx = idx+1
			char ch = msg.charAt(idx);
			
			if(ch == 't') {
				System.out.println("ã�� �ε��� ��ġ��= "+idx);
			}
			
		}
		
		//index0f(����):������ ��ġ ã��
		String msg2 = "J a v a Program is Create Many Objects";
		int len2 = msg.length();
		
		int idx1 = msg2.indexOf('a');
		int idx2 = msg2.indexOf('a',12);//12��° ������ a�� ��ġ�� ã�ƶ�
		System.out.println(idx1);
		System.out.println(idx2);
		
		//substring : �κй��ڿ� ��� ->charAt�� �����ϳ����� substring(����,����)�� ���ڿ� 
		
		String str2 = msg2.substring(8,20);//��� -> program is C 
		System.out.println(str2);
		
		
		String str3 = msg2.substring(12);//��� ->12��° ���ĺ��͸� ���
		System.out.println(str3);
		
		//String Ŭ����:reference type, ���Ѵ� ���� ����, 
		
		String str4 = new String("ȫ�浿");
		/*String Ŭ����
		 *str4 : ��ü(������Ʈ)
		 *= : ���Կ�����
		 *new : �޸� �Ҵ� ������
		 *String : Ŭ����
		 *("ȫ�浿"):�Ű����������� ��
		 *; : ������ ��*/
		
		
		//equals() = ���ϰ��� �ϴ� ����� ���� ��ü�� �� 
		//������ �����ϸ� ���� �ּҹ����� �ο�
		String str5 = "ȫ�浿";
		//���� 2���� ����� ���� 
		String str6 = "��浿"
				+ "";
		System.out.println(str4.equals(str5));
		System.out.println(str5.equals(str6));
		System.out.println(str5==str4);
		
		//Date class
		
		
		
		
	}
}
