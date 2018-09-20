package aptech;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 =  sc.nextDouble();
		double result,result1,kq;
		result =  (num1>num2) ? num1:num2;
		result1 =  (num1<num2) ? num1:num2;
		System.out.println("max: "+result+' ' +"min: " + result1);
		kq = (num3<=0) ? -num3:num3;
		System.out.println("gttd: "+kq);
	}
}
