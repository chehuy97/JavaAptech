package ss3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex1ArrayListDemo {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(10.5);
		a.add("hello");
		a.add(2,"phuc du");
		
		Student s = new Student(7, "Ronaldo");
		a.add(s);
		a.add(new Student(10, "Messi"));
		
		Vector v = new Vector();
		v.add(1882);
		v.add("Tottenham");
		a.add(v);
		a.remove(5);
		a.remove(new Integer(10));
		a.remove("hello");
		a.remove(new Student(7, "Ronaldo"));
		
		//c1: dung fori 
		
		/*for (int i = 0; i < a.size(); i++) {
		 System.out.println(a.get(i));
		} */
		
		//c2: dung for each: chi dung de duyet k tinh toan
		
		/*for (Object object : a) {
			System.out.println(object);
		}*/
		
		//c3: dung bang iterator:dung ki cac phan tu tinh toan khong co chi so i
		
		Iterator it = a.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
