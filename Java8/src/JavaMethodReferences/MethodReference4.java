package JavaMethodReferences;

interface Example{
	void run();
}
public class MethodReference4 {
	void something() {
		System.out.println("method is inviked");
	}
	
	static void running() {
		System.out.println("it is running");
	}
public static void main(String[] args) {
	
	//using Lambdaexpressions
	//reference to instance method
	MethodReference4 m =new MethodReference4();
	Example e =m :: something;
	e.run();
	
	//reference to static method
	Example e1 = MethodReference4 :: running;
	e1.run();
	
}
}
