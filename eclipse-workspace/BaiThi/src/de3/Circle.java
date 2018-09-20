package de3;

public class Circle {
	private int x;
	private int y;
	private int r;
	private String color;
	public Circle(int x, int y, int r, String color) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
		this.color = color;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", r=" + r + ", color=" + color + "]";
	}
}
