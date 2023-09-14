package Exampleprojects;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class converttolist {
	public static void main(String[] args) {
		//36,56,48,12,8,56,84,92
		
	
		
		
		List<Integer> list =Arrays.asList(36,56,48,12,8,56,84,92);
		Integer maximum = list.stream().max(Integer :: compare).get();
		System.out.println(maximum);
	List<Integer> list1 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list1);
		
		 String inputStr = "quick brown fox jumps over lazy dog";
		 
		 
	        // reverse a String
	        StringBuilder resultReverse = new StringBuilder(inputStr);
	        String reversedStr = resultReverse.reverse().toString().trim();
	        System.out.println(reversedStr);

	}
}
