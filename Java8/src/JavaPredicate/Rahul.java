package JavaPredicate;

import java.util.function.Predicate;
public class Rahul {
	public static void main(String[] args) {
		Predicate<Integer> pre= t ->t%2==0;
			
			
	
System.out.println(pre.test(18));

}
}
