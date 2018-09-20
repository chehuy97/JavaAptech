package ss1;

import java.util.Scanner;

public class HK_Ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] a = new String[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextLine();
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
