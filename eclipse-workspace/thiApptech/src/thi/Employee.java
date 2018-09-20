package thi;

public class Employee {
	@Override
	public String toString() {
		return "Employee [id=" + employeeID + "\n ten=" + employeeName + "\n tuoi=" + employeeAge
				+ "\n dia chi=" + employeeAddress + "]";
	}
	private int employeeID;
	private String employeeName;
	private int employeeAge;
	private String employeeAddress;
	
	public Employee() {
		super();
	}
	
	public Employee(int employeeID, String employeeName, int employeeAge, String employeeAddress) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeAddress = employeeAddress;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	

}
