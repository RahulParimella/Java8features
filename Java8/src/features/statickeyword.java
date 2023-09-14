package features;

public class statickeyword {
	//static method
	static void staticmethod() {
		System.out.println("static method can be called without creating objects ");
	}
	//public method
	public void publicmethod() {
		System.out.println("public method can be called without creating objects");
	}
	public static void main(String args[]) {
		statickeyword sk=new statickeyword();
		sk.publicmethod();
		staticmethod();
	}
}
