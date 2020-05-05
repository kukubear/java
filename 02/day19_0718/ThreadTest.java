package day19_0718;

public class ThreadTest {
	public static void main(String[] args) {
		ThreadSample primeThread = new ThreadSample(30);
	
		System.out.println("PrimeThread : " + primeThread);
		
		primeThread.setName("PrimeThread");
		System.out.println("PrimeThread : " + primeThread);
		primeThread.run();
		primeThread.start();
	}
}
