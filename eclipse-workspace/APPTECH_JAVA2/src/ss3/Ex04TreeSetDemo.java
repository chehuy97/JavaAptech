package ss3;

import java.util.Set;
import java.util.TreeSet;

public class Ex04TreeSetDemo {
	public static void main(String[] args) {
		Set<Student> ts = new TreeSet();
	ts.add(new Student(4, "Toby Alderweireld"));
	ts.add(new Student(5, "Jan Vertonghen"));
	ts.add(new Student(23, "Christian Eriksen"));
	ts.add(new Student(2, "Christian Eriksen"));
	ts.add(new Student(24, "Segne Aurier"));
	for (Object object : ts) {
		System.out.println(object);
	}
	
	//Tree set cac phan tu duoc sap xep tu be den lon hoac theo abc
	}
}
