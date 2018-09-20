package Exercise;

import java.util.Scanner;

public class bai16 {
	public static void main(String[] args) {
		System.out.println("nhap 1 so: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			System.out.println("" +fibonaci(i));
		}
	}
	public static long fibonaci(int n) {
		if (n==0) return 0;
		if (n==1) return 1;
		else return fibonaci(n-1)+fibonaci(n-2);
	}
}
