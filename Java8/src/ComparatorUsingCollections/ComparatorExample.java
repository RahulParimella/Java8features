package ComparatorUsingCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Employee{
	private int empId;
	private String empName;
	private int empAge;
	private double empSalary;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary
				+ "]";
	}
	public Employee(int empId, String empName, int empAge, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
}
public class ComparatorExample {
    public static void main(String[] args) {
    	List<Employee> emp =new ArrayList<>();
    	emp.add(new Employee(1,"ramesh",25,25000));
    	emp.add(new Employee(2,"rakesh",26,35000));
    	emp.add(new Employee(3,"rajiv",27,45000));
    	emp.add(new Employee(4,"mahesh",28,55000));
    	
    	System.out.println(emp);
    	System.out.println("---------------------");
    	
    	Collections.sort(emp,Comparator.comparing(Employee::getEmpName));
    	
    	System.out.println(emp);
    	System.out.println("---------------------");
    	
    	
    	
    	Collections.sort(emp,Comparator.comparing(Employee::getEmpSalary));
    	System.out.println(emp);
     	System.out.println("---------------------");
    	Collections.sort(emp,Comparator.comparing(Employee::getEmpAge));
    	System.out.println(emp);

    	
    }
}
