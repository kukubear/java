package javaTesting;

import java.util.Scanner;

//ctrl + f11 = ����
public class HelloJava {

	public static void main(String[] args) {
		System.out.println("�ȳ��ϼ���?");//ȭ���� ������ ����մϴ�. �� ��¥�� �ּ�
		System.out.println("HelloJava");
		System.out.println("�ݰ����ϴ�.");
/*
 * System : Ŭ����
 * out :object ��ü
 * println: �޼ҵ�
 * ("�ȳ��ϼ���?"): �Ű����� ��
 * ; : ������ ��
 * */
		
		int x = 100;//int�� ������ ������ -> 100�� ���� x�� �����Ͻÿ�.
		int y = 300;
		int z = x + y;
		System.out.println(z);
		/*
		 * int : ������ 4����Ʈ �޸�
		 * x : ����
		 * = : ���Կ�����(�������� ������ ����� �������� �����Ͻÿ�)
		 * 100 : �ǵ�����
		 * ; : ������ ��
		 * */
		
		/*1. ������ : �ڷ� = ������(�Ҽ����� ���� ��), �Ǽ���(�Ҽ����� �ִ� ��), ����(character = ���ĺ� �ѹ���(��/��)), 
		 * ���ڿ�(String=>�������� ���ڷ� ����), Ư����ȣ(^,%,$,#,@,!,~,*,&,(,))
		 *���ڿ� ����
		 *2. ����(variable): x,y,z....
		 *3. �ڷ���: byte(1byte), short(2), long(4), float(4), double(8), boolean(1bit).....
		 *4. �޸� : RAM(8GB) = �ּҰ�(address) = ������
		 *5. algorithm(�˰���): �����ذ��� =>���ǹ�, �ݺ���, �迭, ��ü���⳻��.....
		 *6. ����(����) + ����(����) = �����ذ�ɷ�  */
		
		/*����Ǯ�� ��� (���α׷��� 5�ܰ�)
		 * 1. �䱸���� �ľ�: ������ ����, �ǵ��ϴ� �ٸ� �˾Ƴ��� ��
		 * 2. �䱸���� �м� : ����, ���, �޸�, �����ͺ��̽� ���, ���� ���, �ֺ� ��Ȳ...
		 * 3. �䱸���� ���� : �������ľ�, ������ ����, �ڷ���, ����ȯ, ��ü��������(Ŭ����, �������̽�...)....
		 * 4. ����: �ڵ�
		 * 5. �׽�Ʈ: ���������� �����ϴ��� Ȯ��!!! (1~5������ SI)
		 * 6. ���� �� ��������: 60~70%�� ���Կ�(ȸ��):SM
		 * */
		
		//����] 1000+5000=6000 �������� ���α׷��� �����ϼ���
		int i = 10*x;
		int j = 10*y+20*x;
		int k = i+j;
		System.out.println(k);
		
		
		Scanner sc = new Scanner(System.in);
		//scanner = class
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int a = sc.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int b = sc.nextInt();
		
		int c = a+b;
		System.out.println("�� ���� ���� = "+ c);
		//�ڹٴ� �����Ͱ� �Էµɶ� ��κ� ���ڷ� �νĵ�
		
		
		//����2] first=250, second= 450, third =550.0f �հ踣 ���Ͽ� ����غ��ô�.
		int first = 250, second = 450;
		float third = 550.000f;
		float calcAll= first + second + third;//����������ȯ(�ڵ�����ȯ-����+�Ǽ�->�Ǽ�)
		//System.out.println(calcAll);
		System.out.printf("%d \n", calcAll);
		
		
		int sum;
		sum = (int)((first+ second)+third); //-> casting ������ ����ȯ(����+�Ǽ�->����)
		//System.out.println(sum);
		System.out.printf("%5.1f \n", sum);
		
	
	}

}
