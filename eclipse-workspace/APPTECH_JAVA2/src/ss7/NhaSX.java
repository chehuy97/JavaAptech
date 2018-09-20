package ss7;

import java.util.Random;

public class NhaSX extends Thread {
	String name;
	StringBuilder khohang;

	public NhaSX(String name, StringBuilder khohang) {
		super();
		this.name = name;
		this.khohang = khohang;
	}

	@Override
	public void run() {
		while (true) {
			if (khohang.length() == 10) {
				System.out.println("kho hang day,tam nghi...");
				try {
					khohang.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println("kho hang: " + khohang);
				int sp = new Random().nextInt(11);
				System.out.println("nha sx " + name + " da sx " + sp);
				khohang.append(sp);
			}
			Tools.sleep(300);
		}
	}
}


