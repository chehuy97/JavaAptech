package aptech;

import java.util.Scanner;

public class ss5_12 {
	 public static int ktsnt(int n) {
		if(n<2) return 0;
		double m = Math.sqrt(n);
		 for(int i=2;i<=m;i++) {
			 if(n%i==0) {
				 return 0;
			 }
		 }
		 return 1;
	 }
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(ktsnt(n)==1) System.out.println("day la so nguyen to");
		if(ktsnt(n)==0) System.out.println("day k phai la so nguyen to");
	}
}
