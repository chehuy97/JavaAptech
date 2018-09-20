package ss7;

import java.util.Scanner;

public class TestMaxMin {
	public static void main(String[] args) {
		MaxMin mm = new MaxMin();
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("max: "+mm.Max(a, b));
		System.out.println("max: "+mm.Max(a, b));
		System.out.println("min: "+mm.Min(a, b));
		System.out.println("min: "+mm.Min(a, b));
	}
}
class MaxMin {
	private int a,b;
	private int x,y;
	
	int Max(int a,int b) {
		int max =a;
		if(a<b) max =b;
		return max;
	}
	double Max(double a,double b) {
		double max =a;
		if(a<b) max =b;
		return max;
	} 
	int Min(int a,int b) {
		int min =a;
		if(a>b) min =b;
		return min;
	}
	double Min(double a,double b) {
		double min =a;
		if(a>b) min =b;
		return min;
	}
	
	
}
