package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TerminalOperations {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,4,3,6);
		
		//max operator
		//type 1
		Optional<Integer> max = list.stream().max(Integer::compareTo);
		System.out.println(max.get());
		
		System.out.println("----------------------------");
		//type 2
		Optional<Integer> max1 = list.stream().max((n1,n2)->n1.compareTo(n2));
		System.out.println(max1.get());
		
		System.out.println("-----------------------------");
		
		
		//count operator
		long counts = list.stream().count();
		System.out.println(counts);
		
		
		System.out.println("-------------------------------");
		
		//findfirst operator
		Optional<Integer> findfirst = list.stream().findFirst();
		System.out.println(findfirst.get());
		
		System.out.println("----------------------------------");
		//findAny operator
		Optional<Integer> findany = list.stream().findAny();
		System.out.println(findany.get());
		
		
		System.out.println("-------------------------------------");
		
		
		//anymatch operator
		Object anymatch1 = list.stream().anyMatch(p->p.equals(100));
		System.out.println(anymatch1);
		Object anymatch2 = list.stream().anyMatch(p->p.equals(6));
		System.out.println(anymatch2);
		
		System.out.println("--------------------------------------");
		
		
		//collect operator
		 list.stream().sorted((n1,n2)->n1.compareTo(n2)).
		 collect(Collectors.toSet()).forEach(System.out::println);
		
		
	}
}
