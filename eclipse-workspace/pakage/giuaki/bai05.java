package giuaki;

import java.util.Scanner;

public class bai05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		
		s+=1;
		if (s>=60){
			s=0;
			m+=1;
			if (m>=60){
				m=0;
				h+=1;
				if (h==24) h=0;
			}
		}
		System.out.println(h + ":" + m + ":" + s);

	}
	
}
