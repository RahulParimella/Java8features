package StreamAPI;
  	 	
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class employee1{
	int employeeId;
	int age;
	String employeeName;
	double salary;

	
	public employee1(int employeeId, int age, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.age = age;
		this.employeeName = employeeName;
		this.salary = salary;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
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


	@Override
	public String toString() {
		return "employee1 [employeeId=" + employeeId + ", age=" + age + ", employeeName=" + employeeName + ", salary="
				+ salary + "]";
	}


	
}


public class Stream2 {

public static List<employee1> getemployee(){
	List<employee1> employeelist =new ArrayList<employee1>();
	employeelist.add(new employee1(1,50,"rahul",60000.00));
	employeelist.add(new employee1(2,54,"raju",50000.00));
	employeelist.add(new employee1(3,49,"rakesh",40000.00));
	employeelist.add(new employee1(4,41,"raghu",30000.00));
	return employeelist;
	
}
public static void main(String[] args) {
	 List<employee1> list = getemployee().stream().filter(n->n.salary<60000.00).collect(Collectors.toList());
	 list.forEach(System.out::println);
	
	
}
}




