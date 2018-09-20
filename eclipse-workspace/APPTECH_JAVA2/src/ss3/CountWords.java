package ss3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountWords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao mot xau");
		String mString = scanner.nextLine().toLowerCase();
		String[] words = mString.split("[ ,.?:!@#$%^&*]+");
		HashSet hs = new HashSet<>();
		for (int i = 0; i < words.length; i++) {
			hs.add(words[i]);
			
		}
		int n = hs.size();
		System.out.println("so tu khac nhau trong xau: "+ n);
		
		for (Object object : hs) {
			System.out.println(object);
		}
	}
	}
