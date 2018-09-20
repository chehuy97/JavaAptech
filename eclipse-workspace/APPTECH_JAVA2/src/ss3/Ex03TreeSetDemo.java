package ss3;

import java.util.Set;
import java.util.TreeSet;

public class Ex03TreeSetDemo {
	public static void main(String[] args) {
		Set<String> ts = new TreeSet<>();
//		ts.add((double) 10);
//		ts.add(10.6);
//		ts.add(10.5);
//		ts.add((double) 7);
//		ts.add((double) 100);
//		ts.add((double) 4);
//		ts.add((double) 88);
		ts.add("Arturia");
		ts.add("Jeanne D'Arc");
		ts.add("Scathach");
		ts.add("Musashi");
		ts.add("Tohsaka");
		ts.add("Sakura");
		
		for (Object object : ts) {
			System.out.println(object);
		}
	}
}
