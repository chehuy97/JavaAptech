package ss6;

public class Circle {
	private double Radius;
	Circle(int rad){
		this.Radius = rad;
	}
	Circle(){
		this.Radius = 20;
	}
	void Display() {
		System.out.println("Radius: "+Radius);
	}
	void setRadius(double rad){
		this.Radius = rad;
	}
	double Parimeter() {
		return Radius*2*Math.PI;
	}
	void DisplayArea() {
		System.out.println("DienTich la: "+(Radius*Radius*Math.PI));
	}
	
}
