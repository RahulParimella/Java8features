package JavaLambdaExpressions;



public class LambdaExpression5 {
	
	public static void main(String[] args) {
		LambdaExpressionInterface5 a1 =(a,b)->{
			System.out.println(a+b);
		};
		a1.sum(1,2);
	}
}
