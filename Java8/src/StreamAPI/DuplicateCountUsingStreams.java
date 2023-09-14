package StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCountUsingStreams {
	public static void main(String[] args) {
		List<Integer> li =Arrays.asList(2,3,4,4,3,2,1);
		//Map<Integer, Long> count =li.stream().collect(Collectors.toMap(Function.identity(), n->1L,Long::sum));
		//count.forEach((key,value)->System.out.println("key:"+key +"\t count:" +value));
		
		Map<Integer, Integer> count =li.stream().collect(Collectors.toMap(Function.identity(), n->1,Integer::sum));
		count.forEach((key,value)->System.out.println("key:"+key +"\t count:" +value));
		System.out.println("-----------------------");
		Map<Integer,Integer> dupcount =li.stream().collect(Collectors.toMap(Function.identity(),
				n->1,Integer::sum));
		dupcount.forEach((key,value)->System.out.println("key:"+key +"\t count:" +value));
	}
}

