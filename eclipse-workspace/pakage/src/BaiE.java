import java.math.BigInteger;
import java.util.Scanner;

public class BaiE {
	public static void main(String[] args) {
		String x;
		String y;
		x=nhap();
		y=nhap();
		
		BigInteger a = new BigInteger(x,10);
		BigInteger b = new BigInteger(y,10);
		BigInteger mul = new BigInteger("35153468464",10);
		mul=a.multiply(b);
		System.out.println(mul);
	}
	public static String nhap()
	{
		
		Scanner scan= new Scanner(System.in);
		String n;
		n=scan.nextLine();	
		return n;
		
	}
	
}
