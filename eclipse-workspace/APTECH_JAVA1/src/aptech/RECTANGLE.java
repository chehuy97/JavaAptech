package aptech;

public class RECTANGLE {
	public static void main(String[] args) {
		RECTANGLE a = new RECTANGLE();
		int b = a.SetWidth(5)+a.SetHeight(5);
		a.display(a.SetWidth(6), a.SetHeight(6));
		a.Input("my name is huy");
		
		//		int b=5;int c=5;
//		SetWidth(b);SetHeight(c);
//		System.out.println(b+c);
	}
	
	public void Input(String a) {
		System.out.println(a);
	}
	
	public static  int SetWidth(int Width1) {
		return Width1;
	}
	public static int SetHeight(int Height1) {
		return Height1;
	}
	public static void display(int Width1,int Height1) {
		System.out.println("Chiều rộng là :"+Width1+"\nChiều dài là: "+Height1);
	}
}
