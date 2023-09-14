package WaysToConvertJava8StreamsToArray;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamToArrayUsingMethodReference {
		public static void main(String[] args) {
			Stream<String> string =Stream.of("London", "Paris", "Tokyo");
			String[] cities =string.toArray(String[]::new);
			System.out.println(Arrays.toString(cities));
		}
}
