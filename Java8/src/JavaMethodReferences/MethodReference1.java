package JavaMethodReferences;

import java.util.function.BiFunction;

interface test{
	void run();
}
public class MethodReference1 {
	
		static void running() {
			System.out.println("this is static method");
			
		}
		
		static int adding(int a,int b) {
		return (a+b);
			
		}
		
		
		public static void  main(String args[]) {
			//Referring static method
			test t = MethodReference1::running;
					//class			   //static method name
			
			//invoking interface method
			t.run();
			
			
			//using Lambda Expressions
			BiFunction<Integer,Integer,Integer> biFunctionLambda=(a,b)->MethodReference1.adding(a,b);
			System.out.println(biFunctionLambda.apply(10, 20));
			
			
			//Using Method reference
			BiFunction<Integer,Integer,Integer> biFunctionLambda1=MethodReference1::adding;
			System.out.println(biFunctionLambda1.apply(25, 25));
	
		}
	
}
