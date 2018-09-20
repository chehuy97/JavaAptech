package ss3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HW_TestStudent2 {
	public static void main(String[] args) {
		List<HW_Student> mList = new ArrayList<HW_Student>();
		mList.add(new HW_Student(10, "Harry Kane"));
		mList.add(new HW_Student(20,"Dele Alli"));
		mList.add(new HW_Student(23, "Christian Eriksen"));
		mList.add(new HW_Student(7, "Heung Min Son"));
		mList.add(new HW_Student(11, "Erik Lamela"));
		mList.add(new HW_Student(17, "Erik Lamela"));
		mList.add(new HW_Student(3, "Erik Lamela"));
		
		System.out.println("mang da nhap");
		for (int i = 0; i < mList.size(); i++) {
			System.out.println(mList.get(i));
		}
		System.out.println("mang da sap xep tang dan theo ten");
//		Collections.sort(mList, new Comparator<HW_Student>() {
//
//			@Override
//			public int compare(HW_Student s1, HW_Student s2) {
//				// TODO Auto-generated method stub
//				if (s1.s.compareTo(s2.s) ==0) {
//					 if (s1.id > s2.id) {
//		                    return 1;
//		                } else {
//		                    if (s1.id == s2.id) {
//		                        return 0;
//		                    } else {
//		                        return -1;
//		                    }
//		                }
//				}else {
//					return s1.s.compareTo(s2.s);
//				}
//			}
//		});
		for (HW_Student hw_Student : mList) {
			System.out.println(hw_Student);
		}
	}
}
