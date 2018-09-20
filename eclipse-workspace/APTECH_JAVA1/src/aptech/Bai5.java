package aptech;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		switch(a){
			case "a": System.out.println("Assembly");break;
			case "b": System.out.println("Android");break;
			case "c": System.out.println("C");break;
			case "d": System.out.println("Java");break;
			case "e": System.out.println("C#");break;
			case "f": System.out.println("PHP");
			default : System.out.println("bam d' j co hieu cm j dau");
		}
		
	}
	
}
