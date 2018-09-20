package aptech;

import java.util.Scanner;

public class bai3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ten = sc.nextLine();
		int TNCT = sc.nextInt();
		double hs =0;
		if(TNCT <= 12) {
		hs = 1.92;	
		}
		else if(TNCT >= 12 && TNCT <= 36) {
			hs = 2.34;	
			}
		else if(TNCT >= 36 && TNCT <= 60) {
			hs = 3;	
			}
		else if (TNCT >= 60) {
			hs = 4.5;	
			}
		double Luong = 650000*hs;
		System.out.printf("tien luong cua %s la %2.0f",ten,Luong);
		
		
	}
}
