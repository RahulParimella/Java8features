package examples;
interface single{
	void draw(int a);
}
public class LamdaExpWithSingleParam {
public static void main(String[] args) {
		
	single d =(a)->{
		System.out.println(a);
		
	};
	d.draw(100);
	
	
	single d1=(a)->{
		
	};
}
}
