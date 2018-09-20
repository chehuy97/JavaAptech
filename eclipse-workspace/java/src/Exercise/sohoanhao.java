package Exercise;

import java.time.DayOfWeek;
import java.util.Scanner;

public class sohoanhao {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int n = scanner.nextInt();
		timsohoanhao(n);
	}
	public static void timsohoanhao(int n) {
		int t=1;
		for(int i=2;i<n;i++){
			if(n%i==0) t+=i;
		}
		if(n==t) System.out.println("day la so hoan hao");
		else {
			System.out.println("day k phai so hoan hao");
		}
	}
}
