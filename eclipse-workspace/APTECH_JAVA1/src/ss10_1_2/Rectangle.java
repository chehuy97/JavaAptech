package ss10_1_2;

public class Rectangle extends Shape {
	protected int width;
	protected int height;
	public Rectangle() {
		super();
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public double getArea() {
		return width*height;
	}
}
