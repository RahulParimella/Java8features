package JavaFunctionalInterface;

interface myinterface1{
	void run(String str);
}
public class functionalInterface2 {
	public static void main(String[] args) {
//		myinterface1 obj =(str)->{
//			System.out.println("hello "+ str);
//		};
//		obj.run("iam rahul");
		
		
		myinterface1 obj = (str)->
			System.out.println(str);
		obj.run("iam rahul parimella");
		

		
		
	}

}
