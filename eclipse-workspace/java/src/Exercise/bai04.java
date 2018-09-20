package Exercise;

import java.util.Scanner;

public class bai04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap gio bat dau hat: ");
		    double a = sc.nextDouble();
		    System.out.print("nhap gio ket thuc: ");  
		    double b = sc.nextDouble();
		    double c;
		  if((b-a)<=18)  
			  c = (b-a)*45000;
		  else
			  c = (b-a)*60000;
		  System.out.println("so tien phai tra la: "+c);
		}
}
