package Chuoi;

import java.util.Scanner;

public class TestHinhTamGiac {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int c1 = scanner.nextInt();
		int c2 = scanner.nextInt();
		int c3 = scanner.nextInt();
		HinhTamGiac mHinhTamGiac = new HinhTamGiac(c1, c2, c3);
		System.out.println("chu vi tam giac: "+mHinhTamGiac.chuvi());
		System.out.println("dien tich tam giac: "+mHinhTamGiac.Dientich());
	}
}

class HinhTamGiac {
	private int c1;
	private int c2;
	private int c3;
	HinhTamGiac(int c1,int c2,int c3){
		this.c1 =c1;
		this.c2 =c2;
		this.c3 =c3;
		
	}
	public int getC1() {
		return c1;
	}

	public void setC1(int c1) {
		this.c1 = c1;
	}

	public int getC2() {
		return c2;
	}

	public void setC2(int c2) {
		this.c2 = c2;
	}

	public int getC3() {
		return c3;
	}

	public void setC3(int c3) {
		this.c3 = c3;
	}
	public int chuvi() {
		return (c1+c2+c3);
	}
	public double Dientich() {
		double p = (c1+c2+c3)/2;
		double p1= p*(p-c1)*(p-c2)*(p-c3);
		double s =Math.sqrt(p1);
		return s;
	}
}