package task4_classes;
import java.util.Date;

public class Person {
	private String name;
	private double salary;
	protected Date hireDate;
	private String insuranceNumber;
	
	public Person(String name,double salary,Date hireDate,String insuranceNumber) {
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
	}
	
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public Date getHireDate() {
		return hireDate;
	}
	
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	
	@Override
	public String toString() {
		return "Person with name " + name + 
		           ", with salary " + salary + 
		           ", hired on " + hireDate + 
		           ", with insurance number " + insuranceNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		
		Person other = (Person) obj;
		return  name.equals(other.getName()) && 
		           Double.compare(salary, other.getSalary()) == 0 && 
		           hireDate.equals(other.getHireDate()) && 
		           insuranceNumber.equals(other.getInsuranceNumber());
	}
}
