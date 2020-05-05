package day07;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//배열(array): 상당히 많은 자료들의 집합
/* 1,2,3차원 배열이 존재
 * 1차원[ ] : 점의 집합 : 소량의 데이터, 행과 열이 같은 개념
 * 2차원 [][]: 선의 집합 ->주로 다룸(1,2) 관리비, 다량의 데이터, 행과 열이 별도로 존재
 * 3차원 [][][]: 면의 집합 ->GIS,GPS 큰프로젝트에 추천,대단위 데이터, 면, 행, 열이 존재
 * 자바는 행 중심 언어 (파이썬만 열 중심 언어)
 * */
public class Ex07Array {

	public static void main(String[] args) {
		
		//1차원 배열의 초기화
		//1.String arr1 = new String[]{"data1","data2","data3".....};

		String[]arr= new String[] {"data1","data2","data3","data4","data5","data6"};
			String data1 = arr[0];//data1이 들어감
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
			System.out.println(arr[1]);//arr[1]에 있는 데이터 값
			System.out.println(arr);//arr의 주소값
			
		//3. 연산
		
			int num[] = new int[5];
			int total=0;
			
			num[0]=100; //데이터 저장 
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
