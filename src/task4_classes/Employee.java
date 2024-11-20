package task4_classes;
import java.util.Date;

public class Employee extends Person implements Cloneable,Comparable<Employee>{
	public Employee(String name,double salary,Date hireDate,String insuranceNumber) {
		super(name,salary,hireDate,insuranceNumber);
	}
	
	@Override
	public int compareTo(Employee e) {
		if (getSalary() > e.getSalary()) return 1;
		else if (getSalary() ==  e.getSalary()) return 0;
		else return -1;
	}
	
	@Override
	public Employee clone() {
		try {
			Employee emp = (Employee) super.clone();
//			return emp; // шэллоу кнонинг тут
			
			emp.hireDate = (Date) this.hireDate.clone();
			return emp;
			
		}
		catch(CloneNotSupportedException e){
			throw new AssertionError();
		}
		
	}
}



