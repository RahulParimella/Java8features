package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employees{
	 private int employeeId;
	 private String employeeName;
	 private double salary;
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}
	public Employees(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}																			//containing a class::methodname
public class ExampleEmployee {
	public static void main(String[] args) {
		List<Employees> em =new ArrayList<Employees>();
		em.add(new Employees(1,"NoothiSindhu",1000));
		em.add(new Employees(2,"Anand",1000));
		em.add(new Employees(3,"Rachana",1000));
		
		em.stream().sorted(Comparator.comparing(Employees::getEmployeeName)).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("---------------------------");
	}
}
