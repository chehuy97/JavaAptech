package ss10_1;

public class Cylinder extends Circle {
	private double height;
	public Cylinder(double radius) {
		super(radius);
	}
	public Cylinder() {
		super();
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public void getArea() {
		double s = 2*radius*radius*Math.PI+height*2*radius*Math.PI;
		System.out.println("dien tich tru: "+s);
	}

}
