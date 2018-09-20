package ss3;

public class Student implements Comparable<Student>{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name ;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			Student s = (Student) obj;
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
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(!this.name.equalsIgnoreCase(o.name)) {
			return this.name.compareTo(o.name);
		}else {
			return this.id-o.id;
		}
		
	}
	
}
