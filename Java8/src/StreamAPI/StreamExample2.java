package StreamAPI;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample2 {
	public static void main(String args[] ){
		ArrayList<String> al =new ArrayList<String>();
		al.add("apple");
		al.add("two");
		al.add("five");
		al.add("one");
		
		
		 //min operator return smallest element in the stream 
		//prints apple because "a" is the min element 
		Optional<String> Stream = al.stream().min((val1,val2)->{
			return val1.compareTo(val2);
		});
		System.out.println(Stream.get());
		
		
		//max operator 
		//prints two because "t" is the max element
		Optional<String> Stream1 = al.stream().max((val1,val2)->{
			return val1.compareTo(val2);
		});
		System.out.println(Stream1.get());
		
		
	}
	
}
