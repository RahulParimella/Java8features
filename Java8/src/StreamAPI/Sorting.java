package StreamAPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorting {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("pomegranate");
		fruits.add("orange");
	
		ArrayList<Integer> no =new ArrayList<Integer>();
		no.add(11);
		no.add(12);
		no.add(21);
		no.add(10);
		no.add(14);
		
		Object list1 = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(list1);
		

		
		List<String> list2 = fruits.stream().sorted((n1,n2)->n1.compareTo(n2)).collect(Collectors.toList());
		System.out.println(list2);
		
		
		//ascending order
		List<Integer> list3 = no.stream().sorted((n1,n2)->n1.compareTo(n2)).collect(Collectors.toList());
		System.out.println(list3);
		
		List<String> list4 = fruits.stream().sorted((n1,n2)->n2.compareTo(n1)).collect(Collectors.toList());
		System.out.println(list4);
		
		//descinding order
		List<Integer> list5 = no.stream().sorted((n1,n2)->n2.compareTo(n1)).collect(Collectors.toList());
		System.out.println(list5);
		
		List<String> list6 = fruits.stream().sorted((n1,n2)->n1.compareTo(n2)).collect(Collectors.toList());
		System.out.println(list6);
		
		  // via arraylist 
		Collection<Integer> list7 = no.stream().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(list7);
		//average of list 
	 OptionalDouble list8 = no.stream().mapToInt(a->a).average();
		System.out.println(list8.getAsDouble());
		
		System.out.println("------------------");
		Collections.sort(fruits);
		for(String str:fruits) {
			System.out.println(str);
		}
		
	}

}
