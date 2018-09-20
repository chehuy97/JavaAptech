package ss8;

import java.util.ArrayList;
import java.util.Scanner;

public class BT5_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n =  scanner.nextInt();
		int s=0;
			ArrayList arr = new ArrayList<>();
			for(int i=0;i<n;i++) {
				int x = scanner.nextInt();
				arr.add(x);
				s+=x;
			}
			for(int i=0;i<n;i++) {
				System.out.print(arr.get(i)+" ");
			}
			System.out.println();
			System.out.println("tong: "+s);
			
	}
}
//class ArrayList{
//	void ArrayList() {
//		ArrayList arr = new ArrayList<>();
//		Scanner scanner = new Scanner(System.in);
//		for(int i;;i++) {
//			int x = scanner.nextInt();
//			arr.add(x);
//		}
//	}
//}
