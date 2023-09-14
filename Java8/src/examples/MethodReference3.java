package examples;

interface Drinkable{
	void drink();
}
public class MethodReference3 {
	public void eat() {
		System.out.println("eating");
	}
public static void main(String[] args) {
	MethodReference3 m =new MethodReference3();
	
	Drinkable d =m::eat;
	d.drink();
}
}
