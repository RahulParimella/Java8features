package examples;

interface Runnable{
	int run(int a,int b);
}
public class WithLambdaExptwoParameter {
public static void main(String[] args) {
	
	
	//with lamda expression and without return statement
	Runnable r =(a,b)->(a+b);
	System.out.println(r.run(1, 2));
	
	//with return statement
	
	Runnable r1 =(a,b)->{
		return a+b;
	};
System.out.println(	r1.run(100, 200));

}
}
