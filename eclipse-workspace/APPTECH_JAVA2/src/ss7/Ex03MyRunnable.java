package ss7;

public class Ex03MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 20; i < 40; i++) {
			System.out.print(i+", ");
			Tools.sleep(500);
		}
	}

}
