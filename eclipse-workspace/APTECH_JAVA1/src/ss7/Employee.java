package ss7;

public class Employee {
	private int id,salary;
	private String firstName,lastName;
	Employee(int id,String firstName,String lastName,int salary){
		this.id =id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getName() {
		return this.firstName+this.lastName;
	}
	public int getAnnualSalary() {
		return this.salary*12;
	}
	public double raiseSalary(int percent) {
		return this.salary*(1+percent/100);
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}
	
}

