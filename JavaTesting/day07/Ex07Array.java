package day07;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//�迭(array): ����� ���� �ڷ���� ����
/* 1,2,3���� �迭�� ����
 * 1����[ ] : ���� ���� : �ҷ��� ������, ��� ���� ���� ����
 * 2���� [][]: ���� ���� ->�ַ� �ٷ�(1,2) ������, �ٷ��� ������, ��� ���� ������ ����
 * 3���� [][][]: ���� ���� ->GIS,GPS ū������Ʈ�� ��õ,����� ������, ��, ��, ���� ����
 * �ڹٴ� �� �߽� ��� (���̽㸸 �� �߽� ���)
 * */
public class Ex07Array {

	public static void main(String[] args) {
		
		//1���� �迭�� �ʱ�ȭ
		//1.String arr1 = new String[]{"data1","data2","data3".....};

		String[]arr= new String[] {"data1","data2","data3","data4","data5","data6"};
			String data1 = arr[0];//data1�� ��
			String data2 = arr[1];//data2
			String data3 = arr[2];//data3
			String data4 = arr[3];//......
			String data5 = arr[4];
			String data6 = arr[5];
			int len = arr.length;
			System.out.println(len);
			
		//2.
			String[]arr1= new String[] {"data1","data2","data3","data4","data5","data6"};
			arr1[0]="10";
			arr1[1]="20";
			arr1[2]="30";
			arr1[3]="40";
			arr1[4]="50";
			arr1[5]="60";
			int leng = arr.length;
			System.out.println(leng);
			System.out.println(arr[1]);//arr[1]�� �ִ� ������ ��
			System.out.println(arr);//arr�� �ּҰ�
			
		//3. ����
		
			int num[] = new int[5];
			int total=0;
			
			num[0]=100; //������ ���� 
			num[1]=200;
			num[2]=300;
			num[3]=400;
			num[4]=500;
	
			total= num[0]+num[1]+num[2]+num[3]+num[4];
			System.out.println(total);
			
			
			int[] arr3=new int[] {10,30,25,7,4,6};
			Arrays.sort(arr3);
			String one = Arrays.toString(arr3);		
			System.out.println(one);
	}

}
