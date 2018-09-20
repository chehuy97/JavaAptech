package giuaki;

import java.util.Scanner;

public class bai02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		System.out.println("Uoc chung lon nhat la: "+UCLN(a,b));
	}
	public static double UCLN(long a,long b) {
		while(a!=b) {
			if(a>b) a=a-b;
			if(b>a) b=b-a;	
		}
		return a;
	}
}
