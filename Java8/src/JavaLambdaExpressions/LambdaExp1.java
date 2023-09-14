package JavaLambdaExpressions;

@FunctionalInterface
interface Addinterface{
	void add(int a,int b);
	
}
public class LambdaExp1 {
	public static void main(String args[]) {
		
		
		//() ->{
		//sysout("hello");
			//}
		
		//Lambda expression with multiple parameter 
		Addinterface ai=(a,b)->{  //method is not defined
			System.out.println(a+b);
		};
		ai.add(1, 2);
	}
}


//without lambda expressions
//package JavaLambdaExpressions;
//
//
//interface Addinterface{
//	void add(int a,int b);
//	
//}
//public class LambdaExp1 implements Addinterface {
//	public static void main(String args[]) {
//		
//	
//		LambdaExp1	 l=new LambdaExp1();
//		l.add(1, 3);
//	}
//
//	@Override
//	public void add(int a, int b) {
//		// TODO Auto-generated method stub
//		System.out.println(a+b);
//	}
//
//
//}
//
