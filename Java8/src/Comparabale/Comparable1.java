package Comparabale;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable1 {
		public static void main(String[] args) {
			List<MobileComparable> mobiles = new ArrayList<MobileComparable>();
			MobileComparable mobile1 = new MobileComparable("samsung",50000);
			MobileComparable mobile2 = new MobileComparable("Xiaomi",55000);
			MobileComparable mobile3 = new MobileComparable("poco",25000);
	        mobiles.add(mobile1);
	        mobiles.add(mobile2);
	        mobiles.add(mobile3);
	        //descending order
	        System.out.println("Before Sorting : " + mobiles);
	        Collections.sort(mobiles,Collections.reverseOrder());
	        System.out.println("After Sorting : " + mobiles);
	        
	        System.out.println("----------------------------------------");
	        //Ascending order
	        System.out.println("Before Sorting : " + mobiles);
	        Collections.sort(mobiles);
	        System.out.println("After Sorting : " + mobiles);
		}
}
