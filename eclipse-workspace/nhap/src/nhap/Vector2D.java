package nhap;

import java.util.Scanner;

public class Vector2D {
	private float x;
	private float y;
	public static void main(String[] args) {	
		Vector2D vtA = new Vector2D(2,3);
		Vector2D vtB = new Vector2D(7,5);
		System.out.print("Tong: ");
		vtA.display(tong(vtA,vtB));
		System.out.print("Hieu: ");
		vtA.display(hieu(vtA,vtB));
		System.out.println("Tich vo huong: " + tichvohuong(vtA,vtB));
		System.out.println("Tich co huong: " + tichcohuong(vtA,vtB));
		System.out.print("Zoom: ");
		vtA.display(vtA.zoom(3));
	}
	public Vector2D(){
		super();
	}
	public Vector2D(float x, float y) {
		this.x = x;
		this.y = y;
	}
	public void input () {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		do {
			System.out.println("nhap x: ");
			try {
				this.x = Integer.parseInt(sc.nextLine());
				check = false;
			} catch (NumberFormatException e) {
				System.err.println("Loi roi ban oi!");
				check = true;
			}
		} while(check);
		check = true;
		do {
			System.out.println("nhap y: ");
			try {
				this.y = Integer.parseInt(sc.nextLine());
				check = false;
			} catch (NumberFormatException e) {
				System.err.println("Loi roi ban oi!");
				check = true;
			}
		} while(check);
		
	}
	static public Vector2D tong (Vector2D a, Vector2D b) {
		return new Vector2D(a.x + b.x, a.y + b.y);
	}
	static public Vector2D hieu (Vector2D a, Vector2D b) {
		return new Vector2D(a.x - b.x, a.y - b.y);
	}
	static public float tichvohuong (Vector2D a, Vector2D b) {
		return (a.x + b.x) + (a.y + b.y);
	}
	static public float tichcohuong(Vector2D a, Vector2D b) {
		return (a.x + b.y - a.y - b.x);
	}
	public Vector2D zoom (float z) {
		Vector2D c = new Vector2D(0,0);
		c.x = this.x*z;
		c.y = this.y*z;
		return c;
	}
	public void display(Vector2D c) {
		System.out.println("("+ c.x + ";" + c.y + ")");
	}

}
