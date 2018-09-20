package ss8;

import java.util.Scanner;

public class bt1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s=0;
		int[] m = new int[n];
		for(int i =0;i<n;i++) {
		m[i] = sc.nextInt();
		s+=m[i];
	}
		for(int i =0;i<n;i++) {
			System.out.print(m[i]+" ");
	}
		System.out.println();
		System.out.println(s);
}
}
