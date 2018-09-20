package chuong6;

import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai6_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap chuoi: ");
		String mString = scanner.nextLine();
		StringBuilder mBuilder = new StringBuilder(mString);
		System.out.println("chuoi dao nguoc la: " + mBuilder.reverse());
		System.out.println("chuoi chu hoa la: " + mString.toUpperCase());
		System.out.println("chuoi chu thuong la: " + mString.toLowerCase());
		hoathuong(mString);
	}

	public static void hoathuong(String a) {
		char[] s = a.toCharArray();
		for (int i = 0; i < s.length; i++) {
			if (s[i] >= 65 && s[i] <= 90) {
				s[i] += 32;
			} else if (s[i] >= 97 && s[i] <= 122) {
				s[i] -= 32;
			}
		}
		System.out.print("chuoi hoa thuong la: ");
		for (char c : s) {
			System.out.print(c);
		}
	}
}
