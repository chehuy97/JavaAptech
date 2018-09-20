package aptech;

import java.util.Scanner;

public class bai1_4 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	char a = sc.next().charAt(0);
	if(a == 'A' || a == 'a') System.out.println("ban da nhap ky tu " +a);
	else System.out.println(" ban nhap ngu vcl");
	int b = sc.nextInt();
	kts(b);
}
	public static void kts(int a) {
		if (a%2 == 1) System.out.println("day la so le");
		else System.out.println("day la so chan");
	}
}