package Exercise;

import java.util.Scanner;

import java.util.Scanner;

public class bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap thang va nam: ");
		int a = sc.nextInt();
		
		double b = sc.nextDouble();
		
		switch(a){
		case 1:
			System.out.println("thang 1 co 31 ngay");break;
		case 2:
			System.out.println("thang 2 co 28 ngay");break;
		case 3:
			System.out.println("thang 3 co 31 ngay");break;
		case 4:
			System.out.println("thang 4 co 30 ngay");break;
		case 5:
			System.out.println("thang 5 co 31 ngay");break;
		case 6:
			System.out.println("thang 6 co 30 ngay");break;
		case 7:
			System.out.println("thang 7 co 31 ngay");break;
		case 8:
			System.out.println("thang 8 co 31 ngay");break;
		case 9:
			System.out.println("thang 9 co 30 ngay");break;
		case 10:	
			System.out.println("thang 10 co 31 ngay");break;
		case 11:
			System.out.println("thang 11 co 30 ngay");break;
		case 12:
			System.out.println("thang 12 co 31 ngay");break;
		default: System.out.println("k phai 1 thang trong nam");break;	
		}
	if(b%4==0 && b%100!=0) 	System.out.printf("nam %4.0f co 366 ngay",b);
	else if(b%4!=0 || b%100==0) System.out.printf("nam %4.0f co 365 ngay",b);
	
		
	}
}
