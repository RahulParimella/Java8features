package JavaFunctionalInterface;


//Functional Interface with one abstract method
interface MyFunctionalInterface {
 void doSomething();
}

//Another functional interface with one abstract method
interface AnotherFunctionalInterface {
 void doAnotherThing();
}

//Functional interface that extends two functional interfaces
interface CombinedFunctionalInterface extends MyFunctionalInterface, AnotherFunctionalInterface {
 // We can add additional abstract methods specific to this interface if needed
 void doCombinedThing();
}

//A class that implements CombinedFunctionalInterface
class MyClass implements CombinedFunctionalInterface {
 @Override
 public void doSomething() {
     System.out.println("Doing something...");
 }

 @Override
 public void doAnotherThing() {
     System.out.println("Doing another thing...");
 }

 @Override
 public void doCombinedThing() {
     System.out.println("Doing a combined thing...");
 }
}

public class MyFunctionalIntterface {
 public static void main(String[] args) {
     MyClass obj = new MyClass();
     obj.doSomething();
     obj.doAnotherThing();
     obj.doCombinedThing();
 }
}
