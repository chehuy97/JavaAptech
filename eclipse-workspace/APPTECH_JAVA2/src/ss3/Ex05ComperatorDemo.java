package ss3;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Ex05ComperatorDemo {
	public static void main(String[] args) {
	Comparator comparator = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return -o1.compareTo(o2);
		}
	};	
		
	Set<Student> ts = new TreeSet<>(comparator);
	ts.add(new Student(4, "Toby Alderweireld"));
	ts.add(new Student(5, "Jan Vertonghen"));
	ts.add(new Student(23, "Christian Eriksen"));
	ts.add(new Student(2, "Christian Eriksen"));
	ts.add(new Student(24, "Segne Aurier"));
	
	for (Object object : ts) {
		System.out.println(object);
	}
	
	}
}
