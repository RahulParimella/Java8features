package OptionalClass;

import java.util.Optional;
import java.util.Scanner;

public class WithOptionalClass {
		public static void main(String[] args) {
		
			String[] str =new String[10];
			Scanner sc=new Scanner(System.in);
			
			Optional<String> checkNulls=Optional.ofNullable(str[5]);
			if(checkNulls.isPresent()) {
				String word =str[5].toLowerCase();
				System.out.println(word);
			}
			else {
				System.out.println("word is null");
			}
		}
}
