package aptech;

import java.util.Scanner;

public class bai2_2 {
	public static void main(String[] args) {
	final double PI = 3.14;	
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhap ban kinh = ");
	double r = sc.nextDouble();
	System.out.println("Chu vi = "+(r*2*PI));
	System.out.println("Dien tich = " +(r*r*PI));
}
}	
