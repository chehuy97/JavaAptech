package Exercise;

import java.util.Scanner;

public class bai07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap n=");
		int n = sc.nextInt();
		double S=15,a=1,b;
		for(int i=1;i<=n;i++)
		{	a*=i;
			b=Math.pow(-1,i);
		 S+=b/a;
	}
		System.out.println("gia tri cua tong la: "+ S);
}

}
