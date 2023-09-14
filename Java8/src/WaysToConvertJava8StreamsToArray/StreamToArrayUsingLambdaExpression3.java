package WaysToConvertJava8StreamsToArray;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamToArrayUsingLambdaExpression3 {
		public static void main(String[] args) {
			Stream<String> string =Stream.of("1","2","3","4");
			Stream<String> string1 =Stream.of("1","2","3","4");
			int[] integer1 =string1.mapToInt(Integer::parseInt).toArray();
			System.out.println(Arrays.toString(integer1));
			
			
			System.out.println("-----------------------------------------");
			
			
			//using lambda expression
			int[] integer =string.mapToInt(x->Integer.parseInt(x)).toArray();
			System.out.println(Arrays.toString(integer));
		}
}
