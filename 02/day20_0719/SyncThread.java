package day20_0719;

public class SyncThread {
	public static void main(String[] args) {
		User user = new User();

		UserThread p1 = new UserThread(user, "A1");
		UserThread p2 = new UserThread(user, "B2");
		UserThread p3 = new UserThread(user, "C3");

		p1.setPriority(p1.MAX_PRIORITY);
		p2.setPriority(p2.NORM_PRIORITY);
		p3.setPriority(p3.MIN_PRIORITY);

		System.out.println("-----------------------");
		System.out.println("synchronized 적용안한 경우");
		System.out.println("-----------------------");

		p1.start();
		p2.start();
		p3.start();

	}
}

class User {
	private int userNo = 0;

	public void add(String name) {
		synchronized (this) {
			System.out.println(name + " : " + userNo++ + "번째 사용");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

class UserThread extends Thread {
	User user;

	UserThread(User user, String name) {
		super(name);
		this.user = user;
	}

	public void run() {
		try {
			for (int i = 0; i < 3; i++) {
				user.add(getName());
				sleep(500);
			}
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}
	}
}
