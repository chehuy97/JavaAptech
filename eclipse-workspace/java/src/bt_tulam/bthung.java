package bt_tulam;

import java.util.Scanner;

import Exercise.sohoanhao;

public class bthung {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.print("nhap n= ");
		int n = scanner.nextInt();
		int t1=0,t2=0;
		for (int i = 1; i <= n; i++) {
			t1=TongUoc(i);
			t2 = TongUoc(t1);
			if(i==t2 && i!=t1) System.out.println("2 so "+i+" va "+t1+" la 2 so can tim co tong: "+(i+t1));
		}
		
	}
	public static int TongUoc(int a) {
		int t=1;
		for(int i=2;i<a;i++){
			if(a%i==0) t+=i;
		}
		return t;
	}
}
