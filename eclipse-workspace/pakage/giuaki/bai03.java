package giuaki;

import java.util.Scanner;

public class bai03 {
	public static void main(String[] args) {
		System.out.println("nhap 1 so: ");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int d=0,i=2;
		while( k!=d) {
			if (kiemtrasnt(i) == 1) d++;
			i++;
		}
		System.out.println("so nguyen to la " +(i-1));
		
	}

	public static long kiemtrasnt(int n) {
	if (n < 2 ) return 0;
	double S = Math.sqrt(n);
	for(int i=2;i<=S;i++)
	{
		if (n%i== 0) return 0;
	}
	return 1;
}
}

