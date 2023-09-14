package HybridInheritance;

class Human{
	void displayHuman() {
		System.out.println("Method defined inside HumanBody class");
	}
}
interface Male{
	void show() ;
}
interface Female{
	void show();
}
public class SingleAndMultipleInheritance extends Human implements Male,Female{
public void show() {
	System.out.println("Implementation of show() method defined in interfaces Male and Female");
}
void displayChild() {
	System.out.println("Method defined inside Child class");  
}
public static void main(String args[])  
{  
	SingleAndMultipleInheritance obj = new SingleAndMultipleInheritance();  
System.out.println("Implementation of Hybrid Inheritance in Java");  
obj.show();  
obj.displayChild();  
}  
}
