package ss3;

import java.util.Collections;
import java.util.Comparator;

public class HW_Student implements Comparable<HW_Student> {
	int id;
	String s;

	public HW_Student(int id,String s) {
		super();
		this.id=id;
		this.s = s;
	}

	@Override
	public String toString() {
		return "id=" + id + ", s=" + s;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof HW_Student) {
			 HW_Student s = (HW_Student) obj;
			return this.id == s.id;
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}
	
//	@Override
//	public int compareTo(HW_Student o) {
//		// TODO Auto-generated method stub
//		if (this.s.equalsIgnoreCase(o.s)) {
//			return this.id - o.id;
//		} else
//			return this.s.compareTo(o.s);
//	}
	@Override
	public int compareTo(HW_Student o) {
		// TODO Auto-generated method stub
		if(!this.s.equalsIgnoreCase(o.s)) {
			return this.s.compareTo(o.s);
		}else 
			return this.id-o.id;
		}
//	public int getId() {
//		return id;
//	}
//
//	public String getS() {
//		return s;
//	}


	}

	
