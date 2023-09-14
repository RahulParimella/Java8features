package features;


class Bike{
	static void run() {
		System.out.println("parent class is invoked");
	}
}
 class Methodoverriding extends Bike {
	 void run1() {
		 System.out.println("child class is invoked");
	 }
	 public static void main(String args[]) {
		 Methodoverriding mo =new Methodoverriding();
		 mo.run1();
		 Bike.run();
		 
//		 Bike mo1 =new Bike();//upcasting
//		 mo1.run();
	 }
}



