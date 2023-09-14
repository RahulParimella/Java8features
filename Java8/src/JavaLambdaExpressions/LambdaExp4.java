package JavaLambdaExpressions;
interface lambdaexp{
	void add(int a,int b);
}
public class LambdaExp4 {
	public static void main(String args[]) {
		//with lambda expression
		lambdaexp le=(a,b)->{
			System.out.println(a+b);
		};
		le.add(10,20);
		
		
		// Multiple parameters with data type in lambda expression  
		lambdaexp le1=(int a,int b)->{
			System.out.println(a*b);
		};
		le1.add(20, 10);
	}
}
