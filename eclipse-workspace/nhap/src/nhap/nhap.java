package nhap;

import java.util.Scanner;

public class nhap {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	
		int n=Integer.parseInt(input.nextLine());
		//Object n[]=new Object(n);
		// nhap chay
		String name[]=new String[n];
		String job[]=new String[n];
		for(int i=0;i<n;i++) {
			name[i]=input.nextLine();
			job[i]=input.nextLine();
		}
		for (int i=0;i<n;i++) {
			System.out.println(name[i]+".");
			if(job[i].equals("sinh vien"))
				System.out.println("toi la sinh vien");
			if(job[i].equals("giang vien"))
				System.out.println("toi la giang vien");
		}
		
	}
	
}