package day19_0718;

public class ThreadSample extends Thread {
	int number;

	ThreadSample(int n) {
		super();
		number = n;
	}
	ThreadSample(String s, int n){
		super(s);
		number = n;
		
	}
	
	public void run() {
		int n =3;
		while(n< number) {
			if(isPrimeNumber(n)) {
				System.out.println(getName()+" : "+n+" is prime number");
				n++;
				try {
					sleep(100);
				}catch (InterruptedException e) {
					
				}
			}
		}
	}
	
	public boolean isPrimeNumber(int n) {
		int i;
		for(i=2; i<=(n/2); i++) {
			if((n%i)==0) {
				return false;
			}
			
		}
		return true;
	}
}
