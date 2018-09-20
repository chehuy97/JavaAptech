package ss7;

import java.util.Scanner;

public class TestStringManipulation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String mString = scanner.nextLine();
		char mchar = scanner.next().charAt(0);
		StringManipulation sm = new StringManipulation();
		if (sm.checkCharacter(mString, mchar) == true) {
			System.out.println("co ky tu " + mchar + " trong chuoi " + mString);
		} else
			System.out.println("khong co ky tu " + mchar + " trong chuoi " + mString);
	}

}
class StringManipulation{
	
	boolean checkCharacter(String n,char a) {
		
		for(int i=0;i<n.length();i++) {
			if (a == n.charAt(i)) {
				return true;
			}
		}
			
			return false;
	}
}
