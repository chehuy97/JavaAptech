package ss3;

import java.util.List;
import java.util.LinkedList;

public class Ex2LinkListDemo {
	public static void main(String[] args) {
		List list = new LinkedList();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add("hello");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
