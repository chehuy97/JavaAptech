package ss7;

import java.util.Scanner;

public class TestData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Calculator cal = new Calculator();
		System.out.println("Max: "+cal.Max(a, b, c));
		System.out.println("Average: "+cal.Average(a, b, c));
	}
}
