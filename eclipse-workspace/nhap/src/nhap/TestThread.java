package nhap;

public class TestThread {
	public static void main(String[] args) {
		Prime();
		new xulyfibo().start();
	}
	public static void fibo() {
		System.out.println("F= 1");
		System.out.println("F= 1");
		int a=1;
		int b=1;
		while(b<100000) {
			int temp=a+b;
			b=a;
			a=temp;
			System.out.println("F= "+a);
		}
	}
	public static void Prime() {
		boolean ok =true;
		for(int i=2;i<10000;i++) {
			for(int j =2;j*j<=i;j++) {
				if(i%j==0) {
					ok=false;
					break;
				}
			}
			if(ok) System.out.println("P= "+i);
		}
	}
	
}
class xulyfibo extends Thread{
	public void run() {
		TestThread.fibo();
	}
}
