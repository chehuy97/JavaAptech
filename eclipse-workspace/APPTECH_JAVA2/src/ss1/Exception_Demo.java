package ss1;

import java.util.Scanner;

public class Exception_Demo {
	
	public static void main(String[] args) {
		int a=0;
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Nhap vao 2 so nguyen: ");
		System.out.print("a = ");
		try {
			a= scanner.nextInt();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("asdsad");
		}
		System.out.print("b= ");
		int b = scanner.nextInt();
		try {
		System.out.println(a+"/"+b+" = "+a/b);
		}catch (ArithmeticException e) {
			// TODO: handle exception
//			System.out.println("k co phep chia 0");
			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println(e.toString());
		}
		finally {
			System.out.println("dang nao bo may cx dc in ra");
		}
		
		System.out.println("End of main");
	}
}
