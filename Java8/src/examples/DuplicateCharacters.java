package examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateCharacters {  
    
    	public static void main(String[] args) {
    		
    		
    		String str ="My name is sampath";
    		String str1[]=str.split(" ");
    		
    		System.out.println(str1.length);
    		String ans ="";
    		for(int i=str1.length-1;i>=0;i--) {
    			ans +=str1[i] +" ";
    			
    		}
    		System.out.println("reversed string:"+ans);
    		System.out.println("--------------------------------");
    		
    		
    		List<Integer> list =Arrays.asList( 11,22,31,45,51,65,61);
    		 Stream<Integer> stream = list.stream().filter(n->n.toString().endsWith("1"));
    		 stream.forEach(System.out::println);
    		 System.out.println("---------------------------------------");
    		 
    		 Optional<Integer> stream1 = list.stream().findFirst();
    		 System.out.println(stream1.get());
    		 System.out.println("---------------------------------------");
    		 
    		 long stream2 = list.stream().count();
    		 System.out.println(stream2);
    		 System.out.println("---------------------------------------");
    		
    		 Optional<Integer> stream3 = list.stream().max((n1,n2)->n1.compareTo(n2));
    		 System.out.println(stream3.get());
    		 System.out.println("---------------------------------------");
    		 
    		 List<Integer> stream4 = list.stream().sorted((n1,n2)->n2.compareTo(n1)).collect(Collectors.toList());
    		 System.out.println(stream4);
    		 System.out.println("---------------------------------------");
    		 
    		 	double stream5 = list.stream().mapToLong(m->m).average().getAsDouble();
    		 System.out.println(stream5);
    		 
    		 
    		 System.out.println("----------------------------------");
    			List<Integer> list2 =Arrays.asList(  11,14,13,45,20,-20);
    			list2.stream().filter(n1->n1.intValue()>0).sorted(Comparator.naturalOrder()).forEach(System.out::println);
    		
   }  
}
