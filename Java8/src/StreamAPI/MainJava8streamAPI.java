package StreamAPI;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee{
	 int employeeId;
	 String employeeName;
	 double salary;
	
	public Employee(int employeeId,String employeeName,double salary ) {
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=salary;
	}
	public String toString() {
		return employeeId +" "+employeeName+" "+salary;
	}
	
}
public class MainJava8streamAPI {
	
	public static void main(String args[]) {
		Employee e1=new Employee(1,"raju",90000.00);
		Employee e2=new Employee(2,"ramesh",50000.00);
		Employee e3=new Employee(3,"manoj",80000.00);
		Employee e4=new Employee(4,"rakesh",70000.00);
		
		ArrayList<Employee> employeelist = new ArrayList<Employee>();
		
		employeelist.add(e1);
		employeelist.add(e2);
		employeelist.add(e3);
		employeelist.add(e4);
		
		//filtering
		employeelist.stream().filter(emp ->emp.salary > 50000.00).forEach(n->System.out.println(n.employeeName +"\t"+n.salary+ "\t"+n.employeeId));
		
		
		employeelist.stream().forEach(System.out::println);
		
		//Using Collectors's method to sum the prices.  
		Double totalresult = employeelist.stream().collect(Collectors.summingDouble(n->n.salary));
		System.out.println(totalresult);
		
		
		List<String> uppercase = employeelist.stream().filter(n->n.employeeName.length()>4).map(n->n.employeeName.toUpperCase()).collect(Collectors.toList());
		System.out.println(uppercase);
		
		//count operation
		long count = employeelist.stream().map(n->n.employeeName.toUpperCase()).count();
		System.out.println(count);
	
		//findfirst operation
		Optional<Employee> findfirst = employeelist.stream().findFirst();
		 
		  System.out.println(findfirst.get());
		  //findany operation
		  Optional<Employee> findany = employeelist.stream().findAny();
		  System.out.println(findany.get());
		  
		  
		  //foreach
		     employeelist.stream().forEach(n->{
			  System.out.println(n);
		  });
		     System.out.println("---------------");
		     
		     //ascending order(without comparator)
		     employeelist.stream().sorted((o1,o2)->(int)(o1.salary -o2.salary)).collect(Collectors.toList()).forEach(System.out::println);
		     
		     
		     System.out.println("---------------");
		     
		     
		     //ascending order(with comparator)
//		     employeelist.stream().sorted(new Comparator<Employee>() {
//		    	 public int compare(Employee E1 ,Employee E2) {
//		    		 return(int)(E1.salary - E2.salary);
//		    	 }
//			}).collect(Collectors.toList()).forEach(System.out::println);
		     employeelist.stream().sorted(new Comparator<Employee>(){
		    	 public int compare(Employee E1,Employee E2) {
		    		 return (int)(E1.salary -E2.salary);
		    	 }
		     }).collect(Collectors.toList()).forEach(System.out::println);
		     
System.out.println("---------------");
		     
		     
		     //dscending order(with comparator)
		     employeelist.stream().sorted(new Comparator<Employee>() {
		    	 public int compare(Employee E1 ,Employee E2) {
		    		 return(int)(E2.salary - E1.salary);
		    	 }
			}).collect(Collectors.toList()).forEach(System.out::println);
		     
	}
	
}
