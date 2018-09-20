package lab7;

import java.util.ArrayList;

import ss7.Tools;

public class LaySoNguyen extends Thread{
	ArrayList<Integer> mList;
	
	public LaySoNguyen( ArrayList<Integer> mList) {
		super();
		this.mList = mList;
	}

	@Override
	public void run() {
			while(true) {
				synchronized (mList) {
				if(mList.size()==0) {
					System.out.println("mang trong,tam cho...");
					try {
						mList.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else {
					System.out.println(Thread.currentThread().getName()+" da lay phan tu: "+mList.get(mList.size()-1));
					mList.remove(mList.size()-1);
					mList.notify();
				}
				Tools.sleep(500);
			}
		}
	}
}
