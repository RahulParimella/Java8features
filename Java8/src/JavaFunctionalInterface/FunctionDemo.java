package JavaFunctionalInterface;

import java.util.function.Function;

class FunctionImpl implements Function<String,Integer>{

	@Override
	public Integer apply(String s) {
		// TODO Auto-generated method stub
		return s.length();
	}
	
}
public class FunctionDemo {
public static void main(String[] args) {
	Function<String,Integer> function =new FunctionImpl();
	System.out.println(function.apply( "ramesh"));
	
	 Function<String,Integer> function1 =(String s) ->{
		// TODO Auto-generated method stub
		return s.length();
	};
	System.out.println(function1.apply("rajender"));
	
}

}
