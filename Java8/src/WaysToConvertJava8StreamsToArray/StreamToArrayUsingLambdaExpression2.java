package WaysToConvertJava8StreamsToArray;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamToArrayUsingLambdaExpression2 {
		public static void main(String[] args) {
			Stream<Integer> powerOfTen = Stream.of(1, 10, 100, 1000, 10000);

		
			int[] intArray = powerOfTen.mapToInt(n->n).toArray();
			System.out.println(Arrays.toString(intArray));
		}
}
