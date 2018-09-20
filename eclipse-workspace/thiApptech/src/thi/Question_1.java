package thi;

import java.util.Scanner;

public class Question_1 {
	public static void main(String[] args) {
		int dem = 0;
		for(int i=1;i<=200;i++) {
			if(i%2==0 || i%6==0) {
				System.out.println(i);
				dem++;
			}
		}
		System.out.println("Co "+dem+" so chia het cho 2 va 6");
	}
}
