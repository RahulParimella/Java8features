package StreamAPI;

import java.util.Arrays;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
		public static void main(String[] args) {
			//create a stream
			 Stream<String>stream1 = Stream.of("a","b","c");
			stream1.forEach(System.out::println);
			
			//create a stream from sources
		 List<String> list = Arrays.asList("ram","raju","ramesh","rakesh");
			Stream<String> stream2= list.stream();
			stream2.forEach(System.out::println);
			
			
			
			 Collection<String> collection = Arrays.asList("ram","raju","ramesh","rakesh");
			 Stream<String> stream3 = collection.stream();
			 stream3.forEach(n->System.out.println(n));
		
			 
			  HashSet<String> set = new HashSet<>(collection);
			 Stream<String> stream4 = set.stream();
			 stream4.forEach(System.out::println);
			 
			 String[] strArray = {"x","y","z"};
			 Stream<String> stream5 = Arrays.stream(strArray);
			 stream5.forEach(System.out::println);
			 
		}
}
