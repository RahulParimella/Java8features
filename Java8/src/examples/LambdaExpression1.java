package examples;



interface Addinterface{
	void add(int a,int b);
	
}
public class LambdaExpression1 {
	public static void main(String args[]) {
		
		//Lambda expression with multiple parameter 
		Addinterface ai=(a,b)->{  //method is not defined
			System.out.println(a+b);
		};
		ai.add(1, 2);
	}
}
