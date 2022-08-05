package a23_7;

class Members {
	String name;
	int age;
	String number;
	String Address;
	int salary;

	public void printSalary() {

		System.out.println("salary of " + name + " is " + salary);
	}
}

class Employee extends Members {
	String specialization;

}

class Manager extends Members {
	String department;
}

public class Company 
{
	public static void main(String[] args) {

		Employee E = new Employee();
		E.name = "Gaurang";
		E.number = "9106883956";
		E.Address = "Rajkot";
		E.age = 20;
		E.salary = 15000;

		Manager M = new Manager();
		M.name = "Dhaval";
		M.number = "9265618319";
		M.Address = "Gondal";
		M.age = 32;
		M.salary = 40000;

		E.printSalary();
		M.printSalary();

	}
}


