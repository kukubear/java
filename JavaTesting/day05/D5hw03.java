package day05;

import java.util.Random;
import java.util.Scanner;

// 컴퓨터와 숫자 맞추기 게임을 한다.
//하나의 난수는 컴퓨터가 발생하여 저장하고, 그 숫자를 사람이 맟추어 가는 형태로 진행
//카운트하여 몇번만에 맞추었는지도 출력하고
//게임을 계속 진행하려면 yes(1)를 그만두려면no(2)를 입력합니다.
public class D5hw03 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int com,ppl;
		com = (int)(Math.random()*100);
		System.out.println("---숫자 맞추기---");
		System.out.println("숫자를 입력하세요: ");
		ppl=sc.nextInt();
		
		while(com>ppl||com<ppl||com==ppl) {
				
			if(com>ppl) {
				System.out.println("입력하신 숫자보다 큰 수 입니다.");
				System.out.println("다시 입력해주세요: ");
				ppl=sc.nextInt();
				
			}else if(com<ppl){
				System.out.println("입력하신 숫자보다 작은 수 입니다.");
				System.out.println("다시 입력해주세요: ");
				ppl=sc.nextInt();
			
			}else if(com==ppl){
				System.out.println("정답입니다!!!");
				System.out.println("계속하시려먼 1번(yes)를 종료를 원하시면 2번(no)을 입력해주세요. ");
				ppl=sc.nextInt();
				
				if(ppl==2) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				
			}
			
		
			
		}
		
		
		
		
		
		
		
		
		
		
//		if(com==ppl) {
//			System.out.println("정답입니다!!!");
//			
//		}else if(com>ppl) {
//			System.out.println("입력하신 숫자보다 큰 수 입니다.");
//			System.out.println("숫자를 다시 입력하세요: ");
//			ppl=sc.nextInt();
//			
//		}else if(com<ppl) {
//			System.out.println("입력하신 숫자보다 작은 수 입니다.");
//			System.out.println("숫자를 다시 입력하세요: ");
//			ppl=sc.nextInt();
//			
//		}
		
	
	}
	}


