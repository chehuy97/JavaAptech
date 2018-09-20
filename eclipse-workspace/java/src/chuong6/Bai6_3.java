package chuong6;

import java.util.Scanner;

public class Bai6_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap chuoi: ");
		String mString = scanner.nextLine();
		char[] c = mString.toCharArray();
		System.out.println("in tung ky tu chuoi tren moi dong: ");
		for (char d : c) {
			System.out.println(d);
		}
		System.out.println("so tu co trong chuoi: " + c.length);
		char w = 'a';
		for (int i = 0; i < 26; i++) {
			int dem = 0;
			for (int j = 0; j < c.length; j++) {
				if (w == c[j] || (w-32)==c[j]) {
					dem++;
				}
			}
			if(dem!=0) {
				System.out.println("Co "+dem+" chu cai "+w);
			}
			w++;
		}
	}
}
