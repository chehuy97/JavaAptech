package ss7;

public class Ex01Demo {
	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			System.out.print(i+ " ");
//			Tools.sleep(100);
//		}
		Ex02MyThread t1 = new Ex02MyThread();
		t1.start();//dung chung
		Ex03MyRunnable r = new Ex03MyRunnable();
		Thread t2 =new Thread(r);
		t2.start();//dung rieng vs bien r
		for (int i = 10; i < 20; i++) {
			System.out.print(i+ ", ");
			Tools.sleep(1000);
		}
	}
}
