package Chuoi;

import java.util.Scanner;

public class DemXau {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String mString = scanner.nextLine();
		int length=mString.length();
		int number=0,word=0;
		for(int i=0;i<length;i++) {
			if(mString.charAt(i)>=65 && mString.charAt(i)<=90) {
				word++;
			}
			if(mString.charAt(i)>=97 && mString.charAt(i)<=122) {
				word++;
			}
			if(mString.charAt(i)>=48 && mString.charAt(i)<=57) {
				number++;
			}	
		}
		System.out.println("so tu: "+length);
		System.out.println("so chu: "+word);
		System.out.println("so so: "+number);
	}
}
