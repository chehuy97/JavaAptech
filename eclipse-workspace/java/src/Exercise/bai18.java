package Exercise;

import java.util.Scanner;

public class bai18 {
	public static void main(String[] args) {
		System.out.println("nhap a,b: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("uoc chung lon nhat: "+UCLN(a,b));
		System.out.println("boi chung nho nhat: "+BCNN(a,b));
	}
	public static int UCLN(int a,int b) {
		while(a!=b) {
		if( a > b) a= a-b;
		else b=b-a;
		}
		return a;
	}
	public static int BCNN(int a,int b) {
		int t = UCLN(a,b);
		return a*b/t;
	}
}
