package Exercise;

import java.util.Scanner;

public class bai06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap n=");
		double n = sc.nextDouble();
		double S=0;
		for(int i=1;i<=n;i++)
		{ S+=1.0/i;
	}
		System.out.println("gia tri cua tong la: "+ S);
}
}
