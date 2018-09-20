package ss7;

public class Ex02Main {
	public static void main(String[] args) {
		int[] dem = new int[1];
	//	long time1 = System.nanoTime();
		long time1 = System.currentTimeMillis();
		Ex02DemSNT t1 = new Ex02DemSNT(1, 10000);
		Ex02DemSNT t2 =  new Ex02DemSNT(10000, 20000);
		t1.dem = dem;// cho bien dem cua t1,t2 cung tro den bien dem cua main 
		t2.dem = dem;
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("So cac snt: "+dem[0]);
		//	long time2 = System.nanoTime();
		long time2 = System.currentTimeMillis();
		System.out.println("tong thoi gian chay: "+(time2-time1));
	}
}
