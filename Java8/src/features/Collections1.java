package features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Collections1 {
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		Collections.sort(list);
		System.out.println(list);
		
		
		System.out.println("_----------------------------");
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		List<String> list1 =new ArrayList<String>();
		list1.add("mango");
		list1.add("orange");
		list1.add("banana");
		Collections.sort(list1);
		System.out.println(list1);
		
		
		System.out.println("_----------------------------");
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println(list1);
		System.out.println("_----------------------------");
		HashSet<Integer> str =new HashSet<>();
		str.add(1);
		str.add(1);
		System.out.println(str.size());
		System.out.println("_----------------------------");
		System.out.println(str.equals(str));
	}
		
}
