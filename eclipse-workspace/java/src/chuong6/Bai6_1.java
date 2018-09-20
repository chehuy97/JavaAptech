package chuong6;

import java.util.Scanner;

public class Bai6_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap a: ");
		int a = scanner.nextInt();
		System.out.print("nhap b: ");
		int b = scanner.nextInt();
		System.out.print("Uoc chung lon nhat cua 2 so a va b la: "+ucln(a, b));
		System.out.println();
		System.out.print("Boi chung nho nhat cua 2 so a va b la: "+bcnn(a, b));
	}
	public static int ucln(int a,int b) {
		while(a!=b) {
			if(a>b) {
				a=a-b;
			}
			if(b>a) {
				b=b-a;
			}
		}
		return a;	
	}
	public static int bcnn(int a,int b) {
		return (a*b)/ucln(a, b);
	}
	
}
