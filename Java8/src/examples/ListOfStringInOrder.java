package examples;

import java.util.Arrays;
import java.util.List;

public class ListOfStringInOrder {
public static void main(String[] args) {
	List<String> li =Arrays.asList("R","A","H","U","L");
//	li.stream().sorted().forEach(n->System.out.println(n));
	
	System.out.println("original Strings");
	
	for(String str:li) {
		System.out.println(str);
	}
	li.sort((n1,n2)->n1.compareToIgnoreCase(n2));
	System.out.println("sorted strings");
	for(String str:li) {
		System.out.println(str);
	}
	
}
}
