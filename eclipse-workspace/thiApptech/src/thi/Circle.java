package thi;

public class Circle implements Shape {
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius*radius*Math.PI;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*radius*Math.PI;
	}
	
}
