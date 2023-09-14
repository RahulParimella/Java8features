package StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class MaxElementInList {
public static void main(String[] args) {
	List<Integer> li =Arrays.asList(10,15,8,49,25,98,98,32,15);
	Optional<Integer> max = li.stream().max(Integer::compare);
	System.out.println(max.get());
	
	System.out.println("-------------");
	
	//maximum element
	System.out.println(Collections.max(li));
	System.out.println("-------------");
	//minimum element
	System.out.println(Collections.min(li));
}
}
