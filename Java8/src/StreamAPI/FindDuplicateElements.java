package StreamAPI;

 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElements {
		public static void main(String[] args) {
			List<Integer> li = Arrays.asList(1,2,2,3,4,4,5);
			System.out.println(Collections.max(li));
			System.out.println("------------------");
			//using distinct method
			li.stream().distinct().forEach(System.out::println);
			System.out.println("-------------------------------------");
			
			//remove duplicate elements using set
			Set<Integer> set2 =new HashSet(li);
			System.out.println(set2);
			
			System.out.println("-------------------");
			
			//remove duplicate elements using set
			Set<Integer> set =new HashSet();
			li.stream().filter(n->set.add(n)).forEach(System.out::println);
			System.out.println("-------------------");
			
			//print duplicate elements using set
			Set<Integer> set1 =new HashSet();
			li.stream().filter(n->!set1.add(n)).forEach(System.out::println);
			System.out.println("-------------------");
			
			//remove duplicate elements
			List<Integer> li1 =new ArrayList<>();
			for(Integer list : li) {
				if(!li1.contains(list)) {
					li1.add(list);
				}
			}
			System.out.println(li1);
		}
		
		
}
