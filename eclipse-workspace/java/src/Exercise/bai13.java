package Exercise;

import java.util.Scanner;

public class bai13 {
	public static void main(String[] args) {
		System.out .println("nhap n: ");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		ktsodoixung(n);
	}
	public static void ktsodoixung(int n) {
		int temp,m=0,tam=n;
		while(tam>0) {
			temp = tam%10;
			m= m*10 + temp;
			tam = tam/10;
		}
		if(m==n) System.out .println("day la so doi xung");
		if(m!=n) System.out .println("day khong phai la so doi xung");
	}
}
