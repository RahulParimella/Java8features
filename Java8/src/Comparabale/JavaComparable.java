package Comparabale;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person>
{
	private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return this.name;
    }

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return (this.getAge() - o.getAge());
	}
	
	
}
public class JavaComparable {
		public static void main(String[] args) {
			sortUserDefinedObjectsInAsc();
		}
		private static void sortUserDefinedObjectsInAsc() {
	        List<Person> persons = new ArrayList<Person>();
	        Person person1 = new Person(59, "John", 40);
	        Person person12 = new Person(67, "Roger", 25);
	        Person person13 = new Person(45, "Steven", 30);
	        persons.add(person1);
	        persons.add(person12);
	        persons.add(person13);

	        System.out.println("Before Sorting : " + persons);
	        Collections.sort(persons);
	        System.out.println("After Sorting : " + persons);
	    }
	}

