package lab7;

import java.util.ArrayList;
import java.util.Random;

import ss7.Tools;

public class SinhSoNguyen extends Thread {
	ArrayList<Integer> mList;
	

	public SinhSoNguyen( ArrayList<Integer> mList) {
		super();
		this.mList = mList;
	}


	@Override
	public void run() {
			while (true) {
				synchronized (mList) {
				if (mList.size() == 10) {
					System.out.println("Max,tam dung...");
					try {
						mList.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					Random rand = new Random();
					int n = rand.nextInt(10);
					mList.add(n);
					System.out.println(Thread.currentThread().getName()+" da them phan tu: "+n);
					mList.notify();

				}
				Tools.sleep(300);
			}
		}
	}
}
