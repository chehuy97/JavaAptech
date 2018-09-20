package Exercise;

import java.util.Scanner;

public class bai08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap n=");
		double n = sc.nextDouble();
		double S=0,a;
		for(int i=1;i<=n;i++)
		{	a=2*i-1;
		 S+=1/a;
	}
		System.out.println("gia tri cua tong la: "+ S);
}

}
