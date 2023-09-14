
 //write a program accept a number series 22,322,607,70, written only two string numbers
package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;


import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String args[]) {
		List<Integer> list =Arrays.asList( 1,2,3);
		
		Stream<Integer> newStream = list.stream();//list is converted to stream
		
		Stream<Integer> filteredresult = newStream.filter(x->x.toString().endsWith("1"));//filter
		
		filteredresult.forEach(x->System.out.println(x));
		
		OptionalDouble average = list.stream().mapToInt(a->a).average();
		System.out.println(average.getAsDouble());
		ArrayList<Integer> l1 =new ArrayList<>();
		l1.add(11);
		l1.add(22);
		l1.add(33);
		l1.add(21);
		l1.add(31);
		l1.add(42);
		ArrayList<Integer> l2 =new ArrayList<>();
		l2.add(11);
		l2.add(22);
		l2.add(33);
		l2.add(22);
		l2.add(34);
		l2.add(45);
		l1.retainAll(l2);
		System.out.println("similar elements are:"+l1);
	}
}
