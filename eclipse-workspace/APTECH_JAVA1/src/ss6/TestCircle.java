package ss6;

public class TestCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(30);
		Circle c3;
		c3=c2;
		c1.Display();
		c2.Display();
		c3.Display();		
	}
}
