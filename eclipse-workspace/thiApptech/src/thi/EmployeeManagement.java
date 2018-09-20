package thi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeManagement {
	static ArrayList<Employee> arrEmployee;
	public static void main(String[] args) {
		storeEmployee();
		displayEmployee();
		displayEmployeeWithAgeGreaterThan30();		
	}
	static void storeEmployee() {
		for(int i =0;i<2;i++) {
		System.out.println("nhap id");
		Scanner scanner=new Scanner(System.in);
		scanner=new Scanner(System.in);
		int id=scanner.nextInt();
		System.out.println("nhap ten");
		scanner=new Scanner(System.in);
		String name =scanner.nextLine();
		System.out.println("nhap tuoi");
		scanner=new Scanner(System.in);
		int age = scanner.nextInt();
		System.out.println("nhap dia chi");
		scanner=new Scanner(System.in);
		String address =scanner.nextLine();		
		arrEmployee = new ArrayList<Employee>();
		Employee emp = new Employee();
		emp.setEmployeeID(id);
		emp.setEmployeeName(name);
		emp.setEmployeeAge(age);
		emp.setEmployeeAddress(address);
		arrEmployee.add(emp);
		
		}
	}
	static void displayEmployee() {
//		System.out.println("thong tin nhan vien: ");
//	//	for(int i=0;i<5;i++) {
////			System.out.println("id: "+arrEmployee.get(i).getEmployeeID());
////			System.out.println("ten: "+arrEmployee.get(i).getEmployeeName());
////			System.out.println("tuoi: "+arrEmployee.get(i).getEmployeeAge());
////			System.out.println("dia chi: "+arrEmployee.get(i).getEmployeeAddress());
//		//}
//		
//	        Iterator it=arrEmployee.iterator();
//	        while(it.hasNext()) {
//	            Object obj=it.next();
//	            if(obj instanceof Employee) {
//	                Employee emp=(Employee)obj;
//	                System.out.println ("id="+ emp.getEmployeeID());
//	                System.out.println ("ten="+ emp.getEmployeeName());
//	                System.out.println ("tuoi="+ emp.getEmployeeAge());
//	                System.out.println ("="+ emp.getEmployeeAddress());
//	            }
//	        }
		for (Employee employee : arrEmployee) {
            System.out.println(employee.toString());
        }

	}
	static void displayEmployeeWithAgeGreaterThan30() {
		for(int i=0;i<2;i++) {
			if(arrEmployee.get(i).getEmployeeAge() >=30)
			System.out.println(arrEmployee.get(i));
		}
	}
}