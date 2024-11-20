package task4_classes;
import java.util.Comparator;	
import java.util.Date;
import java.util.Vector;

public class Manager extends Employee implements Cloneable{
	protected double bonus;
	public Vector<Employee> employeeVect;
	public Manager(String name,double salary,Date hireDate,String insuranceNumber,double bonus) {
		super(name,salary,hireDate,insuranceNumber);
		this.bonus = bonus;
		employeeVect = new Vector<>();
	}

	public double getBonus() {
		return this.bonus;
	}
	
	@Override
	public int compareTo(Employee e) {
		if (!(e instanceof Manager)) {
	        return super.compareTo(e);
	    }
		Manager otherManager = (Manager) e;
		int salaryComparison = Double.compare(getSalary(), otherManager.getSalary());
		if (salaryComparison == 0) {
			return Double.compare(this.getBonus(), otherManager.getBonus());
		}
		return salaryComparison;
	}
	
	public void employeeVectSort(String sortBy) {
		switch(sortBy) {
			case "name":
				NameComparator nameComp = new NameComparator();
				employeeVect.sort(nameComp);
				break;
			case "date":
				DateComparator dateComp = new DateComparator();
				employeeVect.sort(dateComp);
				break;
			default:
	            System.out.println("Invalid sorting criteria: " + sortBy);
	            break;
		}
	}
	
	@Override
	public Manager clone() {
			Manager cloned = (Manager) super.clone();
			cloned.bonus = this.bonus;
			cloned.employeeVect = new Vector<>(this.employeeVect);
			return cloned;
	}
	
	
	@Override
	public String toString() {
		return "Manager{" +
	                "name='" + getName() + '\'' +
	                ", salary=" + getSalary() +
	                ", hireDate=" + getHireDate() +
	                ", insuranceNumber='" + getInsuranceNumber() + '\'' +
	                ", bonus=" + bonus +
	                '}';
	}
		
	@Override
    public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) return false;
		Manager other  = (Manager) obj;
		return Double.compare(other.getSalary(), getSalary()) == 0 &&
                getName().equals(other.getName()) && 
                getHireDate().equals(other.getHireDate()) && 
                getInsuranceNumber().equals(other.getInsuranceNumber());
	}
}


class NameComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1,Employee e2) {
		return e1.getName().compareToIgnoreCase(e2.getName());
	}
}

class DateComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1,Employee e2) {
		return e1.getHireDate().compareTo(e2.getHireDate());
	}
}
