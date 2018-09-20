
import java.util.Scanner;

public class BaiB {
 public static void main(String[] args) {
    long s1=0,t;
	String s;
	Scanner sc = new Scanner(System.in);
	do {
	s1=sc.nextLong();
	if (s1<=0) System.out.println(" nhap lai!");
	}
	while(s1<=0);
	s = String.valueOf(s1);

	t=s1;
	double tong = 0;
	while (t!=0)
	{
		tong+=Math.pow((t%10),s.length());
		t/=10;	
	}
	
	if (tong==s1)
			System.out.println("YES");
	else System.out.println("NO");
 
}
}