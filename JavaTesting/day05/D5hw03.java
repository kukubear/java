package day05;

import java.util.Random;
import java.util.Scanner;

// ��ǻ�Ϳ� ���� ���߱� ������ �Ѵ�.
//�ϳ��� ������ ��ǻ�Ͱ� �߻��Ͽ� �����ϰ�, �� ���ڸ� ����� ���߾� ���� ���·� ����
//ī��Ʈ�Ͽ� ������� ���߾������� ����ϰ�
//������ ��� �����Ϸ��� yes(1)�� �׸��η���no(2)�� �Է��մϴ�.
public class D5hw03 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int com,ppl;
		com = (int)(Math.random()*100);
		System.out.println("---���� ���߱�---");
		System.out.println("���ڸ� �Է��ϼ���: ");
		ppl=sc.nextInt();
		
		while(com>ppl||com<ppl||com==ppl) {
				
			if(com>ppl) {
				System.out.println("�Է��Ͻ� ���ں��� ū �� �Դϴ�.");
				System.out.println("�ٽ� �Է����ּ���: ");
				ppl=sc.nextInt();
				
			}else if(com<ppl){
				System.out.println("�Է��Ͻ� ���ں��� ���� �� �Դϴ�.");
				System.out.println("�ٽ� �Է����ּ���: ");
				ppl=sc.nextInt();
			
			}else if(com==ppl){
				System.out.println("�����Դϴ�!!!");
				System.out.println("����Ͻ÷��� 1��(yes)�� ���Ḧ ���Ͻø� 2��(no)�� �Է����ּ���. ");
				ppl=sc.nextInt();
				
				if(ppl==2) {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}
				
			}
			
		
			
		}
		
		
		
		
		
		
		
		
		
		
//		if(com==ppl) {
//			System.out.println("�����Դϴ�!!!");
//			
//		}else if(com>ppl) {
//			System.out.println("�Է��Ͻ� ���ں��� ū �� �Դϴ�.");
//			System.out.println("���ڸ� �ٽ� �Է��ϼ���: ");
//			ppl=sc.nextInt();
//			
//		}else if(com<ppl) {
//			System.out.println("�Է��Ͻ� ���ں��� ���� �� �Դϴ�.");
//			System.out.println("���ڸ� �ٽ� �Է��ϼ���: ");
//			ppl=sc.nextInt();
//			
//		}
		
	
	}
	}


