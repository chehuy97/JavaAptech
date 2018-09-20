package Exercise;

import java.util.Scanner;

public class bai10 {

public static void main(String[] args) {
	System.out.println("Nhap n: ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("Tong cua so nguyen n la = " +tong(n));
	System.out.println("Tich cua so nguyen n la = " +tich(n));
	
	
}
	public static int tong(int n) {
		    int S = 0;
		    while (n > 0)
		    {
		        int t = n % 10;

		        S = S + t; 

		        n = n / 10;
		    }
		    return S;
	}
	public static int tich(int n) {
	    int P = 1;
	    while (n > 0)
	    {
	        int t = n % 10;

	        P = P * t; 

	        n = n / 10;
	    }
	    return P;
}
}
