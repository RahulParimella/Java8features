package WaysToConvertJava8StreamsToArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToArrays {
		public static void main(String[] args) {
			
			 // stream to object array in Java
			Stream<String> string =Stream.of("INR",
                    "USD", "GBP", "EUR", "JPY");
			System.out.println("Stream to object array in Java:");
			Object[] objectArray =string.toArray();
			System.out.println(Arrays.toString(objectArray));
			
			
			System.out.println("-------------------------------------------");
			
			
			// via - Stream.toArray() and lambda expression
			Stream<Integer> integer =Stream.of(2, 3, 5, 7, 11);
			System.out.println("Stream to Integer array using lambda expression in Java:");

			Integer[] array =integer.toArray(x->new Integer[x]);
			System.out.println(Arrays.toString(array));
			
			System.out.println("-------------------------------------------");
			
		     // via - method reference 
			Stream<String> string1 =Stream.of("AA","BB","CC","DD");
			System.out.println("Stream to Integer array using method reference in Java:");

			String[] str =string1.toArray(String[]:: new);
			System.out.println(Arrays.toString(str));
			

			System.out.println("-------------------------------------------");
			
			  // via arraylist 
			 Integer[] primes= {2, 3, 5, 7, 11};
			 ArrayList<Integer> listofprimes =new ArrayList<>(Arrays.asList(primes));
			 Collection<Integer> list = listofprimes.stream().collect(Collectors.toCollection(ArrayList :: new));
			 System.out.println(list);
			 
			

		}
}
