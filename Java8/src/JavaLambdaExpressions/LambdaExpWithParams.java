package JavaLambdaExpressions;
interface Addable{
	int addition(int a,int b);
}
//class AddableImpl implements Addable{
//
//	@Override
//	public int addition(int a, int b) {
//		// TODO Auto-generated method stub
//		return (a+b);
//	}
//	
//}
public class LambdaExpWithParams {
	public static void main(String[] args) {
		
		//method 1
		
//		Addable add =( a,  b)-> {
//			// TODO Auto-generated method stub
//			return (a+b);
//		};
//		int result= add.addition(10, 40);
//		System.out.println(result);
		
		
		//method 2
		
		Addable add1 =(int a, int b)-> {
			// TODO Auto-generated method stub
			int c=(a+b);
			return c;
		};
		int res =add1.addition(50, 40);
		System.out.println(res);
		
		
	}
}
