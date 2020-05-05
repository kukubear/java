package day20_0719;

public class ThreadTest {
	public static void main(String[] args) {
		 ThreadB b = new ThreadB();
		 b.start();
		 
		 synchronized(b) {
			 try {
				 System.out.println("b�� �Ϸ�ɶ����� ��ٸ��ϴ�.");
				 b.wait();
			 }catch(InterruptedException e) {
				 e.printStackTrace();
			 }
			 
			 System.out.println("Total is : "+b.total);
		 }
	}
}

class ThreadB extends Thread{
	int total;
	@Override
	public void run() {
		synchronized(this) {
			for(int i =0; i<5; i++) {
				System.out.println(i+"�� ���մϴ�");
				total +=i;
				try {
					Thread.sleep(500);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			notify();
		}
	}
}