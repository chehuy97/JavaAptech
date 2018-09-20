package ss8;

import java.util.ArrayList;
import java.util.Scanner;

public class BT5 {
	private ArrayList arrayList;
	private int s=0;
	public void inputArrayList() {
		arrayList = new ArrayList<>();
		Scanner scanner =  new Scanner(System.in);
		int n = scanner.nextInt();
		while(n!=0) {
			arrayList.add(n);
			s+=n;
			n = scanner.nextInt();
		};
	}
	public void getArrayList() {
		for(int i=0;i<arrayList.size();i++) {
			System.out.print(arrayList.get(i)+" ");
		}
	}
	public double Average() {
		return s/arrayList.size();
	}	
	public static void main(String[] args) {
		BT5 bt=new BT5();
		bt.inputArrayList();
		bt.getArrayList();
		System.out.println("Trung binh cong: "+(double)bt.Average());
	
}
}

