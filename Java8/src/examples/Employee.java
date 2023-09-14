package examples;

import java.util.ArrayList;
import java.util.stream.Collectors;

class EmployeeDetails{
	 int employeeId;
	 String employeeName;
	 double salary;
	
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
	public EmployeeDetails(int employeeId,String employeeName,double salary ) {
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=salary;
	}
	public String toString() {
		return employeeId +" "+employeeName+" "+salary;
	}
	
}
public class Employee {
	
	public static void main(String args[]) {
		EmployeeDetails e1=new EmployeeDetails(1,"raju",90000.00);
		EmployeeDetails e2=new EmployeeDetails(2,"ramesh",50000.00);
		EmployeeDetails e3=new EmployeeDetails(3,"manoj",80000.00);
		EmployeeDetails e4=new EmployeeDetails(4,"rakesh",70000.00);
		
		ArrayList<EmployeeDetails> employeelist = new ArrayList<EmployeeDetails>();
		
		employeelist.add(e1);
		employeelist.add(e2);
		employeelist.add(e3);
		employeelist.add(e4);
		
		//sorting acc to salary
		employeelist.stream().sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary())).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("---------------");
		     
		     
		//sorting acc to id
		employeelist.stream().sorted((n1,n2)->(n1.getEmployeeId()-n2.getEmployeeId()))
		.collect(Collectors.toList()).forEach(System.out::println);
		
		
	}
	
}
