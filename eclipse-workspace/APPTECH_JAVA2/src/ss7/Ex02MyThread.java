package ss7;

public class Ex02MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i+ ", ");
			Tools.sleep(600);
		}
	}
}
