package FourMainFunctionalInterface;

import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> string=(s)-> System.out.println(s.toUpperCase());
		string.accept("rahul");
	}
}
