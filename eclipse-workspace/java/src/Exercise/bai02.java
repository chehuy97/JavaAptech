package Exercise;

import java.util.Scanner;

public class bai02 {
	public static void main(String[] args) {
		Scanner pt = new Scanner(System.in);
		double a = pt.nextDouble();
		double b = pt.nextDouble();
		double c = pt.nextDouble();
		if (a == 0) {
			if (b == 0) {
				if (c == 0)
					System.out.println("pt co VSN");
				if (c != 0)
					System.out.println("pt VN");
			}
			if (b != 0)
				System.out.println("phuong trinh co nghiem: " + (-b / c));
		}
		if (a != 0) {
			double d = b * b - 4 * a * c;
			if(d<0) {
				System.out.println("pt VN");
			}
			if (d == 0) {
				System.out.println("pt co nghiem kep: " + (-b / (2 * a)));
			}
			if (d > 0) {
				System.out.println("Phuong trinh co 2 nghiem");
				System.out.println("x1 = " + ((-b + Math.sqrt(d)) / (2 * a)));
				System.out.println("x2 = " + ((-b - Math.sqrt(d)) / (2 * a)));
			}
		}
	}
}	

