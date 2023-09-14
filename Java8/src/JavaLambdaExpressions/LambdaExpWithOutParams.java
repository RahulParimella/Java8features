package JavaLambdaExpressions;


interface Shape{
	void draw();
}
public class LambdaExpWithOutParams {
		public static void main(String[] args) {
			
//			Shape rectangle =  ()-> {
//				// TODO Auto-generated method stub
//				System.out.println("Rectangle class : draw() method");
//			};
//			rectangle.draw();
//			
//			Shape square =()-> {
//				// TODO Auto-generated method stub
//				System.out.println("Square class : draw() method");
//			};
//			square.draw();
//			
//			Shape circle =()-> {
//				// TODO Auto-generated method stub
//				System.out.println("Circle class : draw() method");
//			};
//			circle.draw();
			
			
			
			
			//lambda expression as a method parameter
			Shape rectangle =  ()-> {
				// TODO Auto-generated method stub
				System.out.println("Rectangle class : draw() method");
			};
			//rectangle.draw();
			
			Shape square =()-> {
				// TODO Auto-generated method stub
				System.out.println("Square class : draw() method");
			};
			//square.draw();
			
			Shape circle =()-> {
				// TODO Auto-generated method stub
				System.out.println("Circle class : draw() method");
			};
			//circle.draw();
			
			print(rectangle);
			print(circle);
			print(square);
		}
		private static void print(Shape shape) {
			shape.draw();
		}
}




