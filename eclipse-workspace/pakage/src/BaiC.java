

import java.util.Scanner;
import java.math.BigInteger;

public class BaiC {
	  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		String strA = String.valueOf(a);
		String strB = String.valueOf(b);
		String strC = String.valueOf(c);
		
		BigInteger m = new BigInteger(strA,10);
		BigInteger n = new BigInteger(strB,10);
		BigInteger k = new BigInteger(strC,10);
		BigInteger p = new BigInteger("123456",10);
		
		p= m.modPow(n,k);
		
		System.out.println("gia tri la "+p);
		
		
		
		
		
		
	}
	  
  }
