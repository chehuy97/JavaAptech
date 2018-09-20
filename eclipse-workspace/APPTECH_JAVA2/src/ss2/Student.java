package ss2;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	public Student( int id,String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override//ham de so sanh xong xoa phan tu
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Student) {
			Student s =(Student) obj;
			return this.id == s.id;
		} else 
			return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(o.name.equalsIgnoreCase(this.name)) {
			return this.id-o.id;
		}else {
			return this.name.compareTo(o.name);
		}
		
	}

	
}
