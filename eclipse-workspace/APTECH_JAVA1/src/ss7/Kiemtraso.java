package ss7;

import java.util.Scanner;

public class Kiemtraso {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		SoNguyenTo snt = new SoNguyenTo();
		snt.checkPrime(n);
		if(snt.kiemtrasnt(n)==1) System.out.println("day la so nguyen to");
		else System.out.println("day k la so nguyen to");

	}
}
