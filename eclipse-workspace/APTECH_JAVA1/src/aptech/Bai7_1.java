package aptech;

import java.util.Scanner;

public class Bai7_1 {
	 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a; 
			do {
				System.out.println("nhap so nguyen: ");
				a = sc.nextInt(10*100);
				if(a%2==0) System.out.println("day la so chan");
				if(a%2!=0) System.out.println("day la so le");
			}while(a!=0);
		}
	}

