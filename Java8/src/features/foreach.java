package features;

import java.util.ArrayList;
import java.util.List;

public class foreach {
public static void main(String args[]) {
	List<String> list =new ArrayList<String>();
	list.add("ram");
	list.add("raju");
	list.add("rajesh");
	list.forEach(
			(n)->System.out.println(n)
			);
	
}
}
