package Exercise;


import java.util.Scanner;

public class bai09 {
	public static void main(String[] args) {
//		try {
			System.out.println("nhap n: ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			double S = giaithuakep(n);
			System.out.printf("giai thua kep la: %f", S);
//		} catch (Exception e) {
//			System.out.println("ban phai nhap so nguyen duong " + e);
//		}

	}

	public static int giaithuakep(int n){
			if (n == 1)
		
			return 1;
		if (n == 2)
			return 2;
		else
			return n * giaithuakep(n - 2);

	}
}
