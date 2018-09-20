package ss7;

import java.util.Random;
import java.util.Scanner;

public class GameDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,score=0,total=0,result;
		Random rand = new Random();
		System.out.println("nhap thoi gian choi(phut): ");
		int time = scanner.nextInt();
		TimeOut t = new TimeOut(score, total, time);
		t.start();
		while(true) {
			a =rand.nextInt(51);
			b=rand.nextInt(51);
			System.out.print(a+" + "+b+" = ");
			result=scanner.nextInt();
			total++;
			t.setTotal(total);
			if(a+b==result) {
				score++;
				t.setScore(score);
			}
		}
	}
}
