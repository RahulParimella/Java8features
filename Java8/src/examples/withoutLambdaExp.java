package examples;

interface Drawable{
	void draw();
}



public class withoutLambdaExp {
			public static void main(String[] args) {
				int a=10,b=20;
				Drawable d =new Drawable() {
					public void draw() {
						int sum =a+b;
						System.out.println("drawing:" + sum);
					}
				};
				d.draw();
				
			
				
				
			}
}
