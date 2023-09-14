package StreamAPI;

import java.time.LocalDate;

import java.time.Period;
import java.util.ArrayList;
import java.util.stream.Collectors;



class Employee1{
	private String name;
	private double salary;
	private LocalDate hiredate;

	
	  @Override
	public String toString() {
		return "Employee1 [name=" + name + ", salary=" + salary + ", hiredate=" + hiredate + "]";
	}
	public Employee1(String name, double salary, LocalDate hiredate) {
		super();
		this.name = name;
		this.salary = salary;
		this.hiredate = hiredate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getHiredate() {
		return hiredate;
	}
	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}
	public int getYearsOfService() {
		    return Period.between(hiredate, LocalDate.now()).getYears();
		  }
	  public void printEmployeeDetails() {
		    System.out.println("\nName: " + name);
		    System.out.println("Salary: " + salary);
		    System.out.println("HireDate: " + hiredate);
		  }

	
}
public class EmployeeExample {
public static void main(String[] args) {
	Employee1 e1=new Employee1("raju",90000.00,LocalDate.parse("2023-05-30"));
	Employee1 e2=new Employee1("ramesh",50000.00,LocalDate.parse("2015-06-13"));
	Employee1 e3=new Employee1("manoj",80000.00,LocalDate.parse("2019-01-14"));
	Employee1 e4=new Employee1("rakesh",70000.00,LocalDate.parse("2020-02-13"));
	
	e1.printEmployeeDetails();
	System.out.println("year of service:"+e1.getYearsOfService());
	 
	e2.printEmployeeDetails();
	System.out.println("year of service:"+e2.getYearsOfService());
	
	e3.printEmployeeDetails();
	System.out.println("year of service:"+e3.getYearsOfService());
	 
	e4.printEmployeeDetails();
	System.out.println("year of service:"+e4.getYearsOfService());
	
	
	ArrayList<Employee1> employeelist = new ArrayList<Employee1>();
	
	employeelist.add(e1);
	employeelist.add(e2);
	employeelist.add(e3);
	employeelist.add(e4);
	employeelist.stream().sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary())).collect(Collectors.toList()).forEach(System.out::println);
	System.out.println("---------------");
	
}
}
