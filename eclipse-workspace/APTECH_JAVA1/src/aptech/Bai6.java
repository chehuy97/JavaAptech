package aptech;

import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,S=0; 
		do {
			System.out.println("nhap so nguyen: ");
			a = sc.nextInt();
			S+=a;
		}while(a!=0);
		System.out.println(S);
	}
}
