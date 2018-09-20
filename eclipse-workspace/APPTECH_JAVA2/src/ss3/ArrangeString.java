package ss3;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ArrangeString {
	public static void main(String[] args) {
		Comparator comparator = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return -o1.compareTo(o2);
			}

		};
		TreeSet<String> ts1 = new TreeSet();
		ts1.add("Lamela");
		ts1.add("Eriksen");
		ts1.add("Alli");
		ts1.add("Kane");
		ts1.add("Dembele");
		for (Object object : ts1) {
			System.out.println(object);
		}		
		
		
		TreeSet<String> ts = new TreeSet(comparator);
		ts.add("Lamela");
		ts.add("Eriksen");
		ts.add("Alli");
		ts.add("Kane");
		ts.add("Dembele");
		System.out.println("thu tu nhap vao");
		for (Object object : ts) {
			System.out.println(object);
		}
//		Comparator comparator = new Comparator<ts>() {
//
//			@Override
//			public int compare(ts o1, ss3.ts o2) {
//				// TODO Auto-generated method stub
//				   if (o1 > o2) {
//	                    return 1;
//	                } else {
//	                    if (o1 == o2) {
//	                        return 0;
//	                    } else {
//	                        return -1;
//	                    }
//	                }
//			}
//		};

	}
}
