package day02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//BufferedReaderŬ������ Ȱ�� ������
//����2] first=250, second= 450, third =550.0f �հ踣 ���Ͽ� ����غ��ô�.
public class Ex01Q1 {
	public static void main(String[] args)throws Exception {
	/*7.BufferedReader = Ŭ����:���ۿ� ������ �����͸� ����(4~8byte)
	 *6.bufRd : ��ü(object)
	 *5.= : ���Կ�����
	 *4.new : �޸� �Ҵ� ������
	 *3. BufferedReader Ŭ����: ��ü�� ����, ������ ���-> bufRd��� ���ο� BufferedReader�� �����ض�
	 *2. (new InputStreamReader : 1byte�� �Է¹޾ƶ�
	 *1. (System.in)) : Ű����κ��� �����͸� �Է��մϴ�.
	 *;
	 ****bufRd.readLine(): 
	 ***new �ڿ� ���°��� Ŭ����(������)
	 *parse
	 *��ü��.�޼ҵ�� orŬ������.Ŭ�����޼ҵ�� ����
	 */
		//�޸� ���Ծ��ų� �ð��� ���Ծ��°� ->��§ ���α׷�
		
	//String z = bufRd.readLine(); float third = Float.parseFloat(z);
	//float z = Integer.parseInt(br.readLine()); ->�̷��� ���ٷ� �� �� ����
		
	BufferedReader bufRd = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("ù��° ���� �Է�: ");
	String x = bufRd.readLine();
	int first = Integer.parseInt(x);
	
	System.out.println("�ι�° ���� �Է�: ");
	String y = bufRd.readLine();
	int second = Integer.parseInt(y);
	
	System.out.println("����° ���� �Է�: ");
	String z = bufRd.readLine();
	float third = Float.parseFloat(z);
	
	float xyz = first + second +third;
	System.out.println("�հ�� : "+ xyz);
	
}
}
