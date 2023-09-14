package JavaMethodReferences;

interface lenovo{
	void say();
}
public class MethodReference2 {
	void something() {
		System.out.println("non static method");
	}
	
	void running() {
		System.out.println("medthod reference is used");
	}
	
	public static void main(String args[]) {
		
		
		MethodReference2 mr=new MethodReference2();
		
		//referring non static method using reference
		lenovo l =mr ::something;//mr-object something-method    //containgobject :: instance methodname
		
		//calling interface
		l.say();
		
		lenovo l3 =mr :: running;
		l3.say();
		
		//referring non static method using anonymous object
		lenovo l2 =new MethodReference2()::something;
		
		//calling interface
		//l2.say();
		
		
		//using lambda expression
		
		 lenovo ex =()->mr.something();
	      ex.say();
	      
	      //using method reference
	      lenovo ex1 =mr::running;
		ex1.say();
	}
}
