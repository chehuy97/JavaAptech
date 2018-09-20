package Chuoi;

import java.util.Scanner;
public class DaoNguocxau {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String aString = scanner.nextLine();
//		char[] dao = aString.toCharArray();//chuyen xau thanh mang ky tu;
//		for(int i=0;i<aString.length()/2;i++ ) {
//			  char temp=dao[i];
//			  
//	          dao[i]=dao[dao.length-i-1];
//	 
//	          dao[dao.length-i-1]=temp;
//		}
//	     String ketqua= String.valueOf(dao);
//	     
//	     System.out.println("xau dao: "+ketqua);
		StringBuilder mBuilder = new StringBuilder(aString);
		System.out.println(mBuilder.reverse());
		
	}
}
