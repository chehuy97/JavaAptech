package Exercise;

import java.util.Scanner;

public class bai14 {
	public static void main(String[] args) {
			System.out.println("nhap 1 so: ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			for(int i = 0;i<=n;i++)
			{
				if(kiemtrasnt(i) == 1)
					System.out.println(""+i);
					
			}
	}
	public static int kiemtrasnt(int n) {
		if (n < 2 ) return 0;
		double S = Math.sqrt(n);
		for(int i=2;i<=S;i++)
		{
			if (n%i== 0) return 0;
		}
		return 1;
	}
	

}
