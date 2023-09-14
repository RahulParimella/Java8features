package inheritance;


class A{
	void Test1() {
		System.out.println("parent class is invoked");
	}
}
class B extends A{
	void Test2() {
		System.out.println("child class is invoked");
	}
}
public class SingleInhertance {
	public static void main(String[] args) {
		B b =new B();
		b.Test1();
		b.Test2();
	}
}
