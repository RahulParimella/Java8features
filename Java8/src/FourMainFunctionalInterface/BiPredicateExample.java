package FourMainFunctionalInterface;

import java.util.function.BiPredicate;


public class BiPredicateExample {
		public static void main(String[] args) {
			BiPredicate<Integer,Integer> bipredicate =(x,y)->(x>10 && y >10);
			
			
			System.out.println(bipredicate.test(9, 12));
		}
}
