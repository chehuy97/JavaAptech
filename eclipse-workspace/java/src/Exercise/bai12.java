package Exercise;

import java.io.EOFException;
import java.util.Scanner;

public class bai12 {
	public static void main(String[] args) {
		try {System.out.println("nhap n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(kiemtrascp(n) == 1) System.out.println("day la so chinh phuong");
		if(kiemtrascp(n) == 0) System.out.println("day khong phai la so chinh phuong");
		}catch(Exception e)
		{
			System.out.println("ban phai nhap so nguyen "+e);
		}
		
	}
	public static int kiemtrascp(int n) {
		for(int i=0;i<=n;i++)
		{
			if (i == Math.sqrt(n)) return 1;
		}
		return 0;
	}
}
