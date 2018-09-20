package ss7;

public class Calculator {
	public int Max(int a,int b,int c) {
		int Max=a;
		if(Max<b) Max =b;
		if(Max<c) Max =c;
		return Max;		
	}
	public double Average(int a,int b,int c) {
		double d = (a+b+c)/3.0;
		return d;
	}
}
