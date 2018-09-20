package ss10;

public class Circle extends Shape {
	private float radius=10;
	public Circle() {
		super();
	}
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public void showCircle(){
		System.out.println("color: "+color);
		System.out.println("fill: "+filled);
		System.out.println("radius "+radius);
		
	}
	
}
