package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class conversion {
public static void main(String[] args) {
	int age=2;
	//integer to string
	String str= Integer.toString(age);
	System.out.println(str);
	//string to integer
	String str1="5";
	Integer age1 =Integer.valueOf(str1);
	System.out.println(age1);
	//list to arraylist
	List<Integer> li=Arrays.asList(1,2,34,5);
	System.out.println(li);
	//list to arrylist
	List<Integer> list =new ArrayList<>();
	list.add(1);
	list.add(2);

	  Object[] arr = list.stream().toArray();
	 System.out.println(Arrays.toString(arr));
	System.out.println("--------------");
	List<Integer> li1= Arrays.asList(1,2,2,3,4);
	Iterator<Integer> integer = li1.iterator();
	while(integer.hasNext()) {
		System.out.println(integer.next());
		int  i =(int) integer.next();
		if(i==1) {
			li1.remove(i);
		}
	}
}
}
