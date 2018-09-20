package aptech;

import java.util.Scanner;

public class Ss5_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(ktscp(n)==1) System.out.println("day la so chinh phuong");	
		if(ktscp(n)==0) System.out.println("day k la so chinh phuong");
	}
	public static int ktscp(int n) {
		for(int i =0;i<=n;i++) {
			if(n==i*i) return 1;		
		}
		return 0;
	}
}
