package Chuoi;

import java.util.Scanner;

public class KiemTraChuoi {
	public static void main(String[] args) {
		int a = 0, b = 0;
		Scanner scanner = new Scanner(System.in);
		String mString = scanner.nextLine();
		try {
			for (int i = 0; i <= mString.length(); i++) {
				if (mString.charAt(i) >= 48 && mString.charAt(i) <= 57) {
					a += 1;
					int j = i + 1;
					if (mString.charAt(j) == 46) {
						b += 1;
					}
				}
				if ((mString.charAt(i) >= 65 && mString.charAt(i) <= 90)
						|| (mString.charAt(i) >= 97 && mString.charAt(i) <= 122)) {
					a += 2;
				}
			}
		} catch (StringIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		if (a == mString.length())
			System.out.println(" day la chuoi so nguyen");
		else if (a == 2 * mString.length())
			System.out.println("day la chuoi ky tu");
		else if ((a == mString.length() - 1) && b == 1)
			System.out.println("day la so thuc");
		else {
			System.out.println("day k phai chuoi so nguyen");
		}
	}
}
