package bt_tulam;

import java.util.Scanner;

public class xapxepmang {
	public static void main(String[] args) {
		int temp = 0;
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		
		xapxepmang(a);
		
	}
	
	public static void xapxepmang(int[] a) {
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
