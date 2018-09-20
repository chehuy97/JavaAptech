package Chuoi;

import java.util.Scanner;

public class XoaKyTuKhoangTrang {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String mString = scanner.nextLine().trim();
		StringBuilder mBuilder = new StringBuilder();
		for(int i=0;i<mString.length();i++) {
//			for(int j=i+1;j<mString.length()-1;j++) {
//			int j=i+1;
//				if(mString.charAt(i)==mString.charAt(j) && mString.charAt(j)==' ') {
//					mBuilder.delete(i,j);	
//				}
			if(mString.charAt(i)!=' ') mBuilder.append(mString.charAt(i));
            else if(mString.charAt(i)==' '){
                mBuilder.append(' ');
                while(mString.charAt(i)==' ') i++;
			}
		}
		System.out.println(mBuilder);
	}
}
//public static void main(String[] args) {
//    Scanner input=new Scanner(System.in);
//    String str=input.nextLine().trim();
//    StringBuilder stb=new StringBuilder();
//    for(int i=0;i<str.length();i++){
//        if(str.charAt(i)!=' ') stb.append(str.charAt(i));
//        else if(str.charAt(i)==' '){
//            stb.append(' ');
//            while(str.charAt(i)==' ') i++;
//        }
//    }
//    System.out.println(stb);       
//}