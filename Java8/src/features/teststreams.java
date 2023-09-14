package features;

import java.util.ArrayList;
import java.util.List;

public class teststreams {

public static void main(String args[]) {
	List<String> list =new ArrayList<String>();
	list.add("ram");
	list.add("raju");
	list.add("rajesh");
	long count = list.stream().filter(n->n.length()<5).count();
    System.out.println(count+" strings with length less than 5");
	
}
}
