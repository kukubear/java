package day04;
//while 1~100���� ��
public class Ex03 {
public static void main(String[] args) {
	int i = 1; int sum=0;
	while(i<=100) {
		sum+=i;
		i++;
	}
	System.out.println(sum);
	
	//���� while��
			int a=2, b=1;
			while(a<=19) {
				while(b<=9) {
					System.out.println(a+" * "+b+" = "+(a*b));
					b++;
				}
				a++;
				b=1;
				System.out.println();
			}
}
}
