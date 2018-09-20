package ss7;

public class Ex01JoinMethodDemo {
	public static void main(String[] args) {
		Ex02MyThread t1 = new Ex02MyThread();
		Ex03MyRunnable r =  new Ex03MyRunnable();
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
		try {
			t1.join();
			//t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End of main!");
	}
}
