package giuaki;

import java.util.Scanner;

public class bai04 {
//	public static void main(String[] args) {
//		long a,b;
//		String s;	
//		s=nhapchuoi("nhap chuoi s");
//		s=chuan_hoa_chuoi(s);
//		System.out.println("chuoi sau khi duoc chuan hoa: " +s);
//		
//		
//		
//		
//		
//		
//		
//	}
//	public static String chuan_hoa_chuoi(String s)
//	{
//		s=s.trim();
//		int i=0, j=i+1;
//		for (i=0;i<s.length();i++)
//		{    j=i+1;
//			if((s.charAt(i)== ' ') && (s.charAt(j)== ' '))
//			{
//				s=remove(s,j);
//				--i;
//				
//			}
//		}
//		return s;
//	}
//	public static String remove(String s, int pos)
//	{
//		return s.substring(0,pos) +s.substring(pos+1);
//	}
//	public static String nhapchuoi(String str)
//	{	System.out.println(str);
//		Scanner scan= new Scanner(System.in);
//		String s;
//		s=scan.nextLine();
//		return s;
//	}
		public static void main(String[] args) {
			long a,b;
			String s;	
			s=nhapchuoi("nhap chuoi s");
			s=chuanhoachuoi(s);
			System.out.println("chuoi sau khi duoc chuan hoa: " +s);
		}
		public static String remove(String s,int pos) {
			return s.substring(0,pos) +s.substring(pos+1);
		}
		public static String chuanhoachuoi(String s) {
			s=s.trim();
			int j;
			for(int i=0;i<s.length();i++) {
				j=i+1;
				if((s.charAt(i)==' ') && (s.charAt(j) == ' ')) {
					s=remove(s,j);
					--i;
				}
				
			}
			return s;
		}
		public static String nhapchuoi(String str)
		{	System.out.println(str);
			Scanner scan= new Scanner(System.in);
			String s;
			s=scan.nextLine();
			return s;
		}
}
