package day04;
//����3 1~100������ ������ �հ踦 ���ϼ���. 
//1-2+3-4+5-6+7-8+....+99-100=?
//3���� �̻��� ����� ����ϼ���
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
    