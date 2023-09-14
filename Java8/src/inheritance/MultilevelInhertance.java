package inheritance;

class Animal{
	void Test1() {
		System.out.println("eating");
	}
	
}
class Dog extends Animal{
	void Test2() {
		System.out.println("crying");

	}
}
class Cat extends Dog{
	void Test3() {
		System.out.println("barking");

	}
}
public class MultilevelInhertance {
public static void main(String[] args) {
	Cat cat = new Cat();
	cat.Test1();
	cat.Test3();
	cat.Test2();
}
}
