package ss10_1;

public class TestArea {
	public static void main(String[] args) {
		Cylinder mCylinder =  new Cylinder();
		mCylinder.setHeight(20);
		mCylinder.setRadius(15);
		mCylinder.getArea();//ham da duoc override
	}
}
