package day07;

import java.util.Random;
import java.util.Scanner;

//문제] 저축은행이 있습니다.
//이 은행의 계좌를 개설하고 저금하기
//1. 계좌 생성
//2. 저축: 1000만원, 2000원, 3000원
//3. 출금 : 500
//4. 잔액

	
public class Ex03 {
	static String name;
    static int phNum,account, input, withdrawl, remain;

	public Ex03(String name2, int input2, int phNum2, int withdrawl2, int remain2) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.phNum=phNum;
		this.input=input;
		this.withdrawl=withdrawl;
		this.remain=remain;
	}
//Random 돌려서 11자리 계좌번호 만들고 값을 기억하기
	public static void phNum() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("핸드폰 번호를 입력하세요: ");
		phNum = scan.nextInt();
		phNum=account;
		System.out.println("입력하신 핸드폰 번호는 계좌변호입니다.");
	}
	
	public static void input() {
		int sum =0;
		Scanner scan = new Scanner(System.in);
 
		for(int i=0; i>=input; i++) {
			
			sum += input;
			if(i==0) {
				System.out.println("입금을 종료합니다.");
			    break;
			}else {
				System.out.println("입금하실 금액을 입력해주세요: ");
			    input = scan.nextInt();
			    
			}
			
		}
		
	}

@SuppressWarnings("resource")
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("계좌를 생성하시려면 이름을 입력해주세요: ");
		String name = scan.nextLine();
		phNum();
	    input();
	    
	    Ex03 infor = new Ex03(name, input,phNum,withdrawl,remain);
	    
		
		
		
		
	}




	


	
}
