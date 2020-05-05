package day04;
//과제3 1~100사이의 연산의 합계를 구하세요. 
//1-2+3-4+5-6+7-8+....+99-100=?
//3가지 이상의 방법을 사용하세요
public class D4hw3 {
	public static void main(String[] args) {
    int a=1; int b=2, sum=0, sum1=0, sum3=0;
    for(a=1;a<=97;a+=2) {
    	sum+=a;
    	a++;
    	for(b=1;b<=51;b=2*b-2) {
    		sum1+=b;
    		b++;
    		System.out.println(sum);
    	}
    	
    	
    }
    System.out.println(sum);
    System.out.println(sum1);
    System.out.println(sum-sum1);
    
    }
	
    }
    