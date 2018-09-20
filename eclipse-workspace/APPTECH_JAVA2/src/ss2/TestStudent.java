package ss2;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestStudent {
	public static void main(String[] args) {
		Set ts =  new TreeSet<>();
		ts.add(new Student(7, "Hong Minh Son"));
		ts.add(new Student(10, "Ha Duy Kien"));
		ts.add(new Student(9, "Le Van Do"));
		ts.add(new Student(11, "Mac Co Roi"));
		for (Object object : ts) {
			System.out.println(object);
		}
	}
}
