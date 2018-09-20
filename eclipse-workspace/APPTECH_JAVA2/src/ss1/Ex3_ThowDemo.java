package ss1;

import java.util.Scanner;

public class Ex3_ThowDemo {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Nhap vao 2 so nguyen: ");
		System.out.print("a = ");;
		int a= scanner.nextInt();
		System.out.print("b= ");
		int b = scanner.nextInt();
		try {
			if(b==0) {
				throw new ArithmeticException();
			}else {
				System.out.println(a+"/"+b+" = "+(1.0*a/b));
			}
			
			}catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}
}
