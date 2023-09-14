package examples;

interface lenovo{
	default void laptop() {
		System.out.println("laptop1");
	}
}
interface legion extends lenovo{
	void laptop1(String msg) ;
	
}
public class FunctionalInterface2 implements legion{
public static void main(String[] args) {
	FunctionalInterface2 f2 =new FunctionalInterface2();
	f2.laptop1("legion laptop");
	f2.laptop();
}

@Override
public void laptop1(String msg) {
	// TODO Auto-generated method stub
	System.out.println(msg);
	
}
}
