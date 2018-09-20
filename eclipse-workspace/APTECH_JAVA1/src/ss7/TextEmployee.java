package ss7;

import java.util.Scanner;

public class TextEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		String lastName = sc.nextLine();
		
		int salary = sc.nextInt();
		Employee emp = new Employee(id, firstName, lastName, salary);
		System.out.println(emp);
		System.out.println("annualSalary = "+emp.getAnnualSalary());
		
	}
}
