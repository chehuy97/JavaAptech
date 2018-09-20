package ss1;

import java.lang.reflect.Method;

public class EX02_ThrowsDemo {
	public static void main(String[] args) {
		try {
			test1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void test1() throws ClassNotFoundException {
		test2();
	}
	
	static void test2() throws ClassNotFoundException{
		Class c = Class.forName("java.lang.string");
		for(Method method: c.getMethods()) {
			System.out.println(method.getName());
		}
	}
}
