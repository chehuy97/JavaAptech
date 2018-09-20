package ss2;

public class StringDemo {
	public static void main(String[] args) {
		String s = "hello";
		s=s.concat(" World");
		System.out.println(s);
		StringBuilder mBuilder = new StringBuilder("Softech");
		mBuilder.append(" Apptech");
		System.out.println(mBuilder);
		
	}
}
