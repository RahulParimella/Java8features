package StreamAPI;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListToHashSet {
	public static void main(String[] args) {
		ArrayList<String> al =new ArrayList<>();
		al.add("mango");
		al.add("orange");
		al.add("banana");
		al.add("mango");
		al.add(null);
		al.add(null);
		HashSet<String> hs =new HashSet<String>();
		al.forEach(n->hs.add(n));
		for(String s :hs) {
			System.out.println(s);
		}
		
		System.out.println("-----------------------------------------");
		hs.addAll(al);
		for(String str :hs) {
			System.out.println(str);
		}
		System.out.println("-----------------------------------------");
		for(String str :al) {
			hs.add(str);
		}
		System.out.println(hs);
	}
}
