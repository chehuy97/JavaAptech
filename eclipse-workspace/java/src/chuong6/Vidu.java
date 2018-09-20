package chuong6;

import java.util.Scanner;

public class Vidu{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String aString = "";
	for(int i=0;i<=n;i++) {
		if(kiemtrasnt(i)==1) {

		}
	}
  }
public static int kiemtrasnt(int n) {
	if (n < 2 ) return 0;
	for(int i=2;i<n;i++)
	{
		if (n%i== 0) return 0;
	}
	return 1;
}
//public static string insnt(int n) {
//	for(int i=0;i<=n;i++) {
//		if(kiemtrasnt(i)==1) {
//			System.out.print(i+" ");
//		}
//	}
//}
}
