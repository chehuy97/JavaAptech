package chuong6;

import java.util.LinkedList;
import java.util.Scanner;

public class Bai6_5 {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.print("nhap m: ");
		int m = scanner.nextInt();
		System.out.print("nhap n: ");
		int n = scanner.nextInt();
		int[][] a = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=scanner.nextInt();
			}
		}
		int p=1;
		for(int j=0;j<n;j++) {
			if(a[0][j]%3==0) {
				p*=a[0][j];
			}
		}
		System.out.println("tich cac so boi 3 dong dau tien cua ma tran a la: "+p);
		int[] b = new int[m];
		LinkedList ll = new LinkedList<>();
		for (int i = 0; i < m; i++) {
			int max=a[i][0];
			for (int j = 0; j < n; j++) {
				if(a[i][j]>max) {
					max=a[i][j];
				}
			}
			ll.add(max);
		}
		System.out.println("mang x");
		for (Object object : ll) {
			System.out.print(object+" ");
		}
		System.out.println();
		System.out.println("xoa phan tu dau mang: ");
		ll.removeFirst();
		for (Object object : ll) {
			System.out.print(object+" ");
		}
		
		
		
	}
}
