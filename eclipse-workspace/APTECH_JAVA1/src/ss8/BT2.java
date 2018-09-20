package ss8;

import java.util.Scanner;

public class BT2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s=0;
		int[] m = new int[n];
		for(int i =0;i<m.length;i++) {
		m[i] = sc.nextInt();
		s+=m[i];
	}
		for(int i =0;i<m.length;i++) {
			System.out.print(m[i]+" ");
	}	
		double p=(double)s/n;
		System.out.println("Trung binh cong la: "+p);
		System.out.print("Cac so lon hon trung binh cong la: ");
		for(int i=0;i<=m.length;i++) {
			if(m[i]>p) {
				System.out.print(m[i]+" ");
			}
		}
	}
}
