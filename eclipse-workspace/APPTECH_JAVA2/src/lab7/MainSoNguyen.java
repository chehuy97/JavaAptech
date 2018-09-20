package lab7;

import java.util.ArrayList;

public class MainSoNguyen {
	public static void main(String[] args) {
		ArrayList<Integer> mList = new ArrayList<>();
		SinhSoNguyen t1 = new SinhSoNguyen(mList);
		t1.setName("Kurumi");
		LaySoNguyen t2 =  new LaySoNguyen(mList);
		t2.setName("Aturia");
		t1.start();
		t2.start();
	}
}
