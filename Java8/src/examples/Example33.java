package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class table{
	void run(String str) {
		System.out.println(str);
	}
}
public class Example33 {
public static void main(String[] args) {
	table t=new table();
	t.run("abc");
	
	List<Integer>  integer =Arrays.asList(1,2,3,4,5,4,3,3,3,6);
	List<Integer> list=new ArrayList<>();
	for(Integer i:integer) {
		if(!list.contains(i)) {
			list.add(i);
		}
	}
	

	System.out.println(list);
//	Set<Integer> set =new HashSet<>(integer);
//	System.out.println(set);
	

	}
}

