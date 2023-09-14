package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Student{
	private int sid;
	private int sage;
	private String sname;
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sage=" + sage + ", sname=" + sname + "]";
	}
	public Student(int sid, int sage, String sname) {
		super();
		this.sid = sid;
		this.sage = sage;
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
}
public class Main {

	public static void main(String[] args) {
		List<Student> list =new ArrayList<Student>();
		list.add(new Student(1,21,"ramesh"));
		list.add(new Student(2,23,"rajesh"));
		list.add(new Student(3,24,"mahesh"));

		
		list.stream().sorted(Comparator.comparing(Student::getSname)).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("---------------------------");
		
}
}