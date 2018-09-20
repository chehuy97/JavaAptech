package ss7;

import java.util.Random;

public class NhaTD extends Thread {
	String name;
	StringBuilder khohang;
	
	public NhaTD(String name, StringBuilder khohang) {
		super();
		this.name = name;
		this.khohang = khohang;
	}

	@Override
	public void run() {
		synchronized (khohang) {
			if(khohang.length()==0) {
				System.out.println("het hang !!!");
				System.out.println(name+" phai cho doi...");
				try {
					khohang.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				System.out.println("kho hang: "+khohang);
				char sp = khohang.charAt(khohang.length()-1);
				System.out.println("nha tieu dung "+name+" da mua "+sp);
				khohang.deleteCharAt(khohang.length()-1);
				khohang.notify();
			}
			Tools.sleep(500);
		}
	}
}
