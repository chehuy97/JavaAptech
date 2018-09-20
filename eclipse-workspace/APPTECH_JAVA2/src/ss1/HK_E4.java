package ss1;

import java.util.Scanner;

public class HK_E4 {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		String mString = scanner.nextLine();
		try {
			HK_E4_checkString.checkString(mString);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
