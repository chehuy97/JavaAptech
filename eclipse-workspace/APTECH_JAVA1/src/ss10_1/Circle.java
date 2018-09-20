package ss10_1;

public class Circle {
	protected double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void getArea() {
		double s = radius*radius*Math.PI;
		System.out.println("dien tich: "+s);
	}
}
