package ss6;

public class TextCircle1 {
	public static void main(String[] args) {
		Circle c1 =  new Circle();
		Circle c2 = new Circle(50);
		Circle c3 =  new Circle();
		c3.setRadius(60);
		c1.Display();
		System.out.println("Chu vi la: "+ c1.Parimeter());
		c1.DisplayArea();
		c2.Display();
		System.out.println("Chu vi la: "+ c2.Parimeter());
		c2.DisplayArea();
		c3.Display();
		System.out.println("Chu vi la: "+ c3.Parimeter());
		c3.DisplayArea();
	
	}
}
