package ss1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_Demo {
	public static void main(String[] args) {
		
	Scanner scanner =  new Scanner(System.in);
	
	System.out.println("Nhap vao 2 so nguyen: ");
	try {
	System.out.print("a = ");
	int	a= scanner.nextInt();
	System.out.print("b= ");
	int b = scanner.nextInt();
	System.out.println(a+"/"+b+" = "+a/b);
	}catch (ArithmeticException |InputMismatchException e) {
		// TODO: handle exception
//		System.out.println("k co phep chia 0");
		e.printStackTrace();
//		System.out.println(e.getMessage());
//		System.out.println(e.toString());
	}
//	catch(InputMismatchException e) {
//		e.printStackTrace();
//	}
	finally {
		System.out.println("finally block");
	}
	
	System.out.println("End of main");
}
}
