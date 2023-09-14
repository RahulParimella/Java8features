package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//
import OverridingEqualsAndHashcode.Employee;

class Employees{
 private int employeeId;
	 private String employeeName;
	 private double employeeSalary;
	 private String departmentName;
	private int employeeAge;
	@Override
	public String toString() {
		return "Employees [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", departmentName=" + departmentName + ", employeeAge=" + employeeAge + "]";
	}
	public Employees(int employeeId, String employeeName, double employeeSalary, String departmentName,
			int employeeAge) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.departmentName = departmentName;
		this.employeeAge = employeeAge;
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
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}


	
}																			//containing a class::methodname
public class Example1 {
	public static void main(String[] args) {
		List<Employees> em =new ArrayList<Employees>();
		em.add(new Employees(1,"ramesh",10000.00,"cse",29));
		em.add(new Employees(2,"Anand",12000.00,"cse",20));
		em.add(new Employees(3,"raju",13000.00,"ECE",40));
		em.add(new Employees(4,"ramesh",10000.00,"ECE",29));
		em.add(new Employees(5,"Anand",12000.00,"EEE",20));
		em.add(new Employees(6,"raju",13000.00,"EEE",40));
		
	Double sum = em.stream().filter(x->x.getEmployeeAge()>25).collect(Collectors.summingDouble(Employees::getEmployeeSalary));
	System.out.println(sum);
	System.out.println("-----------");
	Map<String, Long> count = em.stream().collect(Collectors.groupingBy(Employees::getDepartmentName,Collectors.counting()));
	System.out.println(count);
		
//		List<String> str = new ArrayList<String>();
//		str.add("HelloWorld");
//		str.stream().map(n->n.StringBu)
		
		List<Integer> dup =Arrays.asList(5,6,4,1,2,2,4,5);
		dup.stream().distinct().forEach(System.out::println);
		
		Set<Integer> dup1 =new HashSet<Integer>(Arrays.asList(5,6,4,1,2,2,4,5));
		System.out.println();
		String str="abcba";
	StringBuffer str1 =new StringBuffer(str);
	StringBuffer str2= str1.reverse();
	if(str2.equals(str1)) {
		System.out.println("palindrome");
		
	}
	else {
		System.out.println("not palindrome");
	}
	}
}
