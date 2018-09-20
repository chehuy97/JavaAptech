package Chuoi;

import java.util.Scanner;

public class TimKiemktu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String aString = scanner.next();
		char bString = scanner.next().charAt(0);
		int d =0;
		for(int i =0;i<aString.length();i++) {
			if(bString == aString.charAt(i)) d++;
		}
		System.out.println("so "+bString+" co trong chuoi: "+d);
	}
}