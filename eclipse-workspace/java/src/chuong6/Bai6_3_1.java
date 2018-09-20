package chuong6;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Bai6_3_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap chuoi: ");
		String mString = scanner.nextLine();
		String[] aString = mString.split("[ ?,;]");
		ArrayList<String> mList = new ArrayList<>();
		for(int i=0;i<aString.length;i++) {
			mList.add(aString[i]);
		}
		for (String string : mList) {
			System.out.println(string);
		}
//		LinkedHashSet<String> mSet = new LinkedHashSet<>();
//		for (int i = 0; i < aString.length; i++) {
//			mSet.add(aString[i]);
//		}
		String bString = mList.get(0); 
		for(int i=0;i<mList.size();i++) {
			int dem =1;
			for(int j=i+1;j<mList.size();j++) {
				if(bString.equals(mList.get(j))) {
					dem++;
				}
			}
			System.out.println("Co "+dem+" chu cai "+mList.get(i));
		}
	}
}
