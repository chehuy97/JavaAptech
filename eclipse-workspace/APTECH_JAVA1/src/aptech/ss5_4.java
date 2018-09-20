package aptech;

import java.util.Scanner;

public class ss5_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		for (int i = 0, j = a.length() - 1; i < j; i++, j--) {
			if (a.charAt(i) == a.charAt(j))
				continue;
			if (a.charAt(i) != a.charAt(j)) {
				System.out.println("day k phai day doi xung");break;
			}
		}
		System.out.println("day la day doi xung");
	}
}
