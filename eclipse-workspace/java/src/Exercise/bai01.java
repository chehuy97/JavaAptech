package Exercise;

import java.util.Scanner;

public class bai01 {
	public static void main(String[] args) {
		 Scanner pt = new Scanner(System.in);
		double a = pt.nextDouble();
		double b = pt.nextDouble();
		if (a == 0) {
			if (b == 0)
				System.out.println("pt co VSN");
			if (b != 0)
				System.out.println("pt VN");
		} else
			System.out.println("phuong trinh co nghiem " + -b / a);
	}
}

