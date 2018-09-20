package chuong6;

import java.util.Scanner;
import java.util.TreeSet;

public class Bai6_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap n: ");
		int n= scanner.nextInt();
		int a[] =new int[n];
		System.out.println("nhap mang: ");
		for(int i=0;i<n;i++) {
			a[i]=scanner.nextInt();
		}
		int sl=0;
		for(int i=0;i<n;i++) {
			if(a[i]%2==1) {
				sl+=a[i];
			}
		}
		System.out.println("Tong cac so le trong mang: "+sl);
		TreeSet<Integer> ts = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			ts.add(a[i]);
		}
		System.out.println("xap xep mang theo thu tu tang dan: ");
		for (Integer integer : ts) {
			System.out.print(integer+" ");
		}
		System.out.println();
		System.out.print("chen phan tu p: ");
		int p = scanner.nextInt();
		System.out.println("xap xep mang theo thu tu tang dan co chen p: ");
		ts.add(p);
		for (Integer integer : ts) {
			System.out.print(integer+" ");
		}
	}
}
