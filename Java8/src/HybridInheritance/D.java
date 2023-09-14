package HybridInheritance;

//Hierarchical and Single Inheritance
class A{
	void show() {
		System.out.println("class A");
	}
}
class B extends A{
	void Show() {
		System.out.println("class B");
	}
}
class C extends A{
	void show() {
		System.out.println("class C");
	}
}
public class D extends B{
public void show() {
	System.out.println("class D");
}
public static void main(String[] args) {
	D d=new D();
	d.show();

}
}
