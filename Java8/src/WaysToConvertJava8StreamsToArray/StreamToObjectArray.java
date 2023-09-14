package WaysToConvertJava8StreamsToArray;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamToObjectArray {
		public static void main(String[] args) {
			Stream<String> loans = Stream.of("Car Loan", "Home Loan", "Personal Loan");

			Object [] objectArray = loans.toArray();	
			
			System.out.println(Arrays.toString(objectArray));
		}
}
