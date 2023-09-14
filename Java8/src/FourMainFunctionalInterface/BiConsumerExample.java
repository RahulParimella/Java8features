package FourMainFunctionalInterface;

import java.util.function.BiConsumer;

public class BiConsumerExample {
		public static void main(String[] args) {
			BiConsumer<String, Integer> biconsumer =(x,y)->System.out.println("x :" +x + " "+ "y :" +y);
			biconsumer.accept("rahul", 22);
		}
}
