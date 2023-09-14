package examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenAndOdd {
public static void main(String[] args) {
	List<Integer> li=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
	List<Integer> even = li.stream().filter(n->n%2==0).collect(Collectors.toList());
	System.out.println("even numbers:");
	for(int n :even) {
		System.out.println(n);
	}
	System.out.println("odd numbers");

	List<Integer> odd = li.stream().filter(n->n%2!=0).collect(Collectors.toList());
	for(int n :odd) {
		System.out.println(n);
	}
	
}
}
