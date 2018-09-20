
import java.math.BigInteger;
import java.util.Scanner;

public class BaiA { 
	
	public static void main(String[] args){
		long decimal;
		Scanner sc = new Scanner(System.in);
		decimal = sc.nextLong();
		String Binary = Long.toBinaryString(decimal).toString();
		BigInteger BinaryBig = new BigInteger(Binary,10);
		System.out.println(BinaryBig);
	}

}
