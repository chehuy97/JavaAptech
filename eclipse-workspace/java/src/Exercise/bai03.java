package Exercise;

import java.util.Scanner;

public class bai03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
	if(a<=b && b<=c) System.out.println("so o giua la :"+ b);
	else if(a<=c && c<=b) System.out.println("so o giua la :"+ c);
	else if(b<=a && a<=c) System.out.println("so o giua la :"+ a);
	else if(b<=c && c<=a) System.out.println("so o giua la :"+ c);
	else if(c<=a && a<=b) System.out.println("so o giua la :"+ a);
	else if(c<=b && b<=a) System.out.println("so o giua la :"+ b);
	}
	
}
