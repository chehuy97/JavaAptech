package thi;

public class TestCircle {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(10);
		System.out.println("Dien tich = "+circle.getArea());
		System.out.println("Chu vi = "+circle.getPerimeter());
	}
}
