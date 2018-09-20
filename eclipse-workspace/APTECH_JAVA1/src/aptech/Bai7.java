package aptech;

import java.util.Scanner;

public class Bai7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a; 
		do {
			System.out.print("nhap chu cai: ");
			a = sc.nextLine();
		}while(a.equals("X")==false);
	}
}
