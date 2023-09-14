package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickUpSameCharacters {
	public static void main(String[] args) {
		List<String> str =Arrays.asList("you","exe","ooo","xyz","zzz");
	
		str.stream().toList().forEach(n->n.chars());
		}
}

