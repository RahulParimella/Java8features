package JavaLambdaExpressions;


interface Drawable{
	void draw();
}
public class LambdaExp2 {
public static void main(String args[]) {
	int width=10;
	//LE without parameter
	Drawable d=()->{
		System.out.println("drawing" + width);
	};
	d.draw();
}
}
