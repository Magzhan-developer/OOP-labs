package lab3_testClasses;
import task4_classes.*;
import java.util.Date;

public class task4TestClass {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Bekzhan",230000,new Date(124,2,19),"INS12999");
		Employee emp2 = new Employee("Alice", 50000, new Date(120, 0, 1), "INS12345");
		Employee emp3 = new Employee("Bob", 60000, new Date(119, 5, 15), "INS67890");
		Employee emp4 = new Employee("Charlie", 45000, new Date(121, 3, 30), "INS11223");
		Employee emp5 = new Employee("Diana", 70000, new Date(118, 8, 20), "INS33445");

		Manager mn1 = new Manager("Magzhan",350000,new Date(123,9,7),"INS70123",200000);
		mn1.employeeVect.add(emp1);
		mn1.employeeVect.add(emp2);
		mn1.employeeVect.add(emp3);
		mn1.employeeVect.add(emp4);
		mn1.employeeVect.add(emp5);

		System.out.println("This is a vector after adding elements");

		for (Employee emp : mn1.employeeVect) {
			System.out.println(emp.toString());
		}
		System.out.println();
		System.out.println("Here i sorted by name");
		mn1.employeeVectSort("name");
		for (Employee emp : mn1.employeeVect) {
			System.out.print(emp.getName() + ' ');
		}

		System.out.println();
		System.out.println("Here i sorted by date");
		mn1.employeeVectSort("date");
		for (Employee emp : mn1.employeeVect) {
			System.out.println(emp.getName() + ' ' + emp.getHireDate());
		}

	}

}
