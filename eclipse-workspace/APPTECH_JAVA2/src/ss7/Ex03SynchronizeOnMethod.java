package ss7;

public class Ex03SynchronizeOnMethod extends Thread{
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread name: "+Thread.currentThread());
		for (int i = 0; i < 10; i++) {
			System.out.println(i+" ");
			Tools.sleep(500);
		}
	}
	public static void main(String[] args) {
		Ex03SynchronizeOnMethod t1 = new Ex03SynchronizeOnMethod();
		t1.start();
		t1.run();
	}
}
