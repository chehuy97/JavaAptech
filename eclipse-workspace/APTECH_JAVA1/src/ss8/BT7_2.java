package ss8;

import java.util.Scanner;

public class BT7_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String mString = scanner.nextLine();
		StringBuilder mBuilder = new StringBuilder();
		int b=0;
		for(int i=0;i<mString.length();i++) {
			for(int j=i+1;j<mString.length();j++) {
				if(mString.charAt(i)== mString.charAt(j)) {
					b+=1;
				}
				else b+=0; 
			}
		}
		if(b!=0) System.out.println("co 2 ky tu giong nhau");
		else {
			System.out.println("k co 2 ky tu giong nhau");
		}
	}
}
