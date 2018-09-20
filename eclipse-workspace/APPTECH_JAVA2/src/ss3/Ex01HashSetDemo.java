package ss3;

import java.util.HashSet;
import java.util.Set;

public class Ex01HashSetDemo {
	public static void main(String[] args) {
		Set hs =  new HashSet();
		hs.add(10);
		hs.add(20.5);
		hs.add("Jeanne D'Arc");
		hs.add(10);
		hs.add("Jeanne D'Arc");
		hs.add(new Student(11, "Lamela"));
		hs.add(new Student(11, "Lamela"));
		
		for (Object object : hs) {
			System.out.println(object);
		}
		//SET interfase,hashset k co stt,k co trung lap va thu tu add vao k giong ban dau
		
	}
}
