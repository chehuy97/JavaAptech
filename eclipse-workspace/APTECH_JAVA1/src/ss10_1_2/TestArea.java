package ss10_1_2;

public class TestArea {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(20);
		System.out.println("dien tich tron: "+circle.getArea());
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(20);
		rectangle.setHeight(20);
		System.out.println("dien tich hcn: "+rectangle.getArea());
	}
}
