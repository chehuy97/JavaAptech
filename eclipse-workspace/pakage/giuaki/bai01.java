package giuaki;

import java.util.Scanner;

public class bai01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		double M = Math.pow(10, 9) + 7;
		long S = (long) (Math.pow(a,b)%M);
		System.out.println("gia tri cua phep toan:" + S);
	}
	
}
