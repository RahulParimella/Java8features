package RealTimeExampleJava8;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
	 int id;
     
	    String name;
	     
	    int age;
	     
	    String gender;
	     
	    String department;
	     
	    int yearOfJoining;
	     
	    double salary;

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
					+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
		}

		public Employee(int id, String name, int age, String gender, String department, int yearOfJoining,
				double salary) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.department = department;
			this.yearOfJoining = yearOfJoining;
			this.salary = salary;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public int getYearOfJoining() {
			return yearOfJoining;
		}

		public void setYearOfJoining(int yearOfJoining) {
			this.yearOfJoining = yearOfJoining;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
}
public class EmployeeExample {
		public static void main(String[] args) {



List<Employee> employeeList = new ArrayList<Employee>();
         
employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		//no of males and females
		Map<String, Long> noOfMalesAndFemales = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
			System.out.println(noOfMalesAndFemales);
			
			System.out.println("---------------------------------------");
			
			//Print the name of all departments in the organization?
			employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
			
			Map<String, List<Employee>> alldepartments = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
			System.out.println("all departments :" +alldepartments);
			
			
			System.out.println("---------------------------------------");
			
			//average age of male and female employees?
			Map<String, Double> averageage =employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
			System.out.println(averageage);
			
			System.out.println("---------------------------------------");
			
			// highest paid employee in the organization?
			Optional<Employee> highestpaidEmployee = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
			System.out.println(highestpaidEmployee.get());
			
			System.out.println("---------------------------------------");
			//Get the names of all employees who have joined after 2015?
			
			employeeList.stream().filter(x->x.yearOfJoining>2015).map(Employee::getName).forEach(System.out::println);
			
			System.out.println("---------------------------------------");
			//Count the number of employees in each department?
			Map<String, Long> noOfEmployees =employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
			System.out.println(noOfEmployees);
			
			System.out.println("---------------------------------------");
			
			//average salary of each department
			Map<String, Double> averageSalary=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
			System.out.println(averageSalary);
			
			System.out.println("---------------------------------------");
			
			//Who has the most working experience in the organization?
			
			Optional<Employee> mostworkingexperience = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
			System.out.println(mostworkingexperience.get());
			
			System.out.println("---------------------------------------");
			
			//How many male and female employees are there in the sales and marketing team?
			 Map<String, Long> countMalesAndFemalesEmployees = employeeList.stream().filter(n ->n.getDepartment()=="Sales And Marketing").collect(Collectors.groupingBy(Employee::getGender , Collectors.counting()));
			
			System.out.println(countMalesAndFemalesEmployees);
			
			System.out.println("---------------------------------------");
			
			//What is the average salary of male and female employees?
			Map<String,Double> averageSalary1=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
			System.out.println(averageSalary1);
			
			System.out.println("---------------------------------------");
			
			// List down the names of all employees in each department?
			 Map<String, List<Employee>> allNames = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
			
			  Set<Entry<String, List<Employee>>> entrySet = allNames.entrySet();
			 for (Entry<String, List<Employee>> entry : entrySet) 
			 {
			     System.out.println("--------------------------------------");
			              
			     System.out.println("Employees In "+entry.getKey() + " : ");
			              
			     //System.out.println("--------------------------------------");
			              
			     List<Employee> list = entry.getValue();
			              
			     for (Employee e : list) 
			     {
			         System.out.println(e.getName());
			     }
			 }
			
		}
}
