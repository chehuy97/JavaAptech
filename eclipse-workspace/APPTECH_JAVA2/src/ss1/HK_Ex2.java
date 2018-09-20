package ss1;

import java.util.Scanner;

public class HK_Ex2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=scanner.nextInt();
		}
//		for (int i = 0; i <=a.length; i++) {
//			System.out.println(a[i]);
//		}
		System.out.print("nhap phan tu can truy cap: ");
		int n = scanner.nextInt();
		try {
		System.out.println(a[n-1]);
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(" loi roi ban oi");
		}
	}
}
