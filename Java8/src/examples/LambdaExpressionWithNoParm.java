package examples;
interface eatable{
	void eat();
}

public class LambdaExpressionWithNoParm {
public static void main(String[] args) {
	eatable e=()->{
		System.out.println("eating");
	};
	e.eat();
	
	
}
}
