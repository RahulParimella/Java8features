package StreamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class example {
	public static void main(String[] args) {

		List<Integer> list =Arrays.asList( 2,3,2,3,1,1);
		list.stream().sorted().forEach(System.out::println);
		System.out.println("---------");
		list.stream().sorted((n1,n2)->n2.compareTo(n1)).forEach(System.out::println);
		System.out.println("---------");
		list.stream().distinct().forEach(System.out::println);
		System.out.println("---------------");
		
		Set<Integer> s =new HashSet();
		
		list.stream().filter(n-> s.add(n)).forEach(System.out::println);
	
	
	}
	
}
