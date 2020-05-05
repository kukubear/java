package day04;

import java.util.Scanner;

public class Ex01Q1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a = 0;
	System.out.println("임의의 정수를 입력하세요: ");
	a = sc.nextInt();
	
	if(a%7 == 1) {
		System.out.println(a+"는(은) 7로 나눴을 때 나머지가 1입니다.");
		}else if(a%7 == 2 || a%7 ==3) {
		System.out.println(a+"는(은) 7로 나눴을 때나머지가 2 또는 3입니다.");
		}else if(a%7 == 4 || a%7 ==5) {
		System.out.println(a+"는(은)7로 나눴을 때나머지가 4 또는 5입니다.");
		}else if(a%7 == 6) {
		System.out.println("는(은) 7로 나눴을 때나머지가 6입니다.");
		}else if(a%7 == 0) {
		System.out.println(a+"는(은) 7의 배수입니다.");}
	//switch~case
	
	switch(a){
		case 1:
			System.out.println(a+"는(은) 7로 나눴을 때 나머지가 1입니다.");
			break;
		case 2:
		case 3:
			System.out.println(a+"는(은) 7로 나눴을 때나머지가 2 또는 3입니다.");
			break;
		case 4:
		case 5:
			System.out.println(a+"는(은)7로 나눴을 때나머지가 4 또는 5입니다.");
			break;
		case 6:
			System.out.println("는(은) 7로 나눴을 때나머지가 6입니다.");
			break;
		default:
			System.out.println(a+"는(은) 7의 배수입니다.");
	          break;
	          }
	}

}

