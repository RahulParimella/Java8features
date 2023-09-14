package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Mobile {
	int mobileId;
	String mobileName;
	double price;
	public Mobile(int mobileId, String mobileName, double price) {
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.price = price;
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return " [mobileId=" + mobileId + ", mobileName=" + mobileName + ", price=" + price + "]";
	}


}
public class Sorting2 {
		public static List<Mobile> getMobile(){
			ArrayList<Mobile> mobile=new ArrayList();
			mobile.add(new Mobile(54,"samsung",50000.00));
			mobile.add(new Mobile(58,"oppo",40000.00));
			mobile.add(new Mobile(62,"redmi",55000.00));
			mobile.add(new Mobile(66,"poco",70000.00));
			
			return mobile;
			
		}
		public static void main(String[] args) {
			
			//ascending order
			List<Mobile> list = getMobile().stream().sorted((o1,o2)->(int)(o1.getPrice() - o2.getPrice())).collect(Collectors.toList());
			list.forEach(System.out::println);
			System.out.println("----------------------");
			
			
			//descending order
			getMobile().stream().sorted(new Comparator<Mobile>() {

				@Override
				public int compare(Mobile o1, Mobile o2) {
					// TODO Auto-generated method stub
					return(int) (o2.getPrice() - o1.getPrice());
				}
			}).collect(Collectors.toList()).forEach(System.out::println);
			
			System.out.println("----------------------");
			
			//ascending order
			getMobile().stream().sorted(Comparator.comparingDouble(Mobile::getPrice))
			.collect(Collectors.toList()).forEach(System.out::println);
			
			System.out.println("---------------------------------------");
			
			//descending order
			getMobile().stream().sorted(Comparator.comparingDouble(Mobile::getPrice).reversed())
			.collect(Collectors.toList()).forEach(System.out::println);
			
			System.out.println("---------------------------------------");
			

			//ascending order
			getMobile().stream().sorted(Comparator.comparingDouble(Mobile::getPrice))
			.collect(Collectors.toList()).forEach(System.out::println);
			
			System.out.println("---------------------------------------");
			//ascending order by id
			getMobile().stream().sorted(Comparator.comparingInt(Mobile::getMobileId))
			.collect(Collectors.toList()).forEach(System.out::println);
			
			System.out.println("---------------------------------------");
			
			
			//ascending order by id
			getMobile().stream().sorted(Comparator.comparing(Mobile::getMobileName))
			.collect(Collectors.toList()).forEach(System.out::println);
			
			System.out.println("---------------------------------------");
			
			
			//descending order by id
			getMobile().stream().sorted(Comparator.comparing(Mobile::getMobileName).reversed())
			.collect(Collectors.toList()).forEach(System.out::println);
			
			
			System.out.println("----------------min()-----------------------");
			Optional<Mobile> list1 =getMobile().stream().min(Comparator.comparing(Mobile::getPrice));
			System.out.println(list1.get());
			
			
			System.out.println("----------------max()-----------------------");
			Optional<Mobile> list2 =getMobile().stream().max(Comparator.comparing(Mobile::getPrice));
			System.out.println(list2.get());
		}
		
}
