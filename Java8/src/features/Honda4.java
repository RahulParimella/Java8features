package features;

abstract class Honda {
	abstract void run();
}
class Honda4 extends Honda{  
void run(){System.out.println("running safely");}  
public static void main(String args[]){  
	Honda obj = new Honda4();  
 obj.run();  
}  
}  