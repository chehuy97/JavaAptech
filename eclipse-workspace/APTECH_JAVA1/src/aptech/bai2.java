package aptech;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stt = sc.nextInt();
		double DiemLT = sc.nextDouble();
		double DiemTH = sc.nextDouble();
		double DiemTB = (DiemLT + DiemTH)/2;
		sc = new Scanner(System.in);
		String a = sc.nextLine();
		System.out.printf("|%3s |%-20s |%6s| |%6s| |%6s|\n" ,"STT","Ho ten","DiemLT","DiemTH","DiemTB");
		System.out.printf("|%3d |%-20s |%6.1f| |%6.1f| |%6.1f|" ,stt,a,DiemLT,DiemTH,DiemTB);
	}
}
