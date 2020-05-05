package day09;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//문제] 30명의 학생에게 주변음식점에 대한 만족도 조사함
		//조사한 결과를출력
		//기준 : 5(매우 만족), 4(만족), 3(보통),2(불만족),1(매우 불만족)
		//결과 -> 5: 10명 4:5명 3:10명 2:2명 1:3명
		
		int rest[] = new int[5];
		int sum=0; float total=0.0f;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("5점을 준 학생의 수를 입력하세요: ");
	   rest[0] = sc.nextInt();
	   System.out.println("4점을 준 학생의 수를 입력하세요: ");
	   rest[1]= sc.nextInt();
	   System.out.println("3점을 준 학생의 수를 입력하세요: ");
	   rest[2] = sc.nextInt();
	   System.out.println("2점을 준 학생의 수를 입력하세요: ");
	   rest[3] = sc.nextInt();
	   System.out.println("1점을 준 학생의 수를 입력하세요: ");
	   rest[4] = sc.nextInt();
	   System.out.println("==주변음식점 만족도 조사결과(30명 응답)==");
	   System.out.println(" 매우 만족  : "+rest[0]+"명");
	   System.out.println("   만족    : "+rest[1]+"명");
	   System.out.println("   보통    : "+rest[2]+"명");
	   System.out.println("  불만족   : "+rest[3]+"명");
	   System.out.println("매우 불만족 : "+rest[4]+"명");
	   
	   for(int i =0; i<rest.length;i++) {
		   if(i==0)
			   sum=rest[i]*5;
		   if(i==1)
			   sum=rest[i]*4;
		   if(i==2)
			   sum=rest[i]*3;
		   if(i==3)
			   sum=rest[i]*2;
		   if(i==4)
			   sum=rest[i]*1;
		  total+=sum;
		   
	   }
	   System.out.println("음식점의 평점은 "+total/30);
		
	   int response[] = {5,2,3,1,1,1,5,5,2,3,3,3,4,4,4,5,5,5,3,4,4,3,3,3,3,3,5,5,5};
	   int frequency[]=new int[5];
	   
	   for(int i=0;i<response.length;i++) {
		   if(response[i]==1)
			   ++frequency[0];
		   else if(response[i]==2)
			   ++frequency[1];
		   else if(response[i]==3)
			   ++frequency[2];
		   else if(response[i]==4)
			   ++frequency[3];
		   else if(response[i]==5)
			   ++frequency[4];
	   }
	   for(int j=0; j<frequency.length;j++) {
		   System.out.println(j+" : "+frequency[j]);
	   }
	}

}
