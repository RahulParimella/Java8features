package OverridingEqualsAndHashcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Employee {


	private int id;
	private String empName;
	public Employee(int id, String empName) {
		super();
		this.id = id;
		this.empName = empName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public static void main(String[] args) {
		
//		String e1= new String(1,"rahul");
//		String e2 =new String(1,"rahul");
		Employee e1 = new Employee(1,"rahul");
		Employee e2 =new Employee(1,"rahul");
		
		System.out.println("employeename :" +e1.empName +"employeeid:"+e1.id);
		
		System.out.println("employeename :" +e2.empName +"employeeid:"+e2.id);
		System.out.println("-------------------------------------------");
		
		System.out.println("equality between e1 and e2:"+e1.equals(e2));
		System.out.println("-------------------------------------------");
		
		System.out.println("employee 1 obj hashcode :"+e1.hashCode());
		System.out.println("employee 2 obj hashcode :"+e2.hashCode());
		
		//System.out.println(e1.hashCode());
		//System.out.println(e2.hashCode());
		

		HashSet<Employee> emp = new HashSet<Employee>();
		emp.add(e1);
		emp.add(e2);
		System.out.println(emp);
	}
	@Override	
	public boolean equals(Object o) {
		if(o == null)
			return false;
		//Employee e =(Employee)o;
		Employee e=new Employee(id, empName);
		return(e.empName == this.empName && e.id == this.id);
		
	}
	@Override
	public int hashCode() {
		final int x=5;
		int result=1;
		result =x*result+this.id;
		return result;
	}
}
