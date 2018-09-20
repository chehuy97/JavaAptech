package ss10_1_2;

public class Circle extends Shape{
	private float radius;
	public Circle() {
		super();
	}
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		return radius*radius*Math.PI;
		
	}
}
