package examples;

import java.util.Arrays;
import java.util.List;

public class ListOfStrings {
public static void main(String[] args) {
	List<String> li =Arrays.asList("mahesh","suresh","rahesh");
	 li.stream().map(n->n.toUpperCase()).forEach(System.out::println);
	System.out.println("-----");
	li.stream().map(n->n.toLowerCase()).forEach(System.out::println);
	
	System.out.println("-----------------");
	li.replaceAll(n->n.toUpperCase());
	for(String str:li) {
		System.out.println(str);
	}
	System.out.println("----------");
	li.replaceAll(n->n.toLowerCase());
	for(String str:li) {
		System.out.println(str);
	}
	
}
}
