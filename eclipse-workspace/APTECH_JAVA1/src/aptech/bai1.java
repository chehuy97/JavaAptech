package aptech;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {	
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	baitap1(a,b);
	
	System.out.println((a+b));
	System.out.println((a-b));
	System.out.println((a*b));
	System.out.println((a/b));
	
}
	public static void baitap1(int a,int b) {
		System.out.println("so nguyen la: "+a);
		System.out.println("so nguyen la: "+b);
		System.out.println("Single quote: ABCDE'FGHIJ");
		System.out.println("Double quote: ABCDE\"FGHIJ");
		System.out.println("Backslash: ABCDE\\FGHIJ");
		System.out.println("Horizontal tab : ABCDE\tFGHIJ");
	}
}