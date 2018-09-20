
public class Circle implements IShape {
	protected int radius;
	
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
	

}
