package JavaPredicate;

import java.util.function.Predicate;

public class JavaPredicateExample {
	 
    public static void main(String[] args) {
        Predicate<Integer> predicate = i -> i % 2==0;
        boolean even = predicate.test(200);
        System.out.println("even: "+even);
    }
}

