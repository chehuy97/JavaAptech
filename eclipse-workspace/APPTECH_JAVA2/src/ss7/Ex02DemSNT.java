package ss7;

public class Ex02DemSNT extends Thread{
	int a;
	int b;
	int dem[];
	
	public Ex02DemSNT(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = a; i <= b; i++) {
			if(isSNT(i)) {
				synchronized(dem) {
					dem[0]++;
				}
			}
		}
		System.out.println(dem);
	}
	boolean isSNT(int n) {
		if(n<2) {
			return false;
		}else {
		for (int i = 2; i < n ; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
}