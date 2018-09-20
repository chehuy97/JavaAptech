package Exercise;

import java.util.Scanner;

public class bai17 {
	public static void main(String[] args) {
//		System.out.println("nhap 1 so: ");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int s=0,p=0,q=1;
//	while(p+q<n) {
//		s=p+q;
//		p=q;
//		q=s;		
//	}
//	if(s==n) System.out.println("day la so fibonaci");
//	if(s!=n) System.out.println("day k phai la so fibonaci");
//	}
//	public static long fibonaci(int n) {
//		if (n==0) return 0;
//		if (n==1) return 1;
//		else return fibonaci(n-1)+fibonaci(n-2);
//	}
		int i,d=0; 
		System.out.print("n = "); 
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt(); 
		   for(i=0;i<=n;i++) {
		       if(n==fibonaci(i)) 
		       { 
		            d++;             
		       } 
		   }
		   if(d==1) System.out.println("n thuoc day fibonacci"); 
		   else if(d==0) System.out.println("n khong thuoc day fibonacci"); 
}
	public static long fibonaci(int n) {
		if (n==0) return 0;
		if (n==1) return 1;
		else return fibonaci(n-1)+fibonaci(n-2);
	}
	}
