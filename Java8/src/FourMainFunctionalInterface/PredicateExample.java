package FourMainFunctionalInterface;

import java.util.function.Predicate;

public class PredicateExample {
		public static void main(String[] args) {
			Predicate<Integer> predicate =(x)->(x>10);
			System.out.println(predicate.test(11));
			System.out.println(predicate.test(10));
		}
}
